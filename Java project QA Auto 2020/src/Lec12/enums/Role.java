package Lec12.enums;

public enum Role {

    ADMIN(0), GUEST(1),  AUTHUSER(2);

    private int permission;

    Role(int permission){
        this.permission = permission;
    };

    public int getPermission() {
        return permission;
    }
}
