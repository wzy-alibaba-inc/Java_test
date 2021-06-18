package test007;
import fangfa.Car;
public class SanGuo {
    // 定义一个手机对象

    // 面向对象相关的 ** 类 **
    // 定义变量  （静止的属性，成员变量(有默认值)，字段，属性）
    String country;   // 国家
    String king;      // 君王
    int population;   // 土地
    int land;         // 人口
    String Coach;     // 主帅

    //动态的行为 用函数来描述
    public void jiangjun(){
        System.out.println("将军 南征北战");
    }
    public void moushi(){
        System.out.println("谋士 出谋划策");
    }
    public void shibing(){
        System.out.println("士兵跟随"+Coach+"征战沙场");
    }


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //**** 方法 重载 ****（和方法名一样，参数列表不一样）
    // 无参构造：
    public SanGuo(){
        System.out.println("三国 无参构造");
    }
/*
    public Sanguo(String c,String k) {
        //第一种：给截取开始的位置从给的开始位置开始截取， 默认到末尾 substring（int start）
        //第二种：给开始位置和结束位置进行截取   substring(int start, int end)
        country = c;
        king = k;
    }*/


    // **** 常用写法
    //局部变量和成员变量同名，就近原则（方法内部先冲方法里面找变量找不到再去类中找）；
    // 用this关键词解决这个问题 this.变量 强行去类中找（this等于对象）
    public SanGuo(String country, String king) {
        this.country=country;
        this.king=king;
    }

}
