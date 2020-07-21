import java.util.*;
public class AlternateSorting{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7};
		int b[]=new int[a.length];
		int n=a.length;
		int f=0,k=0;
		int l=n-1;
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				b[k]=a[f];
				f++;
				k++;
			}
			else
			{	
				b[k]=a[l];
				k++;
				l--;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}