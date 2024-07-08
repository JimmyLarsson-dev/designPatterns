package Factory;

public class UnprivilegedUser extends User{

    private String name;
    private String email;
    private String role;

    public UnprivilegedUser(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getRole() {
        return null;
    }
}
