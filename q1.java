import java.util.*;
class Factorial implements Runnable
{
    public int x;
    public int fact;
    Factorial()
    {
        this.x=x;
    }
    public void run()
    {
        Scanner t=new Scanner(System.in);
        x=t.nextInt();
        try
        {
            fact=1;
            for(int i=1;i<=x;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of "+x+" is: "+fact);
        }

        catch(Exception e)
        {

        }
    }

}

class Fib implements Runnable
{
    public int i,n;
    long a,b,c;
    Fib()
    {
        a=0;
        b=1;
    }
    public void run()
    {
            Scanner d=new Scanner(System.in);
            n=d.nextInt();
            System.out.print("Series of "+n+" is: "+a+" "+b);
            for(i=2;i<n;++i)
            {
                c = a + b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }
            try
            {
                if(n>5)
                {
                    System.out.println("Thread fibonacci is put into sleep.");
                    Thread.sleep(500);
                }

            }
            catch(InterruptedException e)
            {
                System.out.println("Error : " + e);
            }
        }
}

public class q1 {

    public static void main(String[] args)
    {
        Thread ct=Thread.currentThread();
        System.out.println("Main thread name : "+ct.getName());
        Factorial p=new Factorial();
        Fib f=new Fib();
        Thread fib=new Thread(f,"Fibonacci");
        Thread factorial=new Thread(p,"Factorial");
        fib.start();
        System.out.println("Thread "+ fib.getName() + " started.");
        factorial.start();
        System.out.println("Thread "+ factorial.getName() + " started.");
    }
}
