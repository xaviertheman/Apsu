package csci2010.assignment4;

public class Player {
 /**
 *CSCI 2010 assignment 4
 * @ xavier whitlow
 * Course: CSCI 1010 – Assignment  4
 */
    private String name;
    private int age;
    private int rank;
    private String homeCountry;
    
    public Player(String name, int age, int rank, String homeCountry) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.homeCountry = homeCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }
    
    public String toString() {
        
        return "\nName: "+ name+"\nAge: "+age+"\nRank: "+rank+"\nCountry: "+homeCountry;
    }
}
