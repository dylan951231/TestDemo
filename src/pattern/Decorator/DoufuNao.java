package pattern.Decorator;

public class DoufuNao implements DecoratorInterfact  {
    private String descripation = "我是,豆腐脑";

    @Override
    public String add() {
        return descripation;
    }

    @Override
    public double price() {
        return 5;
    }
}
