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
public class Account {
    
    private String holderName;
    private String holderType;
    private int accountNumber;
    public Account(String holdname,String holdtype,int No)
    {
        holderName=holdname;
        holderType=holdtype;
        accountNumber=No;
        
    }
        public void setName(String name){
        holderName=name;
    }
    public void setNum(int num){
        accountNumber=num;
    }
    public void setType(String type){
        holderType=type;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getName()
    {
        return holderName;
    }
    public String getType()
    {
        return holderType;
    }
    
}
