package fangfa;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        // 使用方法：
        HashMap<String ,Integer> map= new HashMap<String, Integer>();

        //  存数据(如果重复会自动覆盖原来的值）put
        map.put("userid",1);
        map.put("age",1234);
        map.put("score",60);
        System.out.println(map);

        // 取单个值get
        System.out.println(map.get("userid"));
        System.out.println(map.get("age"));
        System.out.println(map.get("score"));

        // 查看大小
        System.out.println(map.size());

        // 增加putIfAbsent   （不存在则增加）
        map.putIfAbsent("user",99999);
        System.out.println(map);

        // 在原来的基础上增加
        //在score的基础上增加10（先判断是否存在，然后获取原来的分数在增加）
        if(map.containsKey("score")){           // 现判断原来的是否存在
            int score=map.get("score");         // 获取原来的分数
            map.put("score",score+10000001);    // 增加10分 并覆盖原来的值
        }
        System.out.println(map);


        // getOrDefault 如果键存在取对应的值，如果不存在取默认值
        System.out.println(map.get("userid"));
        System.out.println(map.getOrDefault("userid",1));
        System.out.println(map.getOrDefault("userid123",22222));

        //replace(k,oV,nV) 替换键对应的值
        map.replace("userid",666,7777);
        System.out.println(map);
        map.replace("userid",4444,555);
        System.out.println(map);




    }
}
