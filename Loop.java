import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String> Animal = new ArrayList<String>();
        Animal.add("Dog");
        Animal.add("Cat");
        Animal.add("Bird");
        for (String i : Animal) {
            System.out.println(i);
        }
    }
    
}
