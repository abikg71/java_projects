package guitestingallfeatures2ger;

/**
 * This is just beginning of Complicated GUI App.
 * @author Abinet Kenore
 *@version 020317(Started)
 * 
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GUITestingAllFeatures2ger extends JFrame
{  
    
/** For the seek of the CV in the future codes use, here I am creating some
 * selected colors for the background, border, and others.
 * 
 */
    private static final Color BACKGROUND_COLOR = new Color(255,255,180);
    private static final Color BORDER_COLOR = new Color(100,0,0);
    private static final Color DISK_COLOR = new Color(0,0,180);
    private static final Color MOVE_DISK_COLOR = new Color(180,180,255);

   public GUITestingAllFeatures2ger()
   {
       JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEADING ,2,2));
       /*A FlowLayout simply lines up components in a row across the container.
       The size of each component is equal to that component’s “preferred size.”
       After laying out as many items as will fit in a row across the container,
       the layout manager will move on to the next row.
       
       //public FlowLayout(int align, int hgap, int vgap)
       *
       for detail look jGUI ebook 301 /
       
       p1.setBorder(new TitledBorder("Opitions")); // Title of Options 
       p1.setBackground(Color.LIGHT_GRAY); // This clolor of Bg of Option's- 
       //in darkGray color
       /*JButton is a push button that the user can click to 
       trigger some action.*/
       JButton jbleft = new JButton("Search ");
       JButton jbcenter = new JButton("Add ");
       JButton jbright = new JButton("Save ");
       JButton jbmiddle = new JButton("Update ");
       JButton jbnext = new JButton("Next ");
       JButton jbbottom = new JButton("Cancel ");
       JButton jbexit = new JButton("Exit ");
       
       p1.add(jbleft);
       p1.add(jbcenter);
       p1.add(jbmiddle);
       p1.add(jbright);
       p1.add(jbnext);
       p1.add(jbbottom);
       p1.add(jbexit);
       add(p1);
       
        Font largeFont = new Font("TimesRoman", Font.ITALIC,20);
        JPanel p2 = new JPanel(new GridLayout(1,2,5,5)); 
         
        p2.setBorder(new TitledBorder("Emergency Contact"));// ADD MORE HERE
        Border lineBorder = new LineBorder(Color.RED, 5);
        p2.setBackground((new Color(0,255,0)));
        
        /*An object of type JLabel exists just to display a line of text.
        The text cannot be edited by the user, although it can be changed 
        by your program.
        The JTextField and JTextArea classes represent components that contain 
        text that can be edited by the user. A JTextField holds a single line 
        of text, while a JTextArea can hold multiple lines. It is also possible
        to set a JTextField or JTextArea to be read-only so that the user can
        read the text that it contains but cannot edit the text. Both classes 
        are subclasses of an abstract class, JTextComponent, which defines 
        their common properties.*/
        
        JLabel jlabelblue = new JLabel("EC #1 ");
        jlabelblue.setForeground(Color.BLUE);
        
        JLabel jlabelorange = new JLabel("EC #2 ");
        jlabelorange.setForeground(Color.BLACK);
        
        jlabelblue.setFont(largeFont);
        jlabelorange.setFont(largeFont);
        
        /*
        A BorderLayout layout manager is designed to display one large, central
        component, with up to four smaller components arranged around the edges
        of the central component. If a container, cntr, is using a BorderLayout,
        then a component, comp, should be added to the container using 
        a statement of the form
       //cntr.add( comp, borderLayoutPosition );
        */
        
        jlabelblue.setBorder(lineBorder);
        jlabelorange.setBorder(lineBorder);
        
        p2.add(jlabelblue);
        p2.add(jlabelorange);
        
        JPanel p3 = new JPanel(new GridLayout(1,2,4,5));
        p3.setBorder(new TitledBorder("Description"));
        JLabel jlabelyellow = new JLabel("This were");
        JLabel jlabelgreen = new JLabel("more to be Done");
        p3.setBackground((new Color(238,232,213)));
        p3.add(jlabelyellow);
        p3.add(jlabelgreen);
         
        jlabelyellow.setFont(largeFont);
        jlabelgreen.setFont(largeFont);
        jlabelblue.setBorder(lineBorder);
        jlabelorange.setBorder(lineBorder);
         
      //*****************************************
      /*
      A grid layout lays out components in a grid containing rows and columns 
      of equal sized rectangles.
      The constructor for a GridLayout takes the form “new GridLayout(R,C)”,
      where R is the number of rows and C is the number of columns. 
      */
        setLayout(new GridLayout(3,5));
       
       //  Add lablels and text fields to the frame
        
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("Middle Initial"));
        add(new JTextField(2));
        add(new JLabel("Last name "));
        add(new JTextField(8));
        add(new JLabel("Date of Birth"));
        add(new JTextField(7));
        add(new JLabel("Sex "));
        add(new JTextField(4));
        
        //  Add lablels and text fields to the frame
        setLayout(new FlowLayout(FlowLayout.LEFT, 3, 7));
        add(new JLabel("Address"));
        add(new JTextField(12));
        add(new JLabel("City"));
        add(new JTextField(5));
        add(new JLabel("State"));
        add(new JTextField(4));
        add(new JLabel("ZIP"));
        add(new JTextField(5));
        add(new JLabel("Country"));
        add(new JTextField(5));
        add(p2);
        add(p3);
    }// End of GUI class   
          
    public static void main(String[] args)
    {
        
      JFrame frame = new GUITestingAllFeatures2ger();
      frame.setTitle("Personal Information"); // The Tile of the frame
      frame.getContentPane().setBackground((new Color(200,160,100)));
        //Background colour
      frame.setSize(500, 240); // Set the frame size.
      frame.setLocationRelativeTo(null); // Centers frame;
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true); // Displays the frame
      
    } // End of main 
} // End of class 
// The following are the Scrollpanes
/*JScrollPane.VETICAL_SCROLLBAR_AS_NEEDED
JScrollPane.VETICAL_SCROLLBAR_NEVER
JScrollPane.VETICAL_SCROLLBAR_ALWAYS

JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
       setCorner()
JScrollPane.LOWER_LEFT_CORNER
JScrollPane.LOWER_RIGHT_CORNER
JScrollPane.UPPER_LEFT_CORNER
JScrollPane.UPPER_RIGHT_CORNER
// The following JtabledPane




