package override;

public class IPhone5 extends IPhone4{

    public IPhone5(){
        super();        // 调用父类空参构造（默认会添加）
//        this();         // 调用本类其它构造  （this和super 不能同时存在）
        System.out.println("IPhone5 构造");
    }


    //对父类的方法进行升级（改造） 方法重写（super）
    @Override   //注解： 一段功能（帮助检测写的方法是否正确
    public void siri(){
        super.siri();
        super.call();
        // super 强行指向父类中方法
        // 方法也存在就近原则，现在当前类中，找不到去父类，在去爷爷类
        System.out.println("你好，siri");



    }

}
