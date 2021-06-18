package test007;

public class FengZhuang_WeiGuo {    //public 公有类

    // 封装可以提高代码的阅读性和代码的可维护性

    private String king;     // private 私有，只能本类访问
    String country;

    // 自定义私有方法 set方法   设置king为曹操
    void setKing(String king){
        if (king=="曹操"){           // 判断king 是否为曹操
            this.king=king;         // 是曹操，正常输出
        }
        else {
            System.out.println("请重新输入");   // king不等曹操输出请重新输入
        }
    }

    // 获取方法get  必须有返回值  因为king是私有方法所以要重新获取
    public String getKing(){
        return king;
    }

/*    public void FengZhuang_weiguo(){  // FengZhuang_weiguo 方法访问
        System.out.println(king);
    }*/
}
