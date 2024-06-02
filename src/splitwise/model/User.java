package splitwise.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.id= UUID.randomUUID();
        this.name=name;
        this.email=email;
        this.phone =phone;
    }
}
