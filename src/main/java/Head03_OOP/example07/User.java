package Head03_OOP.example07;

public class User {
    protected String userId;
    protected String Name;

    public User(String userId, String Name) {
        this.userId = userId;
        this.Name = Name;
    }

    public void printUserInfo() {
        System.out.print("ID: " + userId + " 이름: " + Name);
    }
}

