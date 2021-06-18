package test007;

public class SanGuoDemo {
    public static void main(String[] args){
    // 调用类  （就是测试Sanguo的类）

        // ** 创建对象 **，语法： 类名， 变量名（对象名）= new 类名（）
        // 构造方法特点：一个类中没有写构造方法，java会提供一个默认的无参构造方法，如果写了任意构造方法java就不提供。
        // 构造方法的定义格式和普通方法有区别，没有返回值项，必须和类名一致。
        // 使用对象调用 不用添加static

        SanGuo SG=new SanGuo();        // SG就是Sanguo类的对象
        System.out.println(SG);

//        int a=100;
        SG.country="魏国";
        SG.king="曹操";
        SG.land=99999;
        SG.population=8888;
        SG.Coach="曹操";

        // 创建对象SG
        System.out.println(SG.country);
        System.out.println(SG.king);
        System.out.println(SG.land+"公里土地");
        System.out.println(SG.population+"万人口");
        // 调用对象的方法
        SG.jiangjun();
        SG.moushi();
        SG.shibing();
        System.out.println("\n"+"********************"+"\n");


        // 创建对象SG1 再次调用Sanguo中的类
        SanGuo SG1=new SanGuo();
        SG1.country="蜀国";
        SG1.king="刘备";
        SG1.Coach="诸葛亮";
        System.out.println(SG1.country);
        System.out.println(SG1.king);
        SG1.jiangjun();
        SG1.moushi();
        SG1.shibing();




 //----------------------------------------------------------
        System.out.println("*****************************************");


        // 方法重载的调用
        // 方法名+参数确定唯一的方法
        SanGuo S=new SanGuo();
        SanGuo s1=new SanGuo("吴国","孙权");
        System.out.println(s1.country);
        System.out.println(s1.king);


        //----------------------------------------------------------
        System.out.println("*****************************************");

        // **** 两个对象指向同一个地址值 ****
        SanGuo s2=s1;
        s2.country="唐朝";
        s2.king="李世民";
        System.out.println(s2.country);
        System.out.println(s2.king);
        // s1和s2的地址值是一样的
        System.out.println(s1);
        System.out.println(s2);





    }

}
