package pattern.singelton;

public class HungaryDemo {

    public static void main(String args[]){

        HungarySingelton singelton1 = HungarySingelton.getSingelton();

        HungarySingelton singelton2 = HungarySingelton.getSingelton();

        System.out.println(singelton1==singelton2);
    }
}

class HungarySingelton{

    private static final HungarySingelton singelton = new HungarySingelton();

    private HungarySingelton(){

    }

    public static HungarySingelton getSingelton(){
        return singelton;
    }
}