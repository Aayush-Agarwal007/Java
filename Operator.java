import java.util.Scanner;

public class Operator{
    public static void main(String[] args) {
    //     float marks = 99.22f;
    //     if(marks >= 90){
    //         System.out.println("A Grade");
    //     }
    //     else if(marks >= 80 && marks<=90){
    //         System.out.println("B Grade");
    //     }
    //     else if(marks >= 70 && marks<=80){
    //         System.out.println("C Grade");
    //     }
    //     else {
    //         System.out.println("D Grade");
    //     }
    // }
    // Scanner oper = new Scanner(System.in);
    // System.out.println("Enter the char.. in keyboard for leave the game");
    // String ch = oper.next();
    // if(ch.equals("q") || ch.equals("Q")){
    //     System.out.println("You are leaveing the game");
    // }
    // else {
    //     System.out.println("You are not playing game");
    //             }
    // }
       Scanner oper = new Scanner(System.in);
    System.out.println("Enter the char.. in keyboard for leave the game");
    String ch = oper.next();
    if(!ch.equals("q") && !ch.equals("Q")){
        System.out.println("You are not playing game");
    }
    else {
        System.out.println("You are leaveing the game");
        
                }
    }



}