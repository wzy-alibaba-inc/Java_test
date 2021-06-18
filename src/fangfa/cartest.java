package fangfa;

public class cartest {
    public static void main(String[] args){
        //创建对象

        /**
         * Car() 构造方法：（初始化，实例） 创建对象
         * 构造方法特点：一个类中没有写构造方法， java会提供一个默认的无参构造方法。如果写了任意构造方法，java就不提供了
         * 定义格式和普通方法有区别（public 没有返回值，方法名必须和类名一样）
         * */
        Car c1=new Car();
        //调用对象的属性
        c1.Brand_attributes="一起大众";
        c1.colour="红色";
        System.out.println(c1.Brand_attributes);
        System.out.println(c1.colour);
        // 调用对象的方法
        c1.Start_up();
        c1.brake();


        System.out.println("=================================");

        // 构造方法给成员变量复制（赋值操作）
        // 方法名+参数确定唯一的方法
        Car C3=new Car("白色","4","保时捷");
        System.out.println(C3.colour);
        System.out.println(C3.Brand_attributes);
        System.out.println(C3.wheel);

        System.out.println("******************************");
        // **** 两个对象指向同一个地址值
        //把c1 的地址值赋值给c3；  c1和c3两个对象指向同一个地址值
        Car c3=c1;
        c3.Brand_attributes="法拉利";
        c3.colour="红色";
        System.out.println(c3.Brand_attributes);
        System.out.println(c3.colour);

        System.out.println("=====================");
        System.out.println(c1.Brand_attributes);
        System.out.println(c1.colour);

    }
}
