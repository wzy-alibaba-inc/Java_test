package fangfa;

public class fangfa01 {
    public static void main(String[] args) {

//  equals  和 == 的区别：
//  euqals 是object中的方法，默认使用==比较，如果重写按照重写后的逻辑比较
//  == 比较运算符，比较基本数据类型比较的值，比较的是引用数据类型比较是地址值

        
          //常用的方法（替换，忽略大小写，string）
/*
        String str ="adc";
        str="123B";
        // equals 字符串内容是否相等
        System.out.println(str.equals("222"));

        //equalsIgnoreCase 忽略大小写
        System.out.println(str.equalsIgnoreCase("123b"));

        //replace 替换
        String a ="===${PWD}===${PWD}";
        String newa=a.replace("${PWD}","123456");
        System.out.println(a);
        System.out.println(newa);
*/

        //split 切割字符串
 /*       String b = "a,b,asdf,asdfg";
        String[] arr = b.split(",");
        System.out.print(b);
        for (String c : arr) {
            System.out.print(c+"\t");
        }

*/

        // substring 截取
/*        String str="aa123456asdf";
        System.out.println(str.substring(3));   // 包含开始位置
        System.out.println(str.substring(3,6)); // 不包含结束位置
        */

        //length 字符串的长度
/*        String d="12312312";
        System.out.println(d.length());
        */

        // indexOf 找字符串存在的位置
/*
        String E="1423441234323asdf";
        System.out.println(E.indexOf("as"));
        System.out.println(E.indexOf("12"));
        System.out.println(E.lastIndexOf("123"));
*/

//  equals  和 == 的区别：
//  euqals 是object中的方法，默认使用==比较，如果重写按照重写后的逻辑比较
//  == 比较运算符，比较基本数据类型比较的值，比较的是引用数据类型比较是地址值


    }

}






