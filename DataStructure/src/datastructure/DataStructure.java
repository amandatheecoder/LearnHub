
package datastructure;

import java.util.Stack;
/**
 *
 * @author Amanda
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Stack<String> stack = new Stack<String>();//LIFO
        //System.out.println(stackSubjects.empty()); BASICALLY IT IS ASKING IF OUR STACK IS EMPTY?
        stack.push("English HL");
        stack.push("Afrikaans");
        stack.push("Life Orientaton");
        stack.push("Maths");
        stack.push("Life Sciences");
        stack.push("History");
        stack.push("Tourism");
        
       System.out.println(stack.empty());
      
       //stack.pop();// you don't have to list the object here because stack will remove the object from the top
       //Let's say you want to see the top item from your stack yiu can use the peek() for that.
       // System.out.println(stack.peek()); // outputs Tourism
       
       // System.out.println(stack.search("History")); //Basically gives you the index position of the object in the stack
       
    }
    
}
