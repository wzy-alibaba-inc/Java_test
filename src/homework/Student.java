package homework;

public class Student {

/*
1、写一个标准的学生类，有姓名、年龄、分数三个私有属性。提供get/set方法，提供有参和无参构造，不要用快捷键。

限定年龄必须大于15岁，无效信息需提示，并设置默认年龄为15。

限定分数为只读属性（只有get方法，没有set方法）。

提供一个show方法打印姓名、年龄、分数
*/

    private String name;
    private int age=15;
    private int score;

    public Student(){
        //无参构造
        System.out.println("Student的无参构造");
    }
    public Student(String name, int age, int score){
        //有参构造
        this.name=name;
        this.age=age;
        this.score=score;
        System.out.println("Student的有参构造");
    }

    public void setName(String name){
        this.name=name;
    }


    public String getName(){
        return name;
    }

    public void setAge(int age) {
        if (age > 15) {
            System.out.println("年龄有效，可以赋值");
            this.age = age;
        } else {
            System.out.println("输入的年龄有误");
        }
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("分数："+score);
    }



}
