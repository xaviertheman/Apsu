package csci2011.WhitlowLab5;

public class WhitlowLab5 {


/**
 *CSCI 2011 Lab 5
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  5
 */

    public static NumberStack testNumberStackConstructor(int Capacity){
        return new NumberStack(Capacity);
    }

    public static void testPush(NumberStack numberStack, double number){
        try {
            numberStack.push(number);
        } catch (FullStackException e) {
            System.out.println(e);
        }
    }

    public static void testPop(NumberStack numberstack){
        try {
            numberstack.pop();
        } catch (EmptyStackException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        NumberStack stack = testNumberStackConstructor(1);
        testPop(stack);
        testPush(stack, 2);
        testPush(stack, 2);
        System.out.println(stack);
    
    }
}
