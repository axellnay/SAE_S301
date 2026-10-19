package models;

public class User {

    private String firstName;
    private String lastName;
    private String mail;

    protected User(String firstName, String lastName, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }
    
    
}