package day02I19I26;

public class RecursiveCountdown {

    public static void main(String[] args) {
        coutdown(3);
    }

    public static void coutdown(int num){
        if(num <= 0){
            System.out.println();
        }else{
            System.out.println(num);
            coutdown(num-1);
        }
    }

  
}
