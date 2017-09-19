/**
 * Created by jiayicheng on 3/7/17.
 */
public class AccountNumberCheck {
    private int accountnumber=12345678;
    public int getAccountnumber(){return accountnumber;}
    public boolean accountActive(int accountNumToCheck)
    {
        if(accountNumToCheck==getAccountnumber())
        {return true;
           }
        else
        {return false;
        }
    }
}
