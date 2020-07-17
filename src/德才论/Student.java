package 德才论;

public class Student{
    int id;
    int d;
    int c;
    int sum;
    int level;
   public Student(int id,int d,int c,int H){
       this.id=id;
       this.d=d;
       this.c=c;
       this.sum=d+c;
       if(d>=H&&c>=H){
           this.level=1;
       }else if(d>=H){
           this.level=2;
       }else if(d<=H&&c<=H&&d>=c){
           this.level=3;
       }else{
           this.level=4;
       }
   }
}
