package ciscustomermanagement;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author
 * 
 */
public class CustomerDB
{

    void addCustomer(Customer c)
    {
        
    }

    void updateCustomer(Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
    }
public class CustomerForm extends JFrame implements ActionListener{
   private final JLabel fNameL, lNameL, emailL;
   private final JTextField fNameEdit, lNameEdit, emailEdit;
   private JButton btnSave;
   CustomerDB db;
   Customer currentEditCustomer;
   private CustomerManagerFrame frame;
   public CustomerForm(CustomerDB db , Customer c, CustomerManagerFrame frame)
   {
  
   this.db = db;
   this.currentEditCustomer = c;
   this.frame = frame;
   //fNameL = new JLabel("Enter First Name: ");
   //lNameL = new JLabel("Enter Last Name: ");
   //emailL = new JLabel("Enter E-Mail: ");
  
   //fNameEdit = new JTextField(30);
   //lNameEdit = new JTextField(30);
   //emailEdit = new JTextField(30);
  
  
   //SPecify handlers for each button and add (register) ActionListeners to each button.
   btnSave = new JButton("Save");
   btnSave.addActionListener(this);
  
   if(c != null)
   {
       fNameEdit.setText(c.first_name);
       lNameEdit.setText(c.last_name);
       emailEdit.setText(c.email);
       btnSave.setText("Update");
   }
   setTitle("SCustomer Entry Form");
   this.getContentPane().setLayout(new GridLayout(4, 2, 5, 5));
  
   //Add things to the pane in the order you want them to appear (left to right, top to bottom)
   this.getContentPane().add(fNameL);
   this.getContentPane().add(fNameEdit);
  
   this.getContentPane().add(lNameL);
   this.getContentPane().add(lNameEdit);
  
   this.getContentPane().add(emailL);
   this.getContentPane().add(emailEdit);
  
   this.add(btnSave);
   this.setSize(300, 300);
   this.setVisible(true);
   this.pack();
   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) {
   // TODO Auto-generated method stub
   //Add New Customer
   Customer c = new Customer(CustomerForm.this.fNameEdit.getText(),
   CustomerForm.this.lNameEdit.getText(),
   CustomerForm.this.emailEdit.getText());
if(btnSave.getText().equals("Save"))
      db.addCustomer(c);
else
{
      c.id= currentEditCustomer.customerID;
      db.updateCustomer(c);
}
   CustomerForm.this.setVisible(false);
   frame.rePopulate(db);
   }
    
    
}
    
 // End of CustomerDB class
 