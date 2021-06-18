package fangfa;

public class testlei {
    public static void main(String[] args) {
    //创建对象：类名  变量名（对象名） = new 类名（）；
    lei  gf = new lei();   // gf 就是lei的 类的对象

        System.out.println(gf);
        int a = 10;
        gf.name= "小怪兽";
        gf.age = 44;
        gf.hight = 170;
        System.out.println(gf.name);
        System.out.println(gf.age);
        System.out.println(gf.hight);
        gf.shopping();
        gf.cooking();


}
}
