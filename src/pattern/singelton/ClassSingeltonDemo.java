package pattern.singelton;

public class ClassSingeltonDemo {

    public static void main(String args[]){
        ClassDemo singelton1 = ClassDemo.getSingelton();
        ClassDemo singelton2 = ClassDemo.getSingelton();
        System.out.println(singelton1==singelton2);
    }
}

class ClassDemo{

    private ClassDemo(){ }

    private static class SingeltonNei{
        /**
         * 静态初始化器，由JVM来保证线程安全
         * 而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，
         * 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
         */
        private static final ClassDemo singelton = new ClassDemo();
    }

    public static ClassDemo getSingelton(){
        return SingeltonNei.singelton;
    }
}