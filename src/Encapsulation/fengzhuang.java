package Encapsulation;

public class fengzhuang {
    /**
           封装：
      Encapsulation 意思是将代码通过函数的形式将一些代码细节包装起来，防止外部代码的随机访问，要访问这些数据就必须通过调用函数来完成
        1. 提高了代码的阅读性
        2. 提高了代码的可维护性
     */

    public static void main(String[] args){

        // 封装：类的封装，方法的封装 （解析json，解析excel）

        student s1=new student();
        s1.name="张三";
        s1.setAge(19);
        System.out.println(s1.name);
        System.out.println(s1.getAge());


















    }
}
