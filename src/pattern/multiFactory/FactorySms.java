package pattern.multiFactory;

public class FactorySms implements FactoryInterfact {

    public FactoryService creat(){
        return new SmsImpl();
    }
}
