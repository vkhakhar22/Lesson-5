public class Inherit {
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name"+name);
    }
}
class Child extends Inherit{
    void Age(int age){
        System.out.println("Age of student is "+age);
    }
}
class Main{
    public static void main(String[] args){
        Child s = new Child();
        s.naming("Vanshi");
        s.Age(14);
    }
   
}