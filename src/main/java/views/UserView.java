package views;

import controllers.UserController;
import models.UserModel;

public class UserView {
    public void Render() {
        UserController c = new UserController();
        c.GetUserName();

        UserModel m = new UserModel();
    }
}
