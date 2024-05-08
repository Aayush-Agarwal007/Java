import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("you'r Adult");
            }
        else{
            System.out.println("you'r not Adult... you are mamma's boy now");
        }

        
}
}