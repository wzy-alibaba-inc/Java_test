package homework01;

public class Pringting01 {
    public static void main(String[] args){
        Employee c=new Coder();
        Employee t=new Tester();
        Employee m=new Managgger();
        c.work();
        c.sleep();
        m.work();
        m.sleep();
        t.work();
        t.sleep();
        System.out.println("-----------------");

        method(c);
        method(t);
        method(m);}
    private static void method(Employee e) {
        e.work();
        e.sleep();
    }
}
