package pattern.singelton;

public class NoHungrayDemo {

}

class NoHungary{

    private static NoHungary singelton = null;

    private NoHungary(){

    }
    //不安全
    //可以加锁，并双重判断
    public static NoHungary getSingelton(){
        if(singelton ==null){
            singelton = new NoHungary();
        }
        return singelton;
    }

}