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
public class BasicAccount extends BankAccount {
      private  double CheckAmmount;
      private  int CheckCount;
      private  int CheckBookNo;
      public BasicAccount(String holdname,String holdtype,String bname,double bl,int acNo,double ca,int cc,int cbn)
      {
          super(holdname,holdtype,bname,bl,acNo);
          
      }
     public double getCheckAmount(){
       return CheckAmmount;
    }
    public int getCountChecks(){
       return CheckCount;
    }
    public int getCheckbookNo(){
       return CheckBookNo;
    }
    public void DoCheck(double amnt)
    {  CheckCount++;  
       CheckAmmount=amnt;
       double temp=getBalance()-CheckAmmount;
       setBalance(temp);
       if(CheckCount>5)
       {
           setBalance(temp-100);
       }
    }
}
