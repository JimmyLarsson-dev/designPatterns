import singleton.Config;

public class Main {


    public static void main(String[] args) {
        Config config = Config.getUser();
        System.out.println(config.someInfo);
    }
}
