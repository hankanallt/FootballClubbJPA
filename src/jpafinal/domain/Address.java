
package jpafinal.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String Street;

    @Basic
    private String City;

    @Basic
    private String Country;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return this.Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Address() {
    }

    public Address(Long id, String Street, String City, String Country) {
        this.id = id;
        this.Street = Street;
        this.City = City;
        this.Country = Country;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", Street=" + Street + ", City=" + City + ", Country=" + Country + '}';
    }
    
    

}