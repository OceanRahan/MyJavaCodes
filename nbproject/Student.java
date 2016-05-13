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
class Student extends Community{
    private String name;
    private int StudentId;
    private String Status;
    Student(String dept,String inst,String n,int id,String s)
    {
        super(dept,inst);
        name=n;
        StudentId=id;
        Status=s;
    }
    String getName()
    {
        return name;
        
    }
    String getStatus()
    {
        return Status;
    }
    int getId()
    {
        return StudentId;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Name of the community member: "+getName());
        System.out.println("Student Id: "+getId());
        System.out.println("Status: "+getStatus());
    }
    
    
}
