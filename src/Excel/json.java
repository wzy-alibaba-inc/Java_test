package Excel;

public class json {
    /**
     1.字符串转对象
     String json = "{name:\"张三\",age:\"18\"}";
     Student s1 = JSONObject.parseObject(json, Student.class);
     2.对象转字符串
     Student s1 = new Student("张三",18);
     String jsonString = JSONObject.toJSONString(s1);
     3.map转字符串
     Map<String, String> map = new HashMap<String, String>();
     map.put("error", "1");
     map.put("msg", "系统错误");
     String jsonString = JSONObject.toJSONString(map);
     4.字符串数组转成List集合
     String json = "[{\"age\":18,\"name\":\"张三\"},{\"age\":17,\"name\":\"李四\"}]";
     List<Student> list = JSONObject.parseArray(json, Student.class);
     */

    
}
