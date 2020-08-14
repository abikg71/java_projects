package akenorehw5;

/**
 * Implementation of Stack interface using an array. In this implementation
 * the top is initialized to 0. If top is 0 then it is empty. In this
 * implementation top always points to an empty location. The
 * stack will be full if top equals size.
 * @param <Character>
 */

public class Stack<Character> //implements StackInterface<T>
{ 
    private final Character[] stack;
    private int top;
    private final int size; //Size of the stack.
    
    /**
     * Constructor initializes the top to 0. It takes one argument (size).
     * Array of the given size is created to represent the stack.
     * @param size Size of the array.
     */
    
    public Stack (int size)
    {
        this.size = size; 
        Object[] stackO = new Object[size];
        
        stack = (Character[]) stackO;
        top = 0;
    }

    /**
     * This method will add a new entry to the top of the stack if space is
     * available.
     * @param nextcharacter
     * @return It will return true if item was successfully added to the stack,
     * otherwise it will return false.
     */
    
    public boolean push (Character nextcharacter)
    {
        boolean result = false;
        
        if (!isFull())
        {
            stack[top] = nextcharacter;
            top++;
            result = true;
        }
        
        return result;
    }
    
    /**
     * Item is removed from the top of the stack and it is returned
     * @return Item removed from the stack, null if stack is empty
     */
    
    public Character pop()
    {
        Character data = null;
        
        if (!isEmpty())
        {
            top--;
            data = stack[top];
        }
        
        return data;
    }
    
    /**
     * Top item on the stack is returned but not removed from the stack.
     * @return Top item on the stack, null if stack is empty
     */
    
    public Character peek()
    {
        Character data = null;
        
        if (!isEmpty())
        {
            data = stack[top-1];
        }
        
        return data;
    }
    
    /**
     * Check if the stack is empty
     * @return True if stack is empty, otherwise it returns false.
     */
    
    public boolean isEmpty()
    {
        return (top == 0);
    }
    
    /**
     * Check if the stack is full
     * @return True if stack is full, otherwise it returns false.
     */
    
    public boolean isFull()
    {
        return (top == size);
    }
    
    /**
     * Removes all items from the stack.
     */
    
    public void clear()
    {
        top = 0;
    }
}
