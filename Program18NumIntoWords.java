package assignmentday1;

import sun.applet.Main;

public class Program18NumIntoWords
{
	static void conv_NumberToWord(char[] num)
	{
		int length=num.length;
		if(length==0)
		{
			System.out.println("plz enter a number");
			return;
		}
		if(length>4)
		{
			System.out.println("enter length of number less than 4");
			return;
		}
		String [] single_digits=new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] two_digits=new String[] {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
       String[] tens_multiple=new String[] {"","","twenty","thirty","forty","fifty","sixty","sevety","eighty","ninety"};
       String[] tens_power=new String[] {"hundred","thousand"};
       System.out.println(String.valueOf(num)+": ");
       if(length==1)
       {
    	   System.out.print(single_digits[num[0] - '0']);
    	   return;
       }
       int x=0;
       while(x<num.length)
       {
    	   if(length>=3)
    	   {
    		   if(num[x]-'0'!=0)
    		   {
    			   System.out.print(single_digits[num[x]-'0']+" ");
    			   System.out.print(tens_power[length-3]+" ");
    		   }
    		   --length;
    	   }
    	   else
    	   {
    		   if(num[x]-'0'==1)
    		   {
    			   int sum=num[x]-'0'+num[x]-'0';
    			   System.out.print(two_digits[sum]);
    			   return;
    		   }
    		   else if(num[x]-'0'==2&&num[x+1]-'0'==0)
    		   {
    			   System.out.print("twenty");
    			   return;
    		   }
    		   else
    		   {
    			   int i=(num[x]-'0');
    			   if(i>0)
    			   {
    				   System.out.print(tens_multiple[i]+" ");
    			   }
    				   else
    				   {
    					   System.out.print("");
    				   }
    				   ++x;
    				   if(num[x]-'0'!=0)
    				   {
    					   System.out.print(single_digits[num[x]-'0']);
    				   }
    				   
    			   }
    	   }
    		   ++x;
    		   }
    	   }
       public static void main(String[] args)
       {
    	   conv_NumberToWord("153".toCharArray());
       }
	}	


