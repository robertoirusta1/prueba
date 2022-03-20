public class array_no_repetido {

	public static void main(String[] args) {
		int[] num=new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i]=0;
		}
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(Math.random()*11+1);
			for(int a=0;a<i;a++)
			{
					if(num[i]==num[a])
					{
						num[i]=(int)(Math.random()*11+1);
						i=-1;
						
						
					}
				}
			
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println("- "+num[i]);
		}

	}

}
