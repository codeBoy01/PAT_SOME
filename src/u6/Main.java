package u6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
int n, a, b, c;
String sno, name;
 int cursor = 0;
int max , suma = 0, sumb = 0, sumc = 0, mid = 0;
n = sc.nextInt();
String[][] str = new String[n][5];
for(int i = 0; i < n; i++){
sno = sc.next();
 name = sc.next();
a = sc.nextInt();
b = sc.nextInt();
 c = sc.nextInt();
 str[i][0] = sno;
 str[i][1] = name;
 str[i][2] = String.valueOf(a);//返回String类型的n的值。n现在是int类型，需要想转换成String类型，
str[i][3] = String.valueOf(b);
 str[i][4] = String.valueOf(c);
 max = Math.max((Math.max(a,b)),c);//找成绩最大值
 if(max > mid){
 mid = max;
cursor = i;//记录次数
}
 suma += a; //求和
 sumb += b;
sumc += c;
 }
System.out.println(suma/n + " " + sumb/n + " " + sumc/n);
System.out.println(str[cursor][0]+ " "+str[cursor][1]+" "+str[cursor][2]+" "+str[cursor][3]+" "+ str[cursor][4]);
}
}
