package csci2010.classes.day04I02I26;

public class LinkedList2<E>{
    private ListNode head;

    public LinkedList2(){
        head = null;
    }

    public void addnodeTOStart(E data){
        head = new ListNode(data, head);
    }

    public void showList(){
        ListNode position = head;
        while (position!=null) {
            System.out.println(position.getData());
            position = position.getLink();

        }
    }

    private ListNode find(E target){
        boolean found =false;

        ListNode position = head;
        while (!found&& position!= null) {
            E dataAtPostion = head.getData();
            if (dataAtPostion.equals(target)) {
                found = true;
            }else{
                position = position.getLink();
            }
        }
        return position;
    }

    public boolean onList(E target){
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

    private class ListNode {
        private E data;
        private ListNode link;

        public ListNode(E data, ListNode link) {
            this.data = data;
            this.link = link;
        }

        public ListNode(){
            this.data = null;
            this.link = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public ListNode getLink() {
            return link;
        }

        public void setLink(ListNode link) {
            this.link = link;
        }
    }
}
