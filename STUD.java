import java.io.*;
class STUD
{
	public static void main(String args[])
	{
		try
		{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(ir);
			int i ,j,temp, size=5;
			String []snm=new snm[size];
			int []marks=new marks[size];

			
			int []a=new a[size];
	
			for(i=0;i<=size;i++)
			{
				System.out.print("enter name:");
				String snm[i]=br.readLine();
			
				System.out.print("enter marks:");
				 int marks[i] =Integer.parseInt(br.readLine());
			}
			
				for(i=0;i<args.length;i++)
				{
						for(j=0;j<args.length;j++)
						{
							if(a[j]>a[j+1])
							{
								temp=a[j];
								a[j]=a[j+1];
								a[j+1]=temp;
								
							}
						}
				}
					

				
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}