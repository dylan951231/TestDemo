package pattern.multiFactory;

import pattern.multiFactory.FactoryService;

public class MailImpl implements FactoryService {
    @Override
    public void send() {
        System.out.println("mail----send----");
    }
}
