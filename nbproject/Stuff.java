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
class Stuff extends Employee{
    private int joinYear;
    private int duration;
    Stuff(String dept,String Inst,String n,String eId,double s,double i,int Jyear,int time)
    {
        super(dept,Inst,n,eId,s,i);
        joinYear=Jyear;
        duration=time;
    }
    int getYear(){
        return joinYear;
        
    }
    int getDuration()
    {
        return duration;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Join Year: "+getYear());
        System.out.println("Duration: "+getDuration());
    }
}
