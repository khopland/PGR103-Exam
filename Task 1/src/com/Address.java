package com;

public class Address {
    private String street, postcode, country;

    public Address() {
        this("default street", "default postcode", "default country");
    }

    public Address(String street, String postcode, String country) {
        this.street = street;
        this.postcode = postcode;
        this.country = country;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Street: " + street + '\n' +
                "Postcode: " + postcode + '\n' +
                "Country: " + country + '\n';
    }
}
