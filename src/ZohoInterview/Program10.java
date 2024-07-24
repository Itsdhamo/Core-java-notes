package ZohoInterview;

import java.util.Arrays;

public class Program10 
{
	public static void main(String[] args) {
		String s1="BBaa";
		char[] arr = s1.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			 
			if(arr[i]!='\0')
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]='\0';
						 
					}
				}
			}		
		}
		String res="";
		int count=0;
		for(char ch:arr)
		{
			if(ch!='\0')
			{
				count++;
				res=res+ch;
			}
		}
		int result=s1.length()-count;
		
		System.out.println(res+"-->"+count);
		System.out.println(result);
	}

}
