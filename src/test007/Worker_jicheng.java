package test007;

//********   使用 extends函数 继承 JiCheng类中的方法

public class Worker_jicheng extends Teacher_jicheng {

    /**     **** 访问修饰符 ****
     public int publicField;公共 任意都可以访问
     private int privateField; 私有，只能本类访问
     protected iint protectedField;受保护的，大部分是给子类使用的（子类可以访问，非子类出了包就都可以访问）
     int defaultField;  默认，只能在同包下访问
     **** 非访问修饰 ****
     static 静态（共享） 不需要创建对象，直接类名调用
     final 常量最终类（不能被继承） 方法（不能被重写）
     abstract 抽象
     */

    // 无参构造
    public Worker_jicheng(){
        System.out.println("Worker_jicheng---- 无参构造");
    }


    //***************** 方法的重写 ********************
    // 对父类的方法进行升级（改造），方法重写
    @Override   // 注解： 检测方法写的是否正确
    public void teach(){
        // 调用Teacher_jicheng中的teach方法（用super方法）
        // 方法存在就近原则，先在当前类中，找不到去父类，在去爷爷类
        super.teach();    //强行指向父类中的方法
        System.out.println("论语三百篇");
    }



}
