package fangfa;

import java.util.HashMap;
import java.util.Map.*;
import java.util.Set;

public class HashMapLoop {
    public static void main(String[] args){


        HashMap<String ,Integer> map= new HashMap<String, Integer>();

        // 存进去，取出来
        map.put("userid",234561);
        map.put("age",1234);
        map.put("score",60);


        // 遍1： 获取所有的键，键找值 KeySet+ get
/*
        Set<String >keys= map.keySet();
        System.out.println(map);
        for (String key:keys){
            int value =map.get(key);
            System.out.println(key+"="+value);
        }
*/


        // 遍历2： 获取所有的键值对，entrySet 自带getVa getKey 方法

        Set<Entry<String,Integer>> entrySet=map.entrySet();
        for(Entry<String,Integer> entry:entrySet){
            System.out.println(entry.getKey()+"=" + entry.getValue());
        }






















    }
}
