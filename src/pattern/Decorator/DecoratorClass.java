package pattern.Decorator;

public class DecoratorClass implements DecoratorInterfact {
    private String descripation = "我只是装饰器，不知道具体的描述";

    @Override
    public String add() {
        return descripation;
    }

    @Override
    public double price() {
        return 0;
    }
}
