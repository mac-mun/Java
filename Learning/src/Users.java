public class Users {

    String userName;
    String email;
    int age;

    Users() {
        this.userName = "Guest";
        this.email = "not provided";
        this.age = 0;
    }

    Users(String userName) {
        this.userName = userName;
        this.email = "Notprovided";
        this.age = 0;

    }

    Users(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.age = 0;

    }

    Users(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;

    }

}
