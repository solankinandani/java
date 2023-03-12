class P5
{
	public static void main(String []args)
	{
		int i,j,r,c,no;
		System.out.print("Enter Row Size:");
		r=Integer.parseInt(System.console().readLine());

		int [][]a=new int [r][];

		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter" + i+1+ "Row coloum:: size::");
			c=Integer.parseInt(System.console().readLine());
			a[i]=new int[c];

		}
		for(i=0;i<a.length;i++)
		{
			System.out.print( i+1+"Row::: :");

			for(j=0;j<a[i].length;j++)
			{

				System.out.print("Enter--"+i+1+"Row---- coloum size.....:" );
				no=Integer.parseInt(System.console().readLine());
				a[i][j]=no;
			}

		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(""+a[i][j]);
			}
			System.out.println();
		}
		
	}
}