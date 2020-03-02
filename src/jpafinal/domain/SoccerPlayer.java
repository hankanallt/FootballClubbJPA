
package jpafinal.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * @author mrgum
 */
@NamedQueries({
    
    //@NamedQuery(name="SoccerPlayer.getAllPLayers" , query="Select * From SoccerPlayer")
    
})


@Entity
public class SoccerPlayer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String Firstname;

    @Basic
    private String Lastname;

    @Basic
    private int Age;

    @Basic
    private float ShoeSize;

    @Basic
    private int JerseyNumber;

    @ManyToOne
    private FootballClubb footballClubb;

    @OneToMany
    private List<Address> addresses;
/*@OneToMany(mappedBy = "singer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList();
*/
       

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return this.Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public float getShoeSize() {
        return this.ShoeSize;
    }

    public void setShoeSize(float ShoeSize) {
        this.ShoeSize = ShoeSize;
    }

    public int getJerseyNumber() {
        return this.JerseyNumber;
    }

    public void setJerseyNumber(int JerseyNumber) {
        this.JerseyNumber = JerseyNumber;
    }

    public FootballClubb getFootballClubb() {
        return this.footballClubb;
    }

    public void setFootballClubb(FootballClubb footballClubb) {
        this.footballClubb = footballClubb;
    }

    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<>();
        }
        return this.addresses;
    }
    /*---------------------------------*/
        
    

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        getAddresses().add(address);
    }

    public void removeAddress(Address address) {
        getAddresses().remove(address);
    }
    
    public void addSoccerPlayer(Address address){
        addresses.add(address);
        address.setStreet(null);
        address.setCity(null);
        address.setCountry(null);
    }

    public SoccerPlayer() {
    }

    public SoccerPlayer(String Firstname, String Lastname, int Age, float ShoeSize, int JerseyNumber, String FootballClubb, String Address, String PlayingPosition, double Salary) {
    }
   
 

    public SoccerPlayer(Long id, String Firstname, String Lastname, int Age, float ShoeSize, int JerseyNumber, FootballClubb footballClubb, List<Address> addresses) {
        this.id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Age = Age;
        this.ShoeSize = ShoeSize;
        this.JerseyNumber = JerseyNumber;
        this.footballClubb = footballClubb;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Age=" + Age + ", ShoeSize=" + ShoeSize + ", JerseyNumber=" + JerseyNumber + ", FootballClubb=" + footballClubb + ", addresses=" + addresses + '}';
    }

}