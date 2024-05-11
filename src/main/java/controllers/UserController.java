package controllers;
import models.interfaces.IViewableUser;
import models.UserModel;


public class UserController {
    public UserModel CreateUser(int Id, String Name) {
        UserModel m = new UserModel();
        m.SetId(Id);
        m.SetName(Name);

        return m;
    }

    public IViewableUser GetUserName() {
        UserModel u = new UserModel();
        u.SetName("John Due");

        return u;
    }
}
