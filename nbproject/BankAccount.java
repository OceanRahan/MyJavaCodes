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
public class BankAccount extends Account {
       private String bankName;
       private double balance;
     public BankAccount(String holdname,String holdtype,String bname,double bl,int acNo)
     {
         super(holdname,holdtype,acNo);
         bankName=bname;
         balance=bl;
     }
         public void setbankName(String s)
     {
        bankName=s;
     }
     public void setBalance(double bl)
     {
        balance =bl;
     }
     public String getbankName()
     {
        return bankName;
     }
     public double getBalance()
     {
        return balance;
     }
    
}
