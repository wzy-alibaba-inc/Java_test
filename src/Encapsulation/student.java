package Encapsulation;

public class student {
// ********** 封装 ***********
    //定义学生一个类
    // private私有： 只能本类访问（大括号内是可以访问的，出了大括号就可以访问）
    private int age;        //定义年龄
    String name;    // 定义名字


    // 自定义方法（添加了自定义的判断条件） set
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            //年龄有效，可以赋值
            this.age = age;
        } else {
            System.out.println("输入无效");
        }
    }


    // 获取的方法 get
    public int getAge(){
        return age;
    }



}
