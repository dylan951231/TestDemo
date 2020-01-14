package pattern.Decorator;

public class Xiangcai extends DoufuNao {

    private String desc = "加了鸡蛋";

    private DecoratorInterfact doufuNao;

    public Xiangcai(DecoratorInterfact doufuNao){
        this.doufuNao = doufuNao;
    }

    public String add(){
        return doufuNao.add()+"\n" + desc;
    }

    public double price(){
        return doufuNao.price()+1;
    }
}
