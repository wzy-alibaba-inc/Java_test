package inherit_jicheng;

public class Teacher extends Person {
    public String name;
    //  继承：两个类之间通过extends关键字来描述父子关系，子类可以拥有父类的公共方法和公共属性。
    // 教师是inherit的父类   （是person人类的子类）


    //构造方法
    public Teacher(){
        System.out.println("Teacher 无参构造");
    }

    public void teach(){
        System.out.println("教小孩子识文断字");
    }



}
