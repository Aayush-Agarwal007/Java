import java.util.Scanner;



public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of principle:");
        int principle = sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int rate = sc.nextInt();
        System.out.println("Enter the time period:");
        int time = sc.nextInt();
        int si = (principle*rate*time)/100;
        System.out.println("The simple interest is: "+si);
        
    }
    
}
