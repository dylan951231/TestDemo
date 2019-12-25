package pattern.observable;

import java.util.Observable;
import java.util.Random;

public class House extends Observable {

    private float price;

    //当属性变化时，需要设置change点，并且唤醒观察者，传入改变后的值
    public void setPrice() {
        while (true) {
            float pri = new Random().nextFloat() * 100;
            this.setChanged();
            this.notifyObservers(pri);
            this.price=pri;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public float getPrice() {
        return this.price;
    }

}
