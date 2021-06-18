package fangfa;
import java.util.ArrayList;
/**

 一、新建一个类ArrayListDemo，

 1、定义老师类Teacher，私有属性：name，age，提供空参有参构造，提供get/set方法，重写toString()。

 2、创建老师对象t1，name：张三，age：25

 3、创建老师对象t2，name：李四，age：35

 4、创建老师对象t3，name：老王，age：19

 5、创建老师对象t4，name：赵六，age：29

 6、创建ArrayList集合对象存储t1，t2，t3，t4

 7、通过普通for循环和增强for循环打印所有老师数据。打印出对应的name和age属性。

 8、请求出集合中的老师平均年龄。

 **/

class ArryListDemo {

    public static void main(String[] args) {

        //创建4个Teacher对象

        Teacher t1 = new Teacher("张三",25);

        Teacher t2 = new Teacher("李四",35);

        Teacher t3 = new Teacher("老王",19);

        Teacher t4 = new Teacher("赵六",29);

        //创建ArrayList集合对象存储t1，t2，t3，t4

        ArrayList<Teacher> teachers = new ArrayList<>();

        //通过add方法添加t1，t2，t3，t4到集合中

        teachers.add(t1);

        teachers.add(t2);

        teachers.add(t3);

        teachers.add(t4);

        System.out.println(teachers);

        //通过普通for循环打印所有老师数据。打印出对应的name和age属性

        for (int i = 0; i < teachers.size(); i++) {

            System.out.print(teachers.get(i).getName() + "老师");

            System.out.println(teachers.get(i).getAge() + "岁");

        }


        System.out.println("=========================================");

        //通过增强for循环打印所有老师数据。打印出对应的name和age属性

        for(Teacher teacher : teachers){

            System.out.print(teacher.getName()+ "老师");

            System.out.println(teacher.getAge()+ "岁");

        }

        //请求出集合中的老师平均年龄

        getAvgAge(teachers);

    }



    public static void getAvgAge(ArrayList<Teacher> teachers) {

        int sumAge = 0;

        for (int i = 0; i < teachers.size(); i++) {

            sumAge += teachers.get(i).getAge();

        }

        int avgAge = sumAge/(teachers.size());

        System.out.println("老师的平均年龄是：" + avgAge);

    }

}
