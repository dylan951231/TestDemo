package pattern.generalfactory;

public class Factory {

    public FactoryService product(String type){

        if(type.equals("sms")){
            return new SmsImpl();
        }else if (type.equals("mail")){
            return new MailImpl();
        }else {
            System.out.println("请输入正确类型sms或mail");
            return null;

        }

    }
}
