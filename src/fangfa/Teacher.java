package fangfa;

    // 右键——》 generate （然后选择对应的方法）
    // 创建空参（直接选择类）  construction
    // 右键——》 generate——》 Getters and Setters

/**

 一、新建一个类ArrayListDemo，使用今天上课讲解api完成下面需求。

 1、定义老师类Teacher，私有属性：name，age，提供空参有参构造，提供get/set方法，重写toString()。

 2、创建老师对象t1，name：张三，age：25

 3、创建老师对象t2，name：李四，age：35

 4、创建老师对象t3，name：老王，age：19

 5、创建老师对象t4，name：赵六，age：29

 6、创建ArrayList集合对象存储t1，t2，t3，t4

 7、通过普通for循环和增强for循环打印所有老师数据。打印出对应的name和age属性。

 8、请求出集合中的老师平均年龄。

 **/

public class Teacher extends Number {

    private String name;

    private int age;

    //空参构造

    public Teacher(){



    }

    /**
     * Returns the value of the specified number as an {@code int},
     * which may involve rounding or truncation.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code int}.
     */
    @Override
    public int intValue() {
        return 0;
    }

    /**
     * Returns the value of the specified number as a {@code long},
     * which may involve rounding or truncation.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code long}.
     */
    @Override
    public long longValue() {
        return 0;
    }

    /**
     * Returns the value of the specified number as a {@code float},
     * which may involve rounding.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code float}.
     */
    @Override
    public float floatValue() {
        return 0;
    }

    /**
     * Returns the value of the specified number as a {@code double},
     * which may involve rounding.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code double}.
     */
    @Override
    public double doubleValue() {
        return 0;
    }

    //有参构造

    public Teacher(String name, int age){

        this.name = name;

        this.age = age;

    }

    //name的set方法

    public void setName(String name){

        this.name = name;

    }

    //name的get方法

    public String getName(){

        return name;

    }

    //age的set方法

    public void setAge(int age){

        if(age>18 && age<=65){

            this.age = age;

        }else {

            System.out.println("输入的年龄不合法");

        }

    }

    //age的get方法

    public int getAge(){

        return age;

    }



    @Override

    public String toString() {

        return "Teacher{" +

                "name='" + name + '\'' +

                ", age=" + age +

                '}';

    }

}
