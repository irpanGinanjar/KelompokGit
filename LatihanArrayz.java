import java.util.Scanner;
public class LatihanArrayz
{

	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah  indeks : ");
			int x = input.nextInt();
			int[] y = new int[x];
			boolean sama;

		System.out.println("   Masukkan nilai ");
		for(int i=0; i<x.length; i++)
		{
			System.out.print("Nilai indeks ke-"+(i)+": ");
			c[i]=input.nextInt();
		}
		System.out.print("Inputkan nilai yang dicari: ");
			int y=input.nextInt() ;
		
		sama=false;
		for(int i=0; i<x.length; i++)
		{
			if(y==x[i])
			{
				sama=true;
				break;
			}
		}
		
		if(sama==true)
		{
			for(int i=0; i<x.length; i++)
			{
				if(y==x[i])
				{
				System.out.print("Nilai "+d+" ada di indeks array ke-"+(i));
				}
			}
		}
		else
		{
			System.out.print("Nilai tidak Ditemukan!");
		}
	}
}