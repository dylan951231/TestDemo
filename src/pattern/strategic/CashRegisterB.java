package pattern.strategic;

public class CashRegisterB implements CashRegister {
    @Override
    public double getCashMoney(ParamObject paramObject) {
        double total = paramObject.getTotal();
        double a = paramObject.getParamA();
        return total*a;
    }
}
