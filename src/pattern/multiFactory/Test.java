package pattern.multiFactory;

public class Test {

    public static void main(String args[]){

        /**
         * 实现类和工厂类应一一对应，并且工厂类的方法明应该统一
         */
        /**
         * 如果需要更改实现，则改变new 的对象即可
         */
        FactoryInterfact factory = new FactoryMail();
        //如果需要多个mail对象，调用creat即可；
        FactoryService creat = factory.creat();
        creat.send();
    }
}
