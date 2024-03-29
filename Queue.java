import java.util.Scanner;
class Queue
{
    int que[], capacity ,F,R;
    public Queue(int n)
    {
        F=R=-1;
        capacity =n ;
        que = new int [capacity];
    }
    void Insert(int num)
    {
        if( R == -1 && F==-1)
        { 
            F=R=0;
            que[R]=num;
        }
        else if(R<capacity -1)
        {
            R++;
            que[R]=num;
        }
        else
            System.out.println(" Queue is full ");  
    }   
    int remove()
    {
        int num =-9999;
        if(F>=0 && F<=R)
        {
            num = que[F];
            if(F>R)
                F=R=-1;
        }
        else 
            System.out.println(" Queue is empty ");
        return num;    
    }
    void queueDisplay()
    {
        int i;
        if(F>=0 && F<= R)
        {
            for (i =F; i<= R ; i++)
            {
                System.out.println(que[R]);
            }
        }
        else
            System.out.println(" Queue UnderFlow ");
        
    }
}
