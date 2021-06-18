package polymorphic;

import fangfa.Car;
//使用 extends 函数调用 Card 中的getMoney方法
public class JianCard extends Card {

    public void getMoney(){
        System.out.println("欢迎光临建设银行");
        System.out.println("谢谢惠顾");

    }


}
