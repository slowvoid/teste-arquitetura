package views;

import controllers.UserController;

public class UserView {
    public void Render() {
        UserController c = new UserController();
        c.GetUserName();
    }
}
