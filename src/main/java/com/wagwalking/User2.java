package com.wagwalking;

public class User2 extends  ParentsUsers {

    private String address;
    private String apt;
    private String city;
    private String state;
    private String zipcode;



    public User2(String email,String password,String firstName,String lastName,String cellPhone,String address, String apt, String city,String state, String zipcode) {
        super(email, password, firstName, lastName, cellPhone);
        this.address = address;
        this.apt = apt;
        this.city = city;
        this.state =  state;
        this.zipcode = zipcode;

    }
    public String getAddress (){
        return address;
    }
    public String getApt() {
        return apt;
    }
    public String getCity () {
        return city;
    }
    public String getState () {
        return state;

    }
    public String getZipcode(){
        return zipcode;
    }


}
