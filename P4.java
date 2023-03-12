
import java.lang.*;
class P4
{
	public static void main(String args[])
	{
			int tot=0;
			for(int i=0;i<args.length;i++)
			{
				System.out.println("no is:" + args[i]);

				
				tot= tot + Integer.parseInt(args[i]);
				
			}
			System.out.println("total is:" + tot);
		
		
	}
}