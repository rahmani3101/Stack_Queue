//use main function to push and pop value from stack 

class Stack_OP
{
    final int size =50;
    private int stak[];
    private int top;
    
    public Stack_OP()
    {
        top = 0;
        stak=new int[size];
    }
    public void push(int x)
    {
        stak[++top]=x;
    }
    int pop()
    {
        return stak[top--];   
    }
    public static void main()
    {
        Stack_OP s1 = new Stack_OP();
        s1.push(51);
        s1.push(27);
        s1.push(5);
        System.out.println("\n "+s1.pop());
        System.out.println (" \n "+s1.pop());
        s1.push(18);
        s1.push(72);
        s1.push(517);
        System.out.println("\n " + s1.pop());
    }
}
