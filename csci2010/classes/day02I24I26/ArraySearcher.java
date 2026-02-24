package csci2010.classes.day02I24I26;

public class ArraySearcher {
    private int [] a;

    public ArraySearcher(int[] a) {
        this.a = a;
    }

   public int find(int target){
    return binarysearch(target, 0, a.length-1);
   } 

    private int binarysearch(int target, int first, int last){
        int result;
        
        
        if (first > last){
            result = 0;
        }else {
            int mid = (first + last)/2;
            if (target == a[mid]) {
                result = mid;
            }else if (a[mid]> target) {
                result = binarysearch(target, first, mid-1);
            }else {
                result = binarysearch(target, mid+1, last);
            }
        }
        return result;
    }
    
       
    
    
}
