package com.madhu511.algorithms.string_array;

public class ReverseWords {
	public static void main(String args[])
	{
		char []vowels = {'a','e','i','o','u'};
		reversewords(vowels);
	}
	public static void reversewords(char []s)
	{
		int i=0;
		for(int j=0;j<s.length;j++)
		{
			if(s[j]==' ')
			{
				reverse(s,i,j-1);
				i=j+1;
			}
		}
		reverse(s, i, s.length-1);
		reverse(s, 0, s.length-1);
	}
	public static void reverse(char []s, int i, int j)
	{
		while(i<j)
		{
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
		}
	}
}
