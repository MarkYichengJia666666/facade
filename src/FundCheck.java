/**
 * Created by jiayicheng on 3/7/17.
 */
public class FundCheck {
    private double cash = 1000.00;

    public double getcashinaccount() {
        return cash;
    }

    public void decreasecash(double cashwithdraw) {
        cash -= cashwithdraw;
    }

    public void increasecash(double cashdeposit) {
        cash -= cashdeposit;
    }

    public boolean haveenoughmoney(double cashtowithdraw) {
        if (cashtowithdraw > getcashinaccount()) {
            System.out.println("Error:You don't have enough money");
            System.out.println("Current Balance:" + getcashinaccount());
            return false;
        } else {
            decreasecash(cashtowithdraw);
            System.out.println("Withdraw Complete: Current Balance is"+getcashinaccount());
            return true;
        }
    }

    public void makedeposit(double cashtodeposit) {
        increasecash(cashtodeposit);
        System.out.println("Deposit Complete: Current Balance is"+getcashinaccount());
    }

}
