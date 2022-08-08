public class RationalNumberTester {
	public static void main(String[] args)
    {
        RationalNumber r1 = new RationalNumber(5, 15);
        RationalNumber r2 = new RationalNumber(1, 3);
       
        RationalNumber r3 = new RationalNumber(2, 8);
        RationalNumber r4 = new RationalNumber(6, 16);
        
        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        
        System.out.println(r1.getFloatingPoint());
        System.out.println(r2.getFloatingPoint());
        
        System.out.println(r1.compareTo(r2));
        
        System.out.println(r3.getFloatingPoint());
        System.out.println(r4.getFloatingPoint());
        
        System.out.println(r3.compareTo(r4));
    }//end main method 
}//end class