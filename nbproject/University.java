/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;
import java.util.Random;
/**
 *
 * @author Ocean
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Community c = null;
        Random rand=new Random();
        int num=rand.nextInt();
        if(num%2==0)
        {
        c = new Teacher("CSE","BUET","X","45",25000.45,40.0,05,"Assistent Professor",2015,201,5.0);
        c.Show();
        }
       else{
           c=new Administrator("CSE","BUET","Y","45",48000.45,50.0,05,"Senior Assistent professor",1987,"First",5.0);
           c.Show();
        }
       
      }
   }

    

