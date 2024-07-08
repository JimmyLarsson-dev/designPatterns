package singleton;

public class User {

    public String name;
    public int age;
    private static User user;

    private User() {
        this.name = "jimmy";
        this.age = 45;
    }

    static {
        try {
            user = new User();
        } catch (Exception e) {
            throw new RuntimeException("could not create singleton instance");
        }
    }

    public static User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
