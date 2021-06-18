package inherit_jicheng;

public class inheritDemo {
    public static void main(String[] args){
        //创建Teacher类
        // 当一个继承父类：无条件使用父类私有成员
        Teacher t=new Teacher();
        t.name="语文";
        t.age=33;
        t.height=166;
        t.weight=120;
        t.sex="女";

        t.eat();
        t.teach();
        t.sleep();
        System.out.println("姓名："+t.name);
        System.out.println("性别："+t.sex);
        System.out.println("年龄："+t.age+"岁");
        System.out.println("体重："+t.height+"cm");
        System.out.println("身高："+t.weight+"斤");


    }
}
