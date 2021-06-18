package test;

import java.util.ArrayList;

public class teacher01 {

    //    第三题：翻转字符串 aiwozhonghua ，结果auhgnohzowia
/*

    public static void main(String[] args) {
        String string = "aiwozhonghu";
        String reverseString = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转后：" + reverseString);

    }

    public class Teacher {         //私有属性
        private String name;
        private int age;

        public Teacher() {

        }
    }
*/

// 第二题：有字符串String s = "abc,123,中国,llllll,haha"; 最终输出：abc：3，123：3，中国：2，llllll:6，haha:4 数字代表长度

/*    public static void main(String[] args) {
        String s = "abc,123,中囯，111111,haha";
        String[] s1 = s.split(",");
        for (String value : s1) {
            System.out.print(value + ":" + value.length() + ",");
        }
    }*/


    public static void main(String[] args){
        teacher t1 = new teacher("张三",25);
        teacher t2 = new teacher("李四",35);
        teacher t3 = new teacher("老王",19);
        teacher t4 = new teacher("赵六",29);

        // 创建对象
        ArrayList<teacher>teachers=new ArrayList<teacher>();

        // 添加到集合中
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        System.out.println(teachers);

        //打印老师数据
        for (int i=0; i<teachers.size(); i++){
            System.out.println(teachers.get(i).getName()+"老师");
            System.out.println(teachers.get(i).getAge()+"岁");

            // 增强for
        for (teacher teacher:teachers){
            System.out.println(teacher.getAge()+"岁");
            System.out.println(teacher.getName()+"老师");
        }


        }

    }



}








