package hello.com;
interface MySampleClass{
    void Name1();
    void Name2();
}
interface ChildOfMySample extends MySampleClass{
    void Name3();
    void Name4();
}
class MySample implements ChildOfMySample{
    @Override
    public void Name1() {
        System.out.println("Bazan");
    }

    @Override
    public void Name2() {
        System.out.println("Ali");
    }

    @Override
    public void Name3() {
        System.out.println("Haseeb");
    }

    @Override
    public void Name4() {
        System.out.println("Rohail");
    }
}
public class Lec_58_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        MySample obj = new MySample();
        obj.Name1();
        obj.Name2();
        obj.Name3();
        obj.Name4();
    }
}
