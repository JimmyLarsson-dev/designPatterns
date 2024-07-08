package Factory;

public class UserFactory {

    public static User getUser(boolean isAdmin, String name, String email) {
        if(isAdmin) {
            return new AdminUser(name, email, "admin");
        }
        return new UnprivilegedUser(name, email, "peon");
    }
}
