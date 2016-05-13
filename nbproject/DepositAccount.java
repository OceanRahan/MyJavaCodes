/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsystem;
import java.io.*;
/**
 *
 * @author Ocean
 */
public class DepositAccount extends BankAccount {
    //boolean interest=false;
    private double depositAmmount;
    private int countCheck;
    DepositAccount(String holdname,String holdtype,String bname,double bl,int acNo,double deposit,int cc)
    {
        super(holdname,holdtype,bname,bl,acNo);
        depositAmmount=deposit;
        countCheck=cc;
    }

    public void Deposit()
    {   
        if(depositAmmount>1000)
        {
            double temp=getBalance()+depositAmmount;
            setBalance(temp);
        }
        else System.out.println("Not Applicable");
    }
    
       public double getAfterWithdraw(int amnt)
    {   
        countCheck++;
        if(countCheck>3)
            return -1;
        if(getBalance()<amnt)
        {   System.out.println("the account does not have this much money");
            return 0;
        }
        else if(getBalance()>amnt)
        {
            return getBalance()-amnt-(depositAmmount*10)/100;
        }
        return 1;
        
    }
        public double getCharged(){
        if(getBalance()<1000)
        {
            return 1000;
        }
        else return 0;
    }
}
