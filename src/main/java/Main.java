import singleton.User;

public class Main {


    public static void main(String[] args) {
        User user = User.getUser();
        System.out.println(user.name);
    }
}
