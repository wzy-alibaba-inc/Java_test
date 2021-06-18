package test;

import fangfa.Car;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SplittableRandom;

public class test001 {
    public static void main(String[] args) {
        /*System.out.println("\n" +
                "我希望自己努力学习 JAVA \n" +
                "I hope I study hard JAVA  ...");*/

        //定义变量
        // 数据类型  变量名 = 变量值；
        // 相同作用域（包含他的大括号）下，变量名不能同名
/*
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);
        // 变量 可以重复复制格式： 变量名 = 新的值;
        bool1 = false;
        System.out.println(bool1);
 */



        // ************* 数据类型
        /* 1）逻辑类型：boolean（布尔类型），取值范围true/false
        *  2）整型（整数）
        *       byte（字节型）  取值范围：-128 ~  127 1字节
        *       short（短整型） 取值范围： -32768 ~ 32767     2个字节
        *       int （整形）    取值范围： -2147483648 ~ 2147483647  4个字节  如果超出int取值范围在后面加L
        *       long（长整形）  取值范围： -9223372036854775808 ~ 9223372036854775808  8个字节
        *  浮点数（小数）
        *       float（单精度的浮点型） 1.4E -45 ~ 3.4028235E38  4个字节
        *       double （双精度的浮点型）  4.9E -324 ~ 1.7976931348623157E308  8个字节
        *  字符型
        *       char（字符型）：char类型的变量赋值的时候数据长度只能是一位，并且用单引号包起来，  2个字节
        */

/*
        int f = 2;
        char b = ningmengban;   //长度过长
        char c = %;         //char类型的变量赋值的时候数据长度只能是一位，并且用单引号包起来
        char p = "%";       //char类型的变量赋值的时候数据长度只能是一位，并且用单引号包起来
        char d = '%';
        long e = 1.1;       //取整数
        long g = 3;
        float j = 2.3;      //不能正常转换类型
        float m = 2.3F;     //最好用F
        double n = 3.33;
 */



        // *************字符串与数组
        //一维数组
/*
        *   数组：相同的数据类型，一般情况下数据意义一样。
        *   数组特点： 数据类型固定，长度固定
        *   定义：   静态初始化（创建）： 数据类型[]  数组名 = {...};
        * int[] ages = {20,30,40,12};
        * System.out.println(ages);
        * System.out.println(ages[2]);           //结果为第三位“ 40 ”
        * */


        //创建静态数组
/*
        int[] ages = {20,30,40,12};
        System.out.println(ages);
        System.out.println(ages[2]);    // 打印第三位值

        // 修改数组的元素   对数组中的元素进行修改   不能用静态初始化修改数组
        ages[0] = 999;              // 将第一位修改为99
        System.out.println(ages[0]);


        //动态初始化：数据类型[]  数组名 = new 数据类型 [size];
        int[] ages2 = new int[4];  //动态初始化先开辟长度，元素的默认值：boolean 是false；整数是0；小数是0.0；空字符 引用数据类型null
        System.out.println(ages2);
        // 给ages2 数组赋值
        ages2[0] = 1;
        ages2[1] = 10;
        ages2[2] = 100;
        ages2[3] = 110;
        System.out.println(ages2[0]);
        System.out.println(ages2[1]);
        System.out.println(ages2[2]);
        System.out.println(ages2[3]);
*/


        //数组的特点：数据类型固定，长度固定

        // 二维数组：
/*
        // 静态初始化： 数据类型[] []  数组名 = {{...}，{...},{...}};
        String[][] arr =
                {
                        {"赵丽颖","冯绍峰"},
                        {"刘备","诸葛亮"},
                        {"曹操","荀彧","许攸"}
                };
//        System.out.println(arr);  //[[Ljava.lang.String;@4554617c  两个中括号表示二维数组，
//        System.out.println(arr[0]);  //[Ljava.lang.String;@74a14482 一个中括号表示一维数组
        System.out.println(arr[0][0]);   //取出 赵丽颖
        System.out.println(arr[2][2]);   // 取出 许攸
        // 修改数组中的许攸为郭嘉
        arr[2][2] = "郭嘉";
        System.out.println(arr[2][2]);
*/


        // 动态初始化： 数据类型[] []  数组名 = new 数据类型 {{...}，{...},{...}};
  /*         //方法一：
        String[][] arr1 = new String[3][];
        System.out.println(arr1);
        System.out.println(arr1[0]);
        arr1[0] = new String[2];
        arr1[0][0] = "刘备";     //赋值
        arr1[0][1] = "关羽";     //赋值
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);

       // 方法二： 先定义长度
        String[][] arr2 = new String[3][2];
        System.out.println(arr2);        //[[Ljava.lang.String;@677327b6
        System.out.println(arr2[0]);     //[Ljava.lang.String;@14ae5a5
        System.out.println(arr2[0][0]);  //null
        arr2[0][0] = "刘备666";   // 赋值
        System.out.println(arr2[0][0]);   //输出：刘备666
*/

        //**********************************
        // 算数运算符
/*
        int a = 9;
        int b = 5;
        System.out.println(a + b );    //加法
        System.out.println(a - b );    //减法
        System.out.println(a * b );    //乘法
        System.out.println(a / b );    //除法(取整数，不取余数）
        System.out.println(a % b );    //取余数

        //  字符串拼接 可以和任意数据类型进行拼接，最终得到结果也是字符串
        System.out.println("a"+"b"+(100+200));
        System.out.println(1.0 * a/b);     // 可以去小数

        //  ++ （自增）   --（自减）
        a = a + 1;

        a++;     //a++ 等于 a=a+1
        //++ 单独使用时，前后效果一致，都是则增1；
        System.out.println(a);
        */


/*        int a = 5;
        int c = a++;     // ++ 在后面先运算在自增； ++ 在后面先自增在运算
        System.out.println(a);   //a=a+1;  c=a
        System.out.println(c);
        System.out.println(a++ + ++a);   //结果是14

        */

        // 关系运算符
/*
        int a = 9;
        int b = 5;
        System.out.println(a > b );
        System.out.println(a >= b );
        System.out.println(a < b );
        System.out.println(a <= b );
        System.out.println(a != b );
        System.out.println(a = b );     //a=b  b等于5会覆盖a的值，所以结果是5
        System.out.println(a == b );
        */


/*
        //逻辑用运算符  与或非（&  |  ! )   遇到真则为真
        int a = 9;
        int b = 5;
        System.out.println(!false);    // 结果是true
        System.out.println(a > b & a>b );
        System.out.println(a > b | a>b );
        System.out.println(a > b || a>b );
        System.out.println(a > b && a>b  );
*/

/*
        //赋值运算符  +=   -=   *=  /=  %=
        int a = 10;
        a += 10.1;        //  等于 a=(int)(a+ 10.1);  //强转
        System.out.println(a);
*/

/*         // 三元（且） 运算符
         //结束 A（boolean 结果的表达式）？  B:C；  A为tue执行B，为false执行C
        int a = 10;
        int b = 20;
        System.out.println(a>b ? a:b);   //局限性是只能输出一个结果
*/




// 创建一维数组
/*
        //静态
        int[] ages = {100,200,300,400,500};
        //动态
        int[] ages2 = new int[4];
        ages2[0] = 100;
        ages2[1] = 200;
        ages2[2] = 300;
        ages2[3] = 400;
// 创建二维数组
        //静态
        String[][] arr ={{"java","html"},{"css","javascript"}, };
        //动态
        String[][] arr1 = new String[2][2];
        arr1[0][0] = "java";
        arr1[0][1] = "html";
        arr1[1][0] = "css";
        arr1[1][1] = "javascript";
// 第二题：
        int x = 1;
        int y = 2;
        System.out.println(x / y);    //结果是0     x除以y取整数 结果为0
        System.out.println(y / x);    //结果是2     y除以x取整数 结果为2
        System.out.println(x % y);    //结果是1     x除以y取余数
        System.out.println(y % x);    //结果是0     y除以x取余数
//第三题：
        int a = 15;
        System.out.println(a++ + ++a + ++a);     //结果是50
        // a等于 15    a++ 等于16
        // ++a 等于 17
        // ++a 等于 18
*/



        //********************* 流程控制语句：
/*
        // if语句的三种格式 执行流程
            // 格式1：
        int age = 30;
        if(age>=18){
            System.out.println("你成年了");
            if(age>=30);
                System.out.println("而立之年");
        }

            // 格式2：
        String username = "admin";
        String password = "admin1";
        if (username == "admin" && password == "admin1"){
            System.out.println("登录成功");
        }

        else{
            System.out.println("登录失败");
        }

            // 格式3：
        int score = 120;
        if (score <= 100 && score >=80){
            System.out.println("优秀");
        }
        else if (score <80 && score >=60){
            System.out.println("及格");
        }
        else if (score < 60 && score >=40){
            System.out.println("还是学了一点点东西的");
        }
        else if (score <40 && score >=0){
            System.out.println("一看就是没有学习");
        }
        else {
            System.out.println("请输入正确的分数");
        }
        System.out.println("+++++++++++++++++++++++++");
*/

 /*       // for 循环语句
        for(int i=1;i<=2;i++){
            System.out.println("****");
        }


        */
        /* 求和思想：  1+2+3+4+5+6+7+8+9
        * sum=0+1
        * sum=（0+1）+2
        * sum=（（0+1）+2）+3
        * sum=（（（0+1）+2）+3）+4
        *   sum就相当于括号里边的值
        */
        /*
        int sum = 0;
        for(int i=1;i<=9;i++){
            sum = sum + i;
        }
        System.out.println(sum);
*/

/*        // 数组遍历：挨个取出数组中的内容
        int[] arr = {1,3,22,44,12,3,22};
        for (int i=0; i<=2; i++){
            System.out.println(arr[i]);
        }

        //  增强for循环:好处是代码简单；弊端只能按顺序遍历； 不能直接获取索引
        for (int element:arr){
            System.out.println(element);
        }
*/

            // 循环控制语句
/*
        for(int b=1; b<=10; b++) {
            if (b / 3 == 0) {
                continue;   //结束本次循环，继续下次循环
//                break;      //结束当前循环
            }
            System.out.println(b);
        }
*/

/*
        // 双层循环语句
        for (int i = 1; i <= 3; i++) {        //控制行数
            for(int j = 1; j <= 4; j++) {     // 控制列数
                System.out.println("*");
            }
            System.out.println();
        }
*/


       // 打印数组中的数据
/*
        int[][] arr = {
                {11,22,33,44,55},
                {1,2,3,4,5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }*/

        // 打印三角形
/*
        System.out.println("打印直角三角形");
        for (int i =1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/



        // while 和 fou 循环可以等值替换
 /*
        int i=1;
        while (i<=10){
            System.out.print(i+"\t");
            i++;
        }
*/

//  ++++++++++++++++++   字符串：
/*
    // 拼接两个字符串并返回新的字符串：
    public static void main(String[] args){
        String c = concat("aaaa", "bbbb");
        System.out.println(c);
    }

    //方法的参数和返回值都是由方法的功能决定的
    public static String concat(String a, String b){
        String result = a + b;
        if(1==1){
            return result +"+++++++++";
        }
        return result;      //return 语句
    }
*/


    //++++++++++++++++++++++++字符串  常用操作
/*
        //字符串是不可变的
        String str = "abc";
        str = "11bB1";      //改变str的值

//equals 字符串内容是否相等
        System.out.println(str.equals("11Bb1"));

//equalsIgnoreCase  忽略大小写
        System.out.println(str.equalsIgnoreCase("11Bb1"));

 // replace   替换（参数化的时候使用）
        String str1 = "===${pwd}====";
        String newstr1 = str1.replace("${pwd}","1246456213");
        System.out.println(str1);
        System.out.println(newstr1);

// split  字符串切割
        String str2 = "1.1,234,aa,123,-1";
        String[] arr = str2.split(",");

        System.out.println(str2);
        for (String s:arr){
            System.out.print(s+"\t");
        }

// substring  截取  包含开始位置，不包含结束位置
        String a = "aaa123a2s3df";
        System.out.println(a.substring(8));     //取第三位到最后一位
        System.out.println(a.substring(2,9));   //取第三位到第8位

//length  获取列表的长度
        System.out.println(a.length());

//indexOf  找字符存在的位置
        System.out.println(a.indexOf("d"));

// isEmpty 判断字符串是否为空
        System.out.println(a.isEmpty());


// equals 和 ==的区别
        // equals 是Object中的方法，默认使用== 号比较，如果重写按照重写后的逻辑比较（比较的是内容）
        // == 比较运算符，比较基本数据类型——》比较的是值，比较的是引用数据类型——》比较的是地址值。
*/



    // 集合：










    //JSON数据格式解析

        // set 方法
/*        // set 集合特点：无序，无索引 不可重复
        // set 不能单独去除某个元素，只能通过遍历取出所有元素
        HashSet<String> set = new HashSet<>();
        //存进去   取出来  长度
        set.add("asdf");
        set.add("asdf");
        set.add("111");
        set.add("刘备");
        set.add("赵云");
        System.out.println(set);
*/


        // map
/*

        HashMap<String,Integer> map = new HashMap<>();
        //存进去   取出来  长度
        map.put("曹操",123);
        map.put("张辽",666);
        map.put("荀彧",111);
        map.put("曹植",444);
        map.put("曹植",444567);
        System.out.println(map);            //重复的数组，后面的数据会覆盖前面的数据
        System.out.println(map.get("曹操"));
        System.out.println(map.size());          //长度

        //putIfAbsent     如果不存在则添加进入
        map.putIfAbsent("userid",21);
        System.out.println(map);

        //在曹操的原来基础上添加77
        if(map.containsKey("曹操")){    //先判断是否存在
            //先获取原理的分数
            int score = map.get("曹操");
            // 加22 覆盖原来的值
            map.put("曹操", 123 + 77);        //打印曹操的结果为200

        }
        System.out.println(map);

        // getOrDefault  如果键存在：取对应的值；不存在取默认值
        System.out.println(map.get("userid"));
        System.out.println(map.getOrDefault("userid",1));
        System.out.println(map.getOrDefault("userid1",1));

        //replace("k,y)  替换键对应的值
        map.replace("userid",123);
        System.out.println(map);

        map.replace("userid2",1234);
        System.out.println(map);

        //replace(k, 新值 ，旧值)  替换必须要 键和值都存在才替换新的值
        map.replace("userid",3211,777);
        System.out.println(map);
        map.replace("userid",000,999);
        System.out.println(map);
*/

        //遍历所有的键，键找值   keySet + get
/*
        HashMap<String,Integer> map = new HashMap<>();
        //存进去   取出来  长度
        map.put("a",123);
        map.put("b",666);
        map.put("c",111);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for(String key : keys){
            int value = map.get(key);
            System.out.println(key + "="+ value);
        }

*/






//        testng  插件
/*
        <dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.0.0</version>
<scope>test</scope>
</dependency>
*/

    }




}