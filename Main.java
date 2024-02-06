public class Main {
    public static void main (String[] args){
    /*There are two types of casting in Java:
     * Widening: automatic. this converts a smaller data type to a larger one.
     * Narrowing: manual. this converts the other way, from a larger data type to a smaller one.
     */

     //this is widening casting:
     int num = 9;
     double decimal = num;
     System.out.println(num + ", " + decimal);

     //and this is narrowing:
     double newDec = 9.76;
     int newNum = (int) newDec;//you need the (int)- that's the casting!
     System.out.println(newDec + ", " + newNum);
     //easy, for now. Apparently it gets worse.
    }

}
