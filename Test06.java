package mypackage;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=30;
		int max=(a>b)?a:b;//if (a>b)										
										//max=a
								//else
										//max=b
		System.out.println("Biggest value:"+max);
		
		int max1=((a>b) && (a>c))?a:(b>c)?b:c;
		System.out.println("Biggest of 3 values:"+max1);
	}

}
