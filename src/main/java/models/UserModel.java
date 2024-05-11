package models;

import models.interfaces.IViewableUser;

public class UserModel implements IViewableUser {
    private int Id;
    private String Name;
    
    public void SetId(int Id) {
        this.Id = Id;
    }

    public int GetId() {
        return this.Id;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public String GetName() {
        return this.Name;
    }
}
