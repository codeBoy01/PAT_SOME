package u7;

public class test4 {
public static void main(String[] args) {
	int s1[]= {5,3,19,27,63,82,97};
	int s2[]= {104,372,658,946,288,777};
	int s3[]=new int[s1.length+s2.length];
	System.arraycopy(s1,0, s3, 0, s1.length);
	System.arraycopy(s2,0, s3, s1.length, s2.length);
	for(int i=0;i<s3.length;i++)
	{
		System.out.print(s3[i]+" ");
	}
}
}
