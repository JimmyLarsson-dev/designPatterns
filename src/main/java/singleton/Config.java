package singleton;

public class Config {

    public String someInfo;
    public int size;
    private static Config config;

    private Config() {
        this.someInfo = "thisApp";
        this.size = 32;
    }

    static {
        try {
            config = new Config();
        } catch (Exception e) {
            throw new RuntimeException("could not create singleton instance");
        }
    }

    public static Config getUser() {
        return config;
    }

    public String getSomeInfo() {
        return someInfo;
    }

    public void setSomeInfo(String someInfo) {
        this.someInfo = someInfo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
