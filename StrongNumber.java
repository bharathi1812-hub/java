public class Main{
	public static void main(String[]args){
		int num=145;
		if(strong(num)){
			System.out.println("yes");
		}
		else{
			System.out.println("NO");
		}
	}	
	static int facto(int n)
	 {
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		return fact;
	}
		
 static boolean strong(int num){
	 int digit;
	 int temp=num;
	int sum=0;
	
	 while(temp!=0)
	 {
		digit=temp%10;
		 sum+=facto(digit);
		 temp/=10;
	 }
	 	
	return sum==num;	
		
	}
}
