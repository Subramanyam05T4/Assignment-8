import java.util.*;
class Restaurant
{
public static void main(String args[])
{
int i,p,c=0,c1=0,sum1=0,sum2=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of restaurants:");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
p=sc.nextInt();
System.out.println("The rating for restauarant"+  i +""+ " is"+" "+p);
if(p>=1 && p<=5)
{
c++;
sum1+=p;
}
else if(p>5 && p<=10)
{
c1++;
sum2+=p;
}
else
{
System.out.println("enter p value in between 1 and 10");
}
}
float m=sum1/c;
float d=sum2/c1;
System.out.print("the number of restauarants with in the range(1-5) is:"+c);
System.out.print("the number of restauarants with in the range(6-10) is:"+c1);
System.out.print("the averge ratinng for the range(1-5) is:"+m);
System.out.print("the averge ratinng for the range(5-10) is:"+d);

}
}
