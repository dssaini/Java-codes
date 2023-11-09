public class WrapperClasses {
    Integer abc= 1002;
    public static void main(String[] args) {
        // depriciated  Integer dfg = new Integer(100);
        Integer xyz = Integer.valueOf("10111",2); // converts the number to integer 
        int y = xyz.intValue(); //returns the int value of integer.
        int dfg= Integer.parseInt("10111", 10);// converts the number string into decimal.
        System.out.println(dfg);
        System.out.println(xyz);
        System.out.println(y);
    }
}
