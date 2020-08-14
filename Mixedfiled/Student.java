package akenorehw2;
/**
 * This class includes a student's Demography first and last name, email address
 * and student Id
 * @author Abinet Kenore
 * @version 20170124, 
 * CS2050.
 */

import java.util.Objects;

public class Student
{
    private final String firstName;    // Student's first name
    private final String lastName;    // Student's last name
    private final String Email;      // Student's email
    private final String Id;        // Student's Id number
   
    
    // You can put all together as follow 
    // private final String firstName, lastName, email, Id; 
/**
 * @param firstName first name of the student 
 * @param lastName last name of the student
 * @param Email valid email address of the student 
 * @param Id unique id number of the student 
 */
    public Student(String Id, String firstName, String lastName, String Email) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.Id = Id;
        
        CharSequence emailFormat = "@"; // The email must be vallid email
        boolean Symbol;
        Symbol = true;
        
        if(!Email.contains(emailFormat))
        {
            throw new IllegalArgumentException("The Email "
                    + Email+ " is invalid");
        }
    }
/**
 * This following methods will return first name, last name, email, and
 * student Id. 
 * @return  
 * 
 */
    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getEmail() 
    {
        return Email;
    }

    public String getId() 
    {
        return Id;
    }
    
    @Override
    
    public int hashCode() 
    {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.getFirstName());
        hash = 31 * hash + Objects.hashCode(this.getLastName());
        hash = 31 * hash + Objects.hashCode(this.getEmail());
        hash = 31 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.firstName, other.firstName)) 
        {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) 
        {
            return false;
        }
        return Objects.equals(this.getId(), other.getId());
    
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" +
                lastName + ", Email=" + Email + ", Id=" + Id + '}';
    }
    
    boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
}       // End of Class 