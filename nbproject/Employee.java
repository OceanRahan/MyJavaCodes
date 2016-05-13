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
class Employee extends Community{
    private String name;
    private String employeeID;
    private double salary;
    private double increment;
    Employee(String dept,String Inst,String n,String eId,double s,double i)
    {
        super(dept,Inst);
        name=n;
        employeeID=eId;
        salary=s;
        increment=i;
    }
    String getName()
    {
        return name;
        
    }
    String getEmployeeId()
    {
        return employeeID;
    }
    double getSalary()
    {
        return salary;
    }
    double getIncrement()
    {
        return increment;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Name of the Employee: "+getName());
        System.out.println("Employee Id: "+getEmployeeId());
        System.out.println("salary: "+getSalary());
        System.out.println("Increment: "+getIncrement());
    }
}