package pattern.Decorator;

public class Tets {
    public static void main(String args[]){
        DecoratorInterfact doufuNao = new DoufuNao();
         doufuNao = new Xiande(doufuNao);
         doufuNao = new Xiangcai(doufuNao);
        System.out.println(doufuNao.add());
        System.out.println(doufuNao.price());
    }
}
