package fangfa;

import java.util.HashSet;
import java.util.Iterator;

public class jihe {
    public static void main(String[] args) {

        //=========  集合 ===========
/*         ArrayL 保存数据的特点  数据排列有序；数据可重复；
         List ：接口的大小可变数据的实现。
         remove 删除
         isEmpty 判断是否有元素
         contains 包含
         set 修改
         */

        //=========  遍历 ===========
/*        // 遍历  索引+get +size
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));}

        // 遍历   增强for 不能直接获取索引，只能从头遍历到尾
        for (String element:list){
            System.out.println(element);
        }
*/

        // 了解
/*
    public interface List{
        public abstract int size();    //抽象方法，没有方法体
        boolean isEmpty();
    }
//-----------------------------------------------------------

    public class ArrayList implements List{       //同时实现多个接口
        //类必须重写接口中所有抽象方法，如果父类接口中的方法，子类可以不在重写
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }



//-----------------------------------------------------------

    //接口一系列规则，多态（继承，实现）
    public class LinkedList implements List{

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }


//    抽象类和普通类的区别：不能创建对象，可以有抽象方法
//    抽象类和接口的区别：  类相当于父类，接口相当于特性可以扩展
*/


        // set 集合特点： 无序 无索引， 不可重复
        HashSet<String> set = new HashSet<>();

        // 存进去，取出来 长度
        set.add("asd");
        set.add("asd");
        set.add("asasdfd");
        set.add("北方");
        set.add("asdffsdfsd");

        System.out.println(set);

//        set 不能单独去除某个元素，只能通过遍历取出所有元素

        System.out.println(set.size());     // 打印大小
        set.remove("asd");         // 移除元素
        System.out.println(set);

        System.out.println(set.contains("北方"));    // 是否包含元素

        // 遍历 增强for
        for (String element : set) {
            System.out.println(element);
        }


        // 遍历 迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }


    }
}
