import java.util.*;
class Solution
{
    public static void solve(int n,int d,int x)
    {
        if(x==n)
        {
            System.out.print(d+" ");
        }
        for(int i=1;i<10;i++)
        {
            if(d%10<i)
            {
                solve(n,d*10+i,x+1);
            }
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print(0+" ");
        }
        solve(n,0,0);
        
    }
}