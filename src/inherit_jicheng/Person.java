package inherit_jicheng;

public class Person {
    /**
            继承 inherit
         继承：两个类之间通过extends关键字来描述父子关系，子类可以拥有父类的公共方法和公共属性。
            解决问题：  提高了代码复用性； 代码的维护更高
     语法：
        public class 父类{

     }
        public class 子类 extends 父类{

     }

     注意事项：
        1. 如果一个类不能继承任何类，默认继承object, object是java中的祖类
        2. java是单继承（一个类只能继承于一个类）， 多层继承， 一个父类可以有多个子类
        3. 创建本类对象之前会先初始化父类对象
        4. 子类不能继承父类的private成员（属性，方法）

        5. 方法重新/覆盖
            前提条件：继承或者实现
            子类中出现了一模一样的方法，修饰符，返回值，方法名，参数都必须一模一样
            作用： 方法升级
        6. puer 关键字与this关键字
            super指向父类（调用父类方法或属性时候用到）
            this指向当前类（区分局部变量和成员变量同名）
            super() 调用父类构造方法
            this() 调用本类其它构造
        7. 修饰符
            访问修饰符：
                public protected 默认修饰符 private
                权限逐步降低
                public的访问权限最大，private类型的访问权限最小
            非访问修饰符：
                static 静态（共享）不需要创建对象，直接类名调用
                final 常量，最终类（不能被继承，被绝育了） 方法不能被重写
                abstract 抽象


*/

    // 人类（父类）

    String name;
    int age;
    int height;    //身高
    int weight;    //体重
    String sex;    // 性别

    public void eat(){
        System.out.println("每天三顿饭");
    }


    // 构造方法  先输出父类
    public Person(){
        System.out.println("Person 无参构造");
    }


    public void sleep(){
        System.out.println("睡8个小时 觉");
    }




}
