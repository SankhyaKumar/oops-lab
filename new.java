import java.util.Scanner

class Student{
    
    private int rollno;
    private String name;
    private float marks[4];
    private char grade;
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        
    
    }
    
   
    
    public float(int a,int b,int c,int d){
        int mark[4];
        
    
    }
    
    public float total(int marks[]){
        float total;
        for(int i=0,i<4;i++){
            total=total+marks[i];
        }
        return total;
    }
    public void read(int rollno,String name, int marks[],char grades){
        this.rollno=rollno;
        this.name=name;
        
    
    }
    public get(int rollno,String name, int marks[],char grades){
        
        System.out.println(rollno,name,grades);
        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }
    
    }
    public void compute(){
           
           if (total(marks)>50){
                grade='A';
           }
           else{
                grade='B';
           }
        
    }
    /*public void Student(int rollno,String name, int matks[],char grades){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
        this.grades=grades;
    }*/

}
