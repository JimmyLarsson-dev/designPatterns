import Factory.User;
import Factory.UserFactory;
import singleton.Config;

public class Main {


    public static void main(String[] args) {
        Config config = Config.getUser();
        System.out.println(config.someInfo);
        User user = UserFactory.getUser(true, "jimmy", "jimmy@mail.com");
        System.out.println(user.getEmail());

    }
}
