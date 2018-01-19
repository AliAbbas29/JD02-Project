package by.itacademy;

public class UserService {
    public String getDefaultUsername() {
        return new UserDAO().getDefaultUsername();
    }
}
