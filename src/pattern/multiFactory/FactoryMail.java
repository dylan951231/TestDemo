package pattern.multiFactory;

public class FactoryMail implements  FactoryInterfact{

    public FactoryService creat() {
        return new MailImpl();
    }
}
