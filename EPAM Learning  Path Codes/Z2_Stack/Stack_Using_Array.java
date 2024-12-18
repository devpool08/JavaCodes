package Z2_Stack;

class Stack
{
    int a[];
    int capacity;
    int top;
   public  Stack(int size)
    {
        a=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int x)
    {
        if(top==capacity-1)
            System.out.println("Overflow");
        else
        {
            a[++top]=x;
        }
    }
    void  pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow");
           // return -1;
        }
        else
        {
            //int x=a[top];
            top--;
           // return x;
        }
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Underflow");
            return -1;
        }
        else
        {
            return a[top];
        }
    }
}
public class Stack_Using_Array {
    public static void main(String args[]) {
      
      Stack s=new Stack(3);
      s.push(3);
      System.out.println("topmost element="+s.peek());
      s.push(3);
      s.push(45);
      System.out.println("topmost element="+s.peek());
      s.pop();
      System.out.println("topmost element="+s.peek());
      s.push(26);
      s.push(67);
    }
}