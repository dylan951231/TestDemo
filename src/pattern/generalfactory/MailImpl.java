package pattern.generalfactory;

public class MailImpl implements FactoryService {
    @Override
    public void send() {
        System.out.println("mail----send----");
    }
}
