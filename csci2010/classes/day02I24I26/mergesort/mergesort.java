package day02I24I26.mergesort;

public class mergesort {

    /**  
     * precondition every indexed variable of array must have value
     * post condition returns a orderarray
     */
    public static void sort(int[] a){
        if (a.length>=2) {
            int halflength = a.length /2;
            int[] firsthalf = new int[halflength];
            int[] lasthalf = new int[a.length - halflength];
            divide(a, firsthalf, lasthalf);
            sort(firsthalf);
            sort(lasthalf);
        }
    }

    /**
     * precondition: a.length = firsthalf.length + lasthalf.length
     * post conditon all of the elements of a are divided between the arrays first and last half 
     * @param a
     * @param firsthalf
     * @param lasthalf
    */
    private static void divide(int[] a, int[] firsthalf, int[] lasthalf){
        for (int i = 0; i < firsthalf.length; i++) {
            firsthalf[i] = a[i];
        }
        for (int j = 0; j < lasthalf.length; j++) {
            lasthalf[j] = a[firsthalf.length +1];
        }
    }
}
