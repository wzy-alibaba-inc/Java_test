package polymorphic;

public class ZhongCard extends Card {

    public void getMoney(){
        System.out.println("欢迎光临中国银行");
        System.out.println("谢谢惠顾");
    }


    public static void newMethod(){
        System.out.println("子类中的新方法......");
    }


}
