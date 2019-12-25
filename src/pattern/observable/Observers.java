package pattern.observable;

import java.util.Observable;
import java.util.Observer;

public class Observers implements Observer {

    private String observeName;

    Observers (String observeName){
        this.observeName =observeName;
    }

    @Override
    public void update(Observable o, Object arg) {// 只要改变了 observable 对象就调用此方法
        System.out.println(observeName +"--"+arg.toString());
    }
}
