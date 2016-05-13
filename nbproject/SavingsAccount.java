/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsystem;

/**
 *
 * @author Ocean
 */
public class SavingsAccount extends BankAccount {
 
    private double depositAmmount;
    private double withdrawalAmmount;
    private int passBookNO;
    public SavingsAccount(String holdname,String holdtype,String bname,double bl,int acNo,double deposit,double withdrl,int bNo)
    {
        super(holdname,holdtype,bname,bl,acNo);
        depositAmmount=deposit;
        withdrawalAmmount=withdrl;
        passBookNO=bNo;
    }
      public double getDepositAmount(){
        return depositAmmount;
        
    }
    public double getWithdrawalAmount()
    {
        return withdrawalAmmount;
    }
    public int getPassBookNumber(){
        return passBookNO;
    }
    public void Deposit(int amount)
    {
        double temp=getBalance()+amount;
        setBalance(temp);
    }
    public double DoWithdrawal(int amount)
    {
        if(amount>getBalance())
            return 0;
        else return (amount+(getBalance()*15)/100);
    }
    public double ChargeSavings(){
        if(getBalance()<500)
            return 100.0;
        else return 0.0;
    }
}
