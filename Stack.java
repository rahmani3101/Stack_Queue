import java.util.Scanner;
class STACK
{
    int a[],size,top;
    public STACK(int n)
    {
        size=n;
        top = -1;
        a=new int[n];
    }
    void push(int v)
    {
        if(top<(size -1))
        {
            ++top;
            a[top]=v;
        }
        else
            System.out.println("OVERFLOW");
    }
    int pop()
    {
        int v =-99999;
        if(top>=0)
        {
            v=a[top];
            --top;
            
        }
        else
            System.out.println("Stack Underflow ");
        return v;    
    }
    public void display()
    {
        int i;
        if(top>=0)
        {
            for(i=top;i>=0;i--)
                System.out.println(a[i]);  
        }
        else
            System.out.println("Empty Stack ");
    }
}
