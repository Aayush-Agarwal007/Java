import java.util.Scanner;




public class math_class {
    public static void main(String[] args) {
        // Math.random()
        // int x= 10000;
        // double y= 10000.1;
        // double z =Math.max(x,y);
        // System.out.println(z);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of the triangle");
        float height = sc.nextFloat();
        System.out.println("enter the base of the triangle");
        float base = sc.nextFloat();
        // double z= Math.pow(height, base);
        // System.out.println("the area of the triangle is "+z);
       double x= Math.pow(height, 2);
        double y= Math.pow(base,2);
        double z= x+y;
         double hypoteneous = Math.sqrt(z);

      System.out.println("the hypoteneous of the triangle is "+hypoteneous+"unit");


        
}

    private static int IntegerParseInt(double sqrt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'IntegerParseInt'");
    }
}