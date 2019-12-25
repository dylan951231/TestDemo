package pattern.proxy;

public class MyReal implements MyNetWork {
    @Override
    public void browse() {
        System.out.println("---real--browse---");
    }
}
