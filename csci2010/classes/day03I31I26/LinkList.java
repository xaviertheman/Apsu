package csci2010.classes.day03I31I26;

public class LinkList {
    private ListNode head;

    public LinkList(ListNode head) {
        this.head = head;
    }

    public LinkList() {
        this.head = null;
    }

     /**
      * Adds a node conating the data at the at the start of the list
      * @param data
      */
    public void addnodeTOStart(String data){
        head = new ListNode(data, head);
    }

    public void showList(){
        ListNode position = head;
        while (position!=null) {
            System.out.println(position.getData());
            position = position.getLink();

        }
    }

    private ListNode find(String target){
        boolean found =false;

        ListNode position = head;
        while (!found&& position!= null) {
            String dataAtPostion = head.getData();
            if (dataAtPostion.equals(target)) {
                found = true;
            }else{
                position = position.getLink();
            }
        }
        return position;
    }

    public boolean onList(String target){
        return find(target) != null;
    }
    
    public int length(){
        int count = 0;
        ListNode position = head;
        while (position!=null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public void deleteHeadNode(){
        if(head!=null){
            head = head.getLink();
        }else{
            System.out.println("deleting from an empty list");
            System.exit(0);
        }
    }
    
}
