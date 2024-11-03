public class Animal{
    void eat(){
        System.out.println("This is an animal class");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("This is a lion class");
    }
}
class Babylion extends Lion{
    void weep(){
        System.out.println("This is a baby lion class");
    }
}
class Main{
    public static void main(String[] args){
        Babylion obj=new Babylion();
        obj.weep();
        obj.roar();
        obj.eat();

    }
}