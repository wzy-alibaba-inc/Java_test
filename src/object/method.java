package object;

public class method {

 /**
       函数/方法：
       函数就是功能实现，它是遵循了特定语法，一段具有特定功能代码（类通过定义函数来描述类的功能）
       **** 方法不调用，不执行
       分类：
           非构造函数（普通函数）
               格式：按照main方法修改  修饰符 函数返回值类型 函数名（参数类型 参数名...）{函数体}
       public in add(int a,int b){
           return a+b;
           }
           修饰符：
               public    protected  默认修饰符  private  权限逐步降低（public的权限最大，private访问权限最小）
           函数返回值类型：
               八大基本类型  /  引用类型  / 空类型 （void）
           函数名：
               随便定义，语法要求第一个字母小写，函数名要见名知意
           参数类型：
               就是一个变量的类型（八大基本类型 / 引用类型）
        形参实参：
           形参：方法参数列表
           实参： 实参参数入的值，实际参与运算的值

        方法的参数和返回值都是方法的功能决定的
*/


    //功能：两个整数的加减乘除
/*
   //访问修饰符   方法返回值 方法名（方法参数）     void没有返回
    public static void method(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println("++++++++++++++++");
    }

    // 方法的调用:  static直接调用static
    public static void main(String[] args){
        int a=15;
        int b=2;
        method(a,b);

    }
*/


    // 定义一个方法：拼接两个字符串并返回新的字符串
/*

    // 定义方法   String有返回值
    public static String concat(String s1,String s2){
        String result = s1 + s2;
        if(1==1){
            return result + "444";   //如果1等于1 则 在后面打印 444
        }
        return result;
    }

    // 方法复制
    public static void main(String[] args){
        String A = concat("123"," 321");
        System.out.println(A);
    }
*/



}
