package dicerollerapp;

/**
 *
 * @author Abiyu Aserese
 */
public class PairOfDice
{
    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.
    
    public PairOfDice()
    {
                // Constructor.  Rolls the dice, so that they initially
                // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }
    public void roll()
    {
                // Roll the dice by setting each of the dice to be
                // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        
    }
    public int getValue1()
    {
              // Return the number showing on the first die.
           return die1;
    }
    public int  getValue2()
    {
              // Return the number showing on the second die.
           return die2;
    }
    public int getSum()
    {
              // Return the total showing on the two dice.
           return die1 + die2;
    }
        
}  // end class PairOfDice

     

