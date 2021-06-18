package test007;

public class JiCheng_ShiYong {
    public static void main(String[] args){

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

        // 创建Teacher类 并使用JiCheng中的方法
        // 当一个类继承父类，无条件使用父类非私有成员
        Teacher_jicheng t=new Teacher_jicheng();
        t.name="语文老师";
        t.age=30;
        System.out.println(t.name);
        System.out.println(t.age+"岁");
        t.eat();
        t.work();
        t.teach();     //Teacher类的方法


        Worker_jicheng W=new Worker_jicheng();
        W.teach();



    }
}
