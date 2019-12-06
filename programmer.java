class Emp{
    float salary = 40000;
    }
    
    public class Pro extends Emp{
    int Bon = 10000;
    public static void main (string args[]){
    Pro p = new Pro();
    System.out.println("salary of programmer is : "+p.salary);
    System.out.println("bonus  of programmer is : "+p.Bon);
    }
    }