
import java.util.*;
public class Prime {
	
		public int PrimeNums(int input1){
				if(input1>0)
			{
			int arr[]=new int[]{11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
			int temp=0,num=0;
			for(int i=arr.length-1;i>=0;i--)
			{
				for(int j=1;arr[i]*j<=input1;j++)
				{
					if((num=PrimeNums(input1-arr[i]*j))!=-1||(input1-arr[i]*j)==0)
					{
						  if(num==-1)
						  	temp=j;
						  else
							temp=temp+j+num;
							i=0;
							break;	
					}
				}
			}
			
			if(temp!=0)
				return temp;
			}
			return -1;
			}
			public static void main(String args[]){
				 ere  obj=new  ere ();
		    	System.out.println(obj.PrimeNums(121));
	}
	}



	
	
