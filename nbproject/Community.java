/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author Ocean
 */
abstract class Community{
    private String Department;
    private String Institute;
     public Community(String S1,String S2)
    {
        Department=S1;
        Institute=S2;
    }
    String getDept(){
        return Department;
        
    }
    String getInst()
    {
        return Institute;
    }
    void Show()
    {
        System.out.println("Name of the Department: "+getDept());
        System.out.println("Name of the institution: "+getInst());
    }
}
