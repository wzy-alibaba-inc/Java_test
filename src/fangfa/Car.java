package fangfa;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Car {

    //定义 类    静止的属性，成员变量，字段，属性
    //局部变量
    String Brand_attributes;   // 车的品牌
    String colour;       //颜色
    String wheel;        //车轮


    // 动态的行为用函数来描述
    public void Start_up() {
        System.out.println("启动");
    }
    public void brake() {
        System.out.println("刹车");
    }




    // ******构造方法****：
    // 没有返回值选项，必须和类名一致（先构造方法，在重载方法）
    public Car(){
        System.out.println("Car 无惨构造");
    }

    //********方法： 重载（方法名一样，参数列表不一样；目的是节省记忆的成本）
    public Car(String colour, String  wheel,String Brand_attributes ){
        // 第一种：给截取开始的位置，   默认截取到末尾  例：substring(int start)
        // 第二种：给开始和结束        例：stubstring(int start    int end)

/*
        public Car(String c,String  w B ){
        //构造方法给成员变量赋值操作（构造成员变量）
       // 成员变量
        colour=c;
        wheel=w;
        Brand_attributes=B;
*/


        // 局部变量和成员变量同名，就近原则（方法内部先从方法里找变量找不到在去类中找
        //用this 关键解决问题。this 变量（强行去类中找）
        this.Brand_attributes=Brand_attributes;
        this.colour=colour;
        this.wheel=wheel;


    }

}

