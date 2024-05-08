class MyEmployee{
    int id;
    String name;

    // MyEmployee(){
    //     id = 23;
    //     name = "Abigail";
    // }
    MyEmployee(String Name){
        id = 23;
        name = Name;
    }

}





public class Const {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee("Aayush");
        MyEmployee emp2 = new MyEmployee("Agarwal");

        System.out.println(emp1.id);
        System.out.println(emp1.name);

        System.out.println(emp2.id);

        System.out.println(emp2.name);

        
    }
    
}
