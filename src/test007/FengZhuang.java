package test007;

public class FengZhuang {
    public static void main(String[] args){
        // 封装 解析json 解析 excel
        FengZhuang_WeiGuo FZ=new FengZhuang_WeiGuo();
        FZ.country="魏国";
        FZ.setKing("曹操");
        System.out.println(FZ.country);
        System.out.println(FZ.getKing());




    }
}
