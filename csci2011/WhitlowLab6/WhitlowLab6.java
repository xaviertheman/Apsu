package csci2011.WhitlowLab6;

import csci2010.assignment1.playlist;

public class WhitlowLab6 {
    private static void displayArray(int[] array, int index){
        if (index == array.length) {
            System.out.println();
        }else{
            System.out.printf("%3d",array[index]);
            displayArray(array, index+1);
        }
    }

    public static void displayArray(int[] array){
        displayArray(array, 0);
    }

    public static void displayReverse(String para){
        if (para.length()==0) {
            
        }else{
            displayReverse(para.substring(1));
            System.out.print(para.charAt(0));
        }

    }

    public static int factorial(int num){
        if (num<=1) {
            return 1;
        }else{
            return num * factorial(num -1);
        }
    }

    private static void displayArrayIndexes(int[] array,int current, int first, int middle, int last){
        String result = "";
        if (current == first) {
            result +="F";
        }if (current == middle) {
            result +="M";
        }if (current == last) {
            result +="L";
        }
        System.out.printf("%3S",result);
        if (current < last) {
            displayArrayIndexes(array, current+1, first, middle, last);
        }
    }

    private static int binaraySearch(int[] array, int item,int first, int last){
        int middle = (first + last)/2;
        displayArray(array);
        displayArrayIndexes(array, 0, first, middle, last);
        System.out.println();
        if (first == last && array[first] != item) {
            return -1;
        }if (array[middle]== item) {
            return (first + last)/2;
        }if (array[middle]> item) {
           return binaraySearch(array, item, first, middle-1);
        }else {
           return binaraySearch(array, item, middle+1, last);
        }
    }

    public static int binaraySearch(int[] array, int target){
        return binaraySearch(array,target,0,array.length-1);
    }

    private static void swap(int[]array, int index, int xedni){
        int temp = array[index];
        array[index] = array[xedni];
        array[xedni] = temp;
    }

    private static int partition(int[] array, int pivot, int first, int last){
        int i = first;
        int j = last;
       
        do {
           while (array[i]<pivot) {
            i++;
           }while (array[j]>pivot) {
            j--;
           }   
            displayArray(array);
            swap(array, i, j);
        } while(i<j);
        displayArray(array);
        return j;

    }
    
    public static void main(String[] args) {
        int[] array = {99,68,24,93,98,55};
        displayArray(array);
        System.out.println("Calling displayReverse(\"Hello World!\")");
        displayReverse("Hello World!");
        System.out.println("Calling factorial(5)");
        System.out.println(factorial(5));
        int[] array2 = {3,6,11,14,19,23,28,33,37};
        System.out.println("Calling binarySearch to search for 14");
        //System.out.println(binaraySearch(array2, 14));
        System.out.println(partition(array,60,0,5));



    }

}
