package pattern.generalfactory;

public class Test {

    public static void main(String args[]){

        /**
         * 普通工厂模式，步骤
         * 1. 建立公共借口
         * 2. 写实现接口类
         * 3. 建立工厂方法类，通过不同的输入返回不同对象
          */
        Factory factory = new Factory();
        FactoryService product = factory.product("sms");
        product.send();
    }
}
