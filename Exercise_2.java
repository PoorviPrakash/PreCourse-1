public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data = data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (root == null){
            return true;
        }else{
            return false;
        }
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        if(root.next==null){
            StackNode node = new StackNode(data);
            root.next = node;
            node.next = null;
        }else{
            StackNode temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            StackNode node = new StackNode(data);
            temp.next = node;
            node.next = null;
        }
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root.next==null){
            System.out.println("Stack Underflow! Can't pop item");
            return 0;
        }else{
            StackNode temp = root;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            int popped = temp.next.data;
            temp.next = null;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode temp = root;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
