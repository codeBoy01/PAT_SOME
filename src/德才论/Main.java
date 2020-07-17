package 德才论;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int L=sc.nextInt();
        int H=sc.nextInt();
        ArrayList<Student> al=new ArrayList<Student>();
        for(int i=0;i<N;i++){
            int id=sc.nextInt();
            int d=sc.nextInt();
            int c=sc.nextInt();
            if(d>=L&&c>=L){
                al.add(new Student(id,d,c,H));
            }
        }
        Collections.sort(al,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                int res1=s1.level-s2.level;
                int res2=res1==0?s2.sum-s1.sum:res1;
                int res3=res2==0?(s2.d-s1.d):res2;
                int res4=res3==0?(s1.id-s2.id):res3;
                return res4;
            }
        });
        System.out.println(al.size());
        for(Student s:al){
            System.out.println(s.id+" "+s.d+" "+s.c);
        }
    }
      
}