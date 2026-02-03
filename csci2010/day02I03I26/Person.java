package csci2010.day02I03I26;



public class Person {
    
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writePerson(){
        System.out.println(this.name);
    }

    public boolean hasSameName(Person other){
        if(this.name == other.getName()){
            return true;
        }else{
            return false;
        }
    }

}
