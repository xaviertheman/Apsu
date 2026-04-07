package csci2010.classes.day04I02I26;


public class Test2 {
    public static void main(String[] args) {
        LinkedList2<String> list = new LinkedList2<String>();
        list.addnodeTOStart("One");
        list.addnodeTOStart("Two");
        list.addnodeTOStart("Three");

        System.out.println("The List had "+ list.length()+" Nodes in the list");

        list.showList();
    }
}
