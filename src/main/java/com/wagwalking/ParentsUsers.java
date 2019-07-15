package com.wagwalking;

public abstract class ParentsUsers {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String cellPhone;

    public ParentsUsers(String email,String password,String firstName,String lastName,String cellPhone)  {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellPhone() {
        return cellPhone;
    }
}


