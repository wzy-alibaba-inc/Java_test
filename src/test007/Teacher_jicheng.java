package test007;

//********   使用 extends函数 继承 JiCheng类中的方法

public class Teacher_jicheng extends JiCheng_ZongLei {

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

    // 定义teach方法
    public void teach(){
        System.out.println("陪小学生玩耍");
    }

    //无参构造
    public Teacher_jicheng(){
        System.out.println("Teacher_jicheng ---- 无参构造");
    }

}
