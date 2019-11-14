import java.util.*;

class Subb
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		 int a=((n-k+1)*(n-k+2))/2;
		System.out.println(a);
		
	}
}