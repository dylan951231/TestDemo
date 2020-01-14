package pattern.strategic;

public class Starategic {

    private CashRegister cs ;

    Starategic(String strategic){

        switch(strategic){
            case "A":
                cs=new CashRegisterA();
                break;
            case "B" :
                cs = new CashRegisterB();
                break;
            default:
                System.out.println("错误的类型！");
        }
    }

    public void getRes(ParamObject paramObject){
        System.out.println(cs.getCashMoney(paramObject));
    }
}
