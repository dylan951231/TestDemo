package pattern.strategic;

/**
 * 满减
 */
public class CashRegisterA implements CashRegister{
    @Override
    public double getCashMoney(ParamObject paramObject) {
        double total = paramObject.getTotal();
        double man = paramObject.getParamA();
        double jian = paramObject.getParamB();

        if(total > man){
            total-= jian;
        }
        return total;
    }
}
