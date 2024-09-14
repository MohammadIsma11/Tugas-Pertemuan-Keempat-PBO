/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEmpat;

/**
 *
 * @author ISMAIL
 */
public class MailException extends Exception{
     public MailException(String s)
    {
        super(s);
    }
     
     public static void main(String args[])
    {
        try {    
            throw new MailException("\nDih Salahhh...");
        }
        catch (MailException ex) {
            System.out.println("Loh kan gabisa!!!\n"+String.valueOf(ex));
 
            
        }
    }
}
