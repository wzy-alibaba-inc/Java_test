package homework;

public class homework {
    public static void main(String[] args) {
/*        System.out.println("打印左侧直角三角形");
        for (int i = 1; i < 5; i++) {     // 行数： 共计4行
            for (int j = 1; j <= i; j++) {   // 列数
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("打印右侧直角三角形");
        for (int i = 1; i < 5; i++) {          // 行数：共计4行
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");        //当i等于1的时候；J等于5减i，输入空格，
            }
            for (int j= 1; j<=i; j++) {        //列数
                System.out.print("*");         //在空格后面输入列数
            }
            System.out.println();
        }

        System.out.println("打印等腰三角形");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j= 1; j<=i; j++) {
                System.out.print("* ");       //添加空格
            }
            System.out.println();
        }*/

//求出0到100之间所有的偶数的和，奇数的和
/*
        System.out.println("写一段程序分别求出0到100之间所有的偶数的和，奇数的和");
        int sumOdd=0;           //求奇数和的变量
        int sumEven=0;          //求偶数之和的变量
        for(int i=1;i<=100;i++)
        {
            while(i%2!=0)        //奇数
            {
                sumOdd+=i;       //奇数和
                break;
            }
            do
            {
                if(i%2==0)       //偶数
                {
                    sumEven+=i;  //偶数和
                }
                break;
            }while(i>100);   // i大于100 结束循环
        }
        System.out.println("奇数之和为"+sumOdd);
        System.out.println("偶数之和为"+sumEven);
*/


//java输出0-100之间的偶数、奇数
/*        System.out.println("100以内所有的偶数为：");
        int a;
        for(a=0;a<=100;a++) {
            System.out.print(a++ +"\t");   //打印偶数
        }

        System.out.println("");
        System.out.println("100以内所有的奇数为：");
        int b;
        for(b=0;b<100;b++) {     //b的值等于（b的初始值为0， b++ 等于b+1）
            b++;                 //b +1 的值等于（打印奇数）
            System.out.print(b + "\t");  // b+1的值
            }*/


// 打印100 以内的奇数，和偶数
/*
      System.out.println("100以内所有的奇数为：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {        // 除以2带有余数的数  ——奇数
                System.out.print(i + "\t");
            }
        }


        System.out.println("");
        System.out.println("100以内所有的偶数为：");
        for (int a = 1; a < 100; a++) {
            if (a % 2 == 0) {       // 可以整除2的数字   ——偶数
                System.out.print(a + "\t");
            }
        }
*/

        //冒泡排序算法
/*
        int[] numbers=new int[]{1,5,8,2,3,9,4};
        //需进行length-1次冒泡
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
*/





    }
}