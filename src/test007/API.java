package test007;

import javax.swing.text.html.StyleSheet;

public class API {
    public static void main(String[] args){

        String str = "abc";
        str="111";

// equals 字符串内容是否相等(比较字符串内容是否相等）
        System.out.println(str.equals("222"));  //false
        System.out.println(str.equals("111"));  //true

// equalsIgnoreCase() 忽略大小写
        String str1 = "11BC";
        System.out.println(str1.equalsIgnoreCase("Abc"));   //false
        System.out.println(str1.equalsIgnoreCase("11bc"));  //true

// replace  替换（参数化用的比较多）
        String str2="====${PWD}======${PWD}==";
        String newStr2=str2.replace("${PWD}","123456");
        System.out.println(str2);
        System.out.println(newStr2);    //====123456======123456==

//split 切割字符串（面试经常问）
        String str3="a,sdf,123,sdf,asd";
        String[] arr=str3.split(",");
        for (String s: arr){
            System.out.print(s+"\t");    //a	sdf	123	sdf	asd
        }
        System.out.print("===================="+"\n");

// substring 截取（包含开始，不包含结尾）  （面试经常问）
        String str4="aaaaa11112asdf";
        System.out.println(str4.substring(10));     // 包含开始位置  asdf
        System.out.println(str4.substring(3,8));   // 不包含结束位置 aa111

// lenth  返回字符串的长度
        String str5="aaaaa11112asdf";
        System.out.println(str5.length());     // 长度14

//indexOF  找字符串存在的位置
        System.out.println(str5.indexOf("2"));    // 位置在第九位
        System.out.println(str5.indexOf("234"));  // 不存在返回-1
        System.out.println(str5.lastIndexOf("1"));  // 第八位

// isEmputy  判断字符串是否为空
        String str6="123";     // 字符串为空返回true，非空返回false
        System.out.println(str6.isEmpty());

// equals 和 == 号的区别
        //equals 是object中的方法，默认使用==号比较，如果重写按照重写后的逻辑比较
        //==号比较运算符，把比较基本数据类型比较的值，比较是->  引用过数据类型比较是地址值。




    }
}
