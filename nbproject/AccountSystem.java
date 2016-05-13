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
public class AccountSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentAccount s1=new StudentAccount("Student","Farzana","BUET","full-time",113400);
        s1.Display();
        DepositAccount d1=new DepositAccount("Student","Farzana","Sonali Bank",1000000,113400,3400,1);
        d1.Deposit();
        System.out.println (d1.getBalance());
        d1.getAfterWithdraw(5000);
        d1.getCharged();
        SavingsAccount sa=new SavingsAccount("Student","Farzana","Sonali Bank",1000000,113400,4000,2000,4);        
    }
    
}
