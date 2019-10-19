package ciscustomermanagement;

/**
 *
 * @author 
 */

import java.util.Objects;

public class Customer
{
    private final String firstName;    // Customer's first name
    private final String lastName;    // Customer's last name
    private final String Email;      // Customer's email
    private final String customerID; // Customer's customerID number
   
    // You can put all together as follow 
    // private final String firstName, lastName, email, customerID; 
/**
 * @param firstName first name of the Customer 
 * @param lastName last name of the Customer
 * @param Email valid email address of the Customer 
 * @param Id unique id number of the Customer 
 */
    
    public Customer(String Id, String firstName, String lastName, String Email) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.customerID = Id;
        
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
  customerID. 
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

    public String getCustomerID() 
    {
        return customerID;
    }
    
    @Override
    
    public int hashCode() 
    {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.getFirstName());
        hash = 31 * hash + Objects.hashCode(this.getLastName());
        hash = 31 * hash + Objects.hashCode(this.getEmail());
        hash = 31 * hash + Objects.hashCode(this.getCustomerID());
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
        final Customer other = (Customer) obj;
       // return other.getId().equals(customerID);
        if (!Objects.equals(this.firstName, other.firstName)) 
        {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) 
        {
            return false;
        }
        return Objects.equals(this.getCustomerID(), other.getCustomerID());
    
    }

    @Override
    
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" +
                lastName + ", Email=" + Email + ", Id=" + customerID + '}';
    }
    
    boolean equals()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
       //To change body of generated methods, choose Tools | Templates.
    }
}  // End of customer class
    
    
    
    

