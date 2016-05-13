/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsystem;
//import java.io.*;
/**
 *
 * @author Ocean
 */
public class StudentAccount extends Account {
     private String institute;
     private String status;
    public StudentAccount(String holdtype,String holdname,String inst,String sts,int acNo)
    {
        super(holdtype,holdname,acNo);
        institute=inst;
        status=sts;
    }
      public void setInstitution(String s)
    {
        institute=s;
    }
    public void setStatus(String sts)
    {
        status=sts;
    }
    public String getInst()
    {
        return institute;
    }
    public String getStatus()
    {
        return status;
    }
    public void Display()
    {
        System.out.println(getName());
        System.out.println(getType());
        System.out.println(getInst());
        System.out.println(getStatus());
        System.out.println(getAccountNumber());
        
      
    }
    
}
  
