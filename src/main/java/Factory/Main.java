package Factory;

public class Main {

    public static void main(String[] args) {
        User user = UserFactory.getUser(true, "jimmy", "jimmy@mail.com");
        System.out.println(user.getEmail());
    }

}
