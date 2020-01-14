package pattern.multiFactory;

import pattern.multiFactory.FactoryService;

public class SmsImpl implements FactoryService {
    @Override
    public void send() {
        System.out.println("sms------send---");
    }
}
