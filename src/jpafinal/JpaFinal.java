package jpafinal;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpafinal.domain.SoccerPlayer;

public class JpaFinal {

    static Scanner sc = new Scanner(System.in);

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

    public static void main(String[] args) {
       addSoccerPlayer();
        // removeSoccerPLayer();
//updateSoccerPLayer();
//getAllPLayers();

    }

    public static void addSoccerPlayer() {

        EntityManager em = emf.createEntityManager();
        System.out.print("what is the First Name of the player? ");
        String Firstname = sc.nextLine();

        System.out.print("what is the Last Name of the player? ");
        String Lastname = sc.nextLine();

        System.out.println("What is the age ?");
        int Age = sc.nextInt();
        sc.nextLine();

        System.out.println("WHat is the shoe size?");
        float ShoeSize = sc.nextFloat();
        sc.nextLine();

        System.out.println("What is the Jersey nr ?");
        int JerseyNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("what is the Name of the Football Clubb? ");
        String FootballClubb = sc.nextLine();

        System.out.print("what is the address of the player? ");
        String Address = sc.nextLine();

        System.out.print("what is the Playing Position of the player? ");
        String PlayingPosition = sc.nextLine();

        System.out.println("What is the Salary ?");
        double Salary = sc.nextDouble();
        sc.nextLine();

        //    public SoccerPlayer(Long id, String Firstname, String Lastname, int Age,
        // float ShoeSize, int JerseyNumber, FootballClubb footballClubb, List<Address> addresses) {
        SoccerPlayer s = new SoccerPlayer(Firstname, Lastname, Age, ShoeSize, JerseyNumber, FootballClubb, Address, PlayingPosition, Salary);

        em.getTransaction().begin();
        em.persist(s);

        em.getTransaction().commit();
        em.close();

    }

    public static void removeSoccerPLayer() {
        EntityManager em = emf.createEntityManager();

        System.out.print("What is the id of the Soccerplayer? : ");
        Long id = sc.nextLong();
        sc.nextLine();

        SoccerPlayer s = em.find(SoccerPlayer.class, id);
        // Song S = em.find(Song.class, id);
        // List<SoccerPlayer> soccerPlayer = s.getId();
        em.getTransaction().begin();
        //for (SoccerPlayer soccerPlayer1 : soccerPlayer) {
//            em.remove(soccerPlayer1);
//        }

        em.remove(s);

        em.getTransaction().commit();

        em.close();
    }

    public static void updateSoccerPLayer() {
        EntityManager em = emf.createEntityManager();

        System.out.print("What is the id of the Soccerplayer? : ");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.print("what is the New First Name of the player? ");
        String Firstname = sc.nextLine();

        System.out.print("what is the New Last Name of the player? ");
        String Lastname = sc.nextLine();

        System.out.println("What is the New age ?");
        int Age = sc.nextInt();
        sc.nextLine();

        System.out.println("WHat is the New shoe size?");
        float ShoeSize = sc.nextFloat();
        sc.nextLine();

        System.out.println("What is the New Jersey nr ?");
        int JerseyNumber = sc.nextInt();
        sc.nextLine();

        SoccerPlayer s = em.find(SoccerPlayer.class, id);

        em.getTransaction().begin();
        s.setFirstname(Firstname);
        s.setLastname(Lastname);
        s.setAge(Age);
        s.setShoeSize(0);
        s.setJerseyNumber(JerseyNumber);

        em.getTransaction().commit();

        em.close();
    }

//    public static List<SoccerPlayer> getAllPLayers() {
//        EntityManager em = emf.createEntityManager();
//        List<SoccerPlayer> soccerPlayer = em.createNativeQuery(Select * from SoccerPlayer, SoccerPlayer.class).getAllPLayers();
//        
//        for (SoccerPlayer s : soccerPlayer) {
//            System.out.println("soccerPlayer");
//            
//        }
//        return soccerPlayer;
//
//    }


    /* public static List<Artist> getAllArtists() {
        EntityManager em = emf.createEntityManager();
        List<Artist> artists = em.createNativeQuery("Select * from Artist", Artist.class).getResultList();

        for (Artist artist : artists) {
            System.out.println(artist);
        }
        return artists;*/

}