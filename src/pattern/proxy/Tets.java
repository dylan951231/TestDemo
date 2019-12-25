package pattern.proxy;

public class Tets {

    public static void main(String[] args) {
        MyNetWork my =new MyProxy(new MyReal());
        my.browse();
    }
}
