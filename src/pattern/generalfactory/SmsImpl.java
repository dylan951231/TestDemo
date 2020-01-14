package pattern.generalfactory;

public class SmsImpl implements FactoryService {
    @Override
    public void send() {
        System.out.println("sms------send---");
    }
}
