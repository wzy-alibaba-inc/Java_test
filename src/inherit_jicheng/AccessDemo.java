package inherit_jicheng;

public class AccessDemo {

    // 访问修饰符
    // public（公共的） protected 默认修饰符 private
    public int publicField;       // 公共，任意都可以访问
    public  int protectedField;   //受保护，大部分情况给子类使用，子类都可以访问，非子类不可以访问
    int defaultField;             // 默认只能在同包下访问
    private  int privateField;    //私有，只能本类访问

    // 非访问修饰符   static
    public static void staticMethod(){
        System.out.println("aaa");
    }
    //或者
    public static void main(String[] args){
        staticMethod();
        //AccessDemo a=new AccessDemo();    // 可以省略不写
        AccessDemo.staticMethod();
        //a.staticMethod();    // 这么写也可以

        final int a=10;    // 不能更改，或者继承


    }


}
