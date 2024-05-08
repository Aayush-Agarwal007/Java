import java.util.Random;
// import java.util.random;




public class random_numbers {
    public static void main(String[] args) {
        Random random= new Random();
        // int x= random.hashCode();
        // boolean x= random.nextBoolean();
        int x= random.nextInt(5)+1;


        System.out.println(x);
}
}