package object;

public class hoteltest {
    public boolean pay_off;
    public int entertaining;


    //=================  面向对象  ===========
/**

 类： 模板，描述的是具有共性的一类事务，所以我们又可以把类称作模板技术，静止的属性用变量来描述和动态的行为用函数来描述
    对象： 类的具象（ 就是类的具体化）
 */
    // 定义一个饭店的  类（方法）

        // 静止的属性，成员变量，字段，属性
        // 成员变量是有默认值的，  和数组的默认值是一致的（数组：noll；整数：0； 小数0.0；布尔类型：falls； 浮点型：空字符）
        String cook;       //厨师
        String boss;      // 老板
        String waiter;    // 服务员

        // 动态的行用函数来描述
    public void cooking() {
        System.out.println(cook+"做菜");
    }
    public void pay_off() {
        System.out.println(boss+"发工资");
    }
    public void entertaining(){
          System.out.println(waiter+"招待顾客");
    }




 }

