package polymorphic;

import javax.swing.text.html.StyleSheet;

public class Polymorphic01 {
    /**
                 ****多态
     概念：用父类的类型来接收子类的对象
     先决条件：继承，父类类型接收子类对象
     优点：扩展性强，解决了代码复用性，降低类型耦合度。
     缺点：不能使用子类特有方法(子类中新增的方法），可以使用强转，转成对应子类类型，解决这个问题
     使用方法：
        1. 父类  变量名1=子类对象；
        2. 父类  变量名2=（子类）变量名1；
        3. 多态一般随重写使用
     场景：
        public void driverCar(Car car){
            car.run();
     }

     public int publicField;公共 任意都可以访问
     private int privateField; 私有，只能本类访问
     protected iint protectedField;受保护的，大部分是给子类使用的（子类可以访问，非子类出了包就都可以访问）
     int defaultField;  默认，只能在同包下访问
     **** 非访问修饰 ****
     static 静态（共享） 不需要创建对象，直接类名调用
     final 常量最终类（不能被继承） 方法（不能被重写）
     abstract 抽象


     二： api使用
        打开——》显示 ——》 索引 ——》 输入java提供的类
             */

    public static void main(String[] args){
        // new的对象  (基本方法）
        //父类类型接收子类对象， 向上转型
        ZaoCard card1=new ZaoCard();
        JianCard card2=new JianCard();
//        System.out.println(card1);
//        System.out.println(card2);


        // 基本方法的调用
        atmGetMoney(card1);
        atmGetMoney(card2);




//多态方式：
        // 父类类型接收子类对象
        //定义一个变量card3；只用变量card3接收所有的子类对象
        Card card3=new ZhongCard();
        card3.getMoney();
        //其它子类的调用
        card3=new JianCard();
        card3.getMoney();

        card3=new ZaoCard();
        card3.getMoney();


        //调用子类中的特有方法  **** 强转 ****

        // 多态的方式不能看到子类中国特有（父类中没有）的方法
        // 强转  向下转型
        Card card4=new ZhongCard();
        ZhongCard zhongCard=(ZhongCard) card4;   // 强转(做回我自己)
        ZhongCard.newMethod();


        System.out.println("+++++++++++++++++++++++");
        // 只用一个变量接收所有的子类
        Card card5=new Card();
        card5=new ZaoCard();
        card5=new JianCard();
        card5=new ZhongCard();
        System.out.println(card5);       //card5是： polymorphic.ZhongCard@4554617c



    }
    // 基本方法
    //创建一个空方法card（让类去调用这个空方法,类的方法自然的就变成了重写的方法）
    // 创建后的代码 可以有效的减少代码（再有其它的银行加入直接new 出来在调用就可以）
    // 支持多态方法，接受Card和card的所有子类
    // 加static 为了在main方法中直接调用，和多态无关
    public static void atmGetMoney(Card card){
        System.out.println("================");
        card.getMoney();
        System.out.println("------------------"+"\n");
    }



/*    //非多态的写法
    // 写的方法（相当于重载）
    public static void atmGetMoney(ZaoCard card){
        System.out.println("================");
        card.getMoney();
        System.out.println("+++++++++++++++++++");
    }

    public static void atmGetMoney(JianCard card){
        System.out.println("================");
        card.getMoney();
        System.out.println("+++++++++++++++++++");
    }
*/





}
