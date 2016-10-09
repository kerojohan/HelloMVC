package cat.uoc.devops.models;

public class User {

    private String name;

    public User() {
        this.name = null;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
