package practice.programming;

public class Logical_program 
{

	public static void swapping()
	{
		int a=15;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void armstrong_number()
	{
		int a=153;
		int rem=0;
		int sum=0;
		
		for(int i=a;i>0;i=i/10)    //15 //1
		{
			rem=i%10;  // 153/10=3   15/10=5  // 1/10=1
			sum=sum+rem*rem*rem;  //27  // 125  // 1   // 125+27+1=153
		}
		if(sum==a)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
	
	public static void pallendrome_number()
	{
		int a=12321;
	String str = Integer.toString(a);
	String temp = "";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		temp=temp+str.charAt(i);
	}
	
	int rev = Integer.parseInt(temp);
	
	if(rev==a)	
	{
		System.out.println("pallendrome");
	}
	else
	{
		System.out.println("not pallendrome");
	}
	}
	
	public static void prime_number()
	{
		int a=9;
		int count = 0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
			if (count==1) 
			{
				System.out.println("not prime");
			} 
			else 
			{
				System.out.println(" prime");
			}
		
	}
	
	public static void even_odd()
	{
	int a=24;
	int count = 0;
	
	for (int i = 2; i < a; i++) 
	{
		if(a%2==0)
		{
			count++;
			break;
		}
		
	}
	if (count==1)
	{
		System.out.println("even");
		
	} 
	else
	{
		System.out.println("odd");

	}
	}
	public static void fabinacci_series()
	{
	
		int a=0;
		int b=0;
		int i=0;
		int k=1;
		 while( i<5)
		 {
			 a=b;   //0
			 b=k;   //1
			 k=a+b;
			 System.out.println(a);
			 i++;
		 }
	}
	
	public static void bubble_sort()
	{
		int a[]= {12,11,3,8,34,45};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void second_Highest()
	{
		int a[]= {32,58,9,7,37,72,68};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
		
	}
	
	public static void factorial()
	{
		int a=4;
		int fact = 1;
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void string_rev()
	{
		String str = "shailaja";
		String temp = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
			
		}
		System.out.println(temp);
		
	}
	
	public static void string_rev1()
	{
		String str="shailaja khandekar";
		String str1 = str.replaceAll("  ", "");
		String temp="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			temp=temp+str1.charAt(i);
		}
		System.out.println(temp);
	}
	public static void special_char()
	{
		 String str=" 845120shailaja!@#$% ";
		 String v1 = str.replaceAll("[^\\w]", "");
		 System.out.println(v1);
		 
		 String v2 = str.replaceAll("[\\w]", "");
		 System.out.println(v2);
		 
		 String v3 = str.replaceAll("^a-z" , "");
		 System.out.println(v3);
	}
	
	public static void main(String[] args) 
	{
		//   swapping();
		//   armstrong_number();
		//   pallendrome_number();
		//   prime_number();
		//   even_odd();
		//   fabinacci_series();
		//   bubble_sort();
		//   second_Highest();
		//   factorial();
		//   string_rev();
		//   string_rev1();
		   special_char();
	
	}
}