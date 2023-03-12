class P7
{
	public static void main(String agrs[]) 
	{
		
		char c1[]={'r','u','p','a','r','e','l',};
		String s1=new	 String(c1);
		System.out.println("String is:"+s1);

		int i=Integer.parseInt(System.console().readLine());
		for(i=0;s1[i]<=agrs.length;i++)
		{
			System.out.print("length is:"+s1[i]);
		}
	}
}