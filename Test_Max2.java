class Test_Max2{
	static void min(int a[]){
		int minValue= a[0];
			for(int i=0; i<a.length; i++)
				if(minValue>a[i])
			minValue=a[i];
		System.out.println("Min values of Array:"+minValue);
	}
	
	static void max(int a[]){
		int  b=a[0];
			for(int i=0; i<a.length; i++)
				if(b<a[i])
					b=a[i];
				System.out.println("big values"+b);
	}
	public static void main(String[] Args){
		int a[]={12,9,39,67,98,58,11,25,63,21};
		
		System.out.println("length of array "+a.length);
		
		max(a);
		min(a);
	}
}