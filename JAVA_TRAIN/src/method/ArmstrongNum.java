package method;

public class ArmstrongNum {
public void arm(int num) {
	int temp=num;
	int num1=num;
	int count=0;
	while(temp!=0)
	{
	 temp/=10;
	 count++;
    }	
	int sum=0;
	while(num1!=0)
	{
	 int last=num%10;
	 int pow=1;
	 for(int i=1;i<=count;i++) 
	 {
		pow=pow*last;
	 }
	sum+=pow;
	num1/=10;
	}
	System.out.println(sum==num?"Armstrong no":"Not Armstrong no");
}

public static ArmstrongNum obejRef()
{
	return new ArmstrongNum();
}
public static void main(String[] args) {
		
	//ArmstrongNum a=new ArmstrongNum ();
	obejRef().arm(153);
	}

}
