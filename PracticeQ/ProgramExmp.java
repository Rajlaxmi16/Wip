import java.util.Scanner;
public class ProgramExmp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//scanf in C
        
        System.out.println("Enter the String based input:");
        String s1 = scan.next();
        System.out.println("The String is: "+s1);
        
        int resultint = Integer.parseInt(s1);
        float resultfloat = Float.parseFloat(s1);
        double resultdouble = Double.parseDouble(s1);
        byte resultbyte = Byte.parseByte(s1);
        short resultshort = Short.parseShort(s1);
        
        System.out.println("the converted String is: "+resultint);
        System.out.println("the converted String is: "+resultfloat);
        System.out.println("the converted String is: "+resultdouble);
        System.out.println("the converted String is: "+resultbyte);
        System.out.println("the converted String is: "+resultshort);
    }
}