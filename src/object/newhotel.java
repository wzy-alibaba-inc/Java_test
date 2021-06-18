package object;

public class newhotel {
    // 创建对象    ——》 调用类

    public static void main(String[] args){
        //测试   创建的hoterl类的对象

        //创建对象   固定语法： 类名 变量名（对象名） = new 类名();


        // 创建gf对象
        hoteltest gf = new hoteltest();   //类名 gf=hoteltest类的对象= new类名
        System.out.println(gf);

        //静态类的调用
        gf.boss = "海底捞";
        gf.cook = "李大厨";
        gf.waiter = "小张";
        System.out.println(gf.boss);
        System.out.println(gf.cook);

        // 动态类的调用
        gf.cooking();
        gf.entertaining();
        gf.pay_off();

        // ++++++ 在次创建对象 +++++++
        System.out.println("=================================");
        hoteltest gj = new hoteltest();
        System.out.println(gj);
        gj.boss="国际饭店";
        gj.cook="王大厨";
        gj.waiter="小黄";
        System.out.println(gj.boss);
        System.out.println(gj.cook);
        System.out.println(gj.waiter);
        gj.cooking();
        gj.entertaining();
        gj.pay_off();




    }




}
