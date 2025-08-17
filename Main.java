import java.util.Scanner;
class management{
    String Institute;
    public management(){
        System.out.println("Annamacharya");
    }
}
class school extends management{
    String name;
    int age;
    String id;
    int marks;
    void display(String n,int a,String id,int m){
        name=n;
        age=a;
        id=id;
        marks=m;
        System.out.println("Nama: "+name);
        System.out.println("Age: "+age);
        System.out.println("ID: "+id);
        System.out.println("Marks: "+marks);

    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        school s=new school();

        System.out.println("enter the name ");
        String name=sc.nextLine();
        System.out.println("enter the age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the id :");
        String id=sc.nextLine();
        System.out.println("enter the marks:");
        int marks=sc.nextInt();

    }
}
