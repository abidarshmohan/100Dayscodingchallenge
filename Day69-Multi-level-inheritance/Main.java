class A{
    void display1()
    {
        System.out.println("Iam an Isoscles triangle");
    }
}
class B extends A{
    void display2()
    {
        System.out.println("Iam  an Equilateral triangle");       
    }
}
class C extends B{
    void display3()
    {
        System.out.println("Iam triangle ");
    }
}

public class Main{
    public static void main(String[] args) {
        C c=new C();
        c.display2();
        c.display1();
        c.display3();
    }
}