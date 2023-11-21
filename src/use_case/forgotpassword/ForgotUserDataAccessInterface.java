package use_case.forgotpassword;

import entity.User;

public interface ForgotUserDataAccessInterface {
    boolean existByName(String identifier);
    void saveAccountPassword(User user, String password);

    User getUser(String username);
}
