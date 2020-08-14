package ciscustomermanagement;


/**
 *
 * @author 
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CustomerManagerFrame extends JFrame
{
    private JButton jbAdd;
    private JButton jbEdit;
    private JButton jbDelete;
   public  CustomerManagerFrame()
   {
       
        try
        {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            System.out.println(e);
        }
        initComponents();
        setTitle("Customer Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground((new Color(200,160,100)));
        setLocationByPlatform(true);
        setVisible(true);
    }
    
    private void initComponents()
    {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEADING ,2,2));
        JButton email = new JButton("Email");  
        JButton firstName = new JButton("FristName");
        JButton lastName = new JButton("LastName");
        p1.add(email);
        p1.add(firstName);
        p1.add(lastName);
        add(p1);
 
        jbAdd = new JButton("Add ");
        jbEdit = new JButton("Edit ");
        jbDelete = new JButton("Delete ");
        
        JPanel actionButtonPanel = new JPanel();
        actionButtonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        actionButtonPanel.add(jbAdd);
        actionButtonPanel.add(jbEdit);
        add(actionButtonPanel,BorderLayout.EAST);
        actionButtonPanel.add(jbDelete);
        add(actionButtonPanel, BorderLayout.SOUTH);
   } 

    void rePopulate(CustomerDB db) {
        
    }
    
}
