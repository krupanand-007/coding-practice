package splitwise.service;

import splitwise.model.User;

public class UserService {

    public User createUser(String name, String email, String phone){
        return new User(name, email, phone);
    }
}
