package za.co.cmair.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by marc35 on 26/04/2017.
 */
@Embeddable
public class Address {
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
