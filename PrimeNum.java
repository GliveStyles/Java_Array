class PrimeNum{
	public static void main(String[] Args){
		int n=7 , c=0;
		for(int i=2; i<=n; i++)
		{
			if(n%i==0){
				c++;
			}
		}
		if(c==1){
			System.out.println("its a prime number");
		}else{
			System.out.println("its a not prime number");
		}
	}
}
			