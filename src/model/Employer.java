package model;

public class Employer {
    int id;
    String name;
    String phone;
    String state;
    String docum;
    String user;

    public Employer() {
    }

    public Employer(int id, String name, String phone, String state, String docum, String user) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.state = state;
        this.docum = docum;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDocum() {
        return docum;
    }

    public void setDocum(String docum) {
        this.docum = docum;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
