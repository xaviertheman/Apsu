package csci2010.classes.day03I31I26;

public class StringListLinkedDemo {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addnodeTOStart("One");
        list.addnodeTOStart("Two");
        list.addnodeTOStart("Three");

        System.out.println("The List had "+ list.length()+" Nodes in the list");

        list.showList();
    }
}
