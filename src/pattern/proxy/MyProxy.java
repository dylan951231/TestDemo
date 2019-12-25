package pattern.proxy;

public class MyProxy implements MyNetWork {

    private MyNetWork netWork = null;

    MyProxy(MyNetWork netWork){
        this.netWork = netWork;
    }

    public boolean check(){
        System.out.println("------check-------");
        return true;
    }

    @Override
    public void browse() {
        check();
        System.out.println("------Proxy-browse-------");
        this.netWork.browse();
    }
}
