package pattern.Decorator;

public class Xiande extends DecoratorClass {

    private String desc = "加了卤";

    private DecoratorInterfact doufuNao;

    public Xiande(DecoratorInterfact doufuNao){
        this.doufuNao = doufuNao;
    }

    public String add(){
        return doufuNao.add()+"\n" + desc;
    }

    public double price(){
        return doufuNao.price()+1;
    }
}
