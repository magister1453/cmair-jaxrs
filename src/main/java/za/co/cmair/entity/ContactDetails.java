package za.co.cmair.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by marc35 on 26/04/2017.
 */
@Embeddable
public class ContactDetails {
    @Column(name = "email")
    private String email;
    @Column(name = "cell_phone")
    private String cellPhone;
    @Column(name = "home_phone")
    private String homePhone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
}
