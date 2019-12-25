package pattern.observable;

public class Tets {
    public static void main(String[] args) {

        House h =new House();
        Observers ob1 = new Observers("ob1");
        Observers ob2 = new Observers("ob2");
        Observers ob3 = new Observers("ob3");

        //给被观察者添加件事对象
        h.addObserver(ob1);
        h.addObserver(ob2);
        h.addObserver(ob3);

     //   h.setPrice1(1000);
        new Thread(()-> h.setPrice()).start();
    }
}
