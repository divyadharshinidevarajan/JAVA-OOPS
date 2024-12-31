class calculator
{
    void sum(int a, int b)
    {
        int sum=a+b;
        System.out.println("Total sum: "+sum);
    }

    void sum(int a, int b, int c)
    {
        int sum=a+b+c;
        System.out.println("Total sum: "+sum);
    }

    void sum(int a, int b, int c,int d)
    {
        int sum=a+b+c+d;
        System.out.println("Total sum: "+sum);
    }
}

public class MethonOverloading
{
    public static void main(String[] args) 
    {
        calculator oper=new calculator();
        oper.sum(5,6);
        oper.sum(0,4,5);
        oper.sum(2,0,0,1);
    }
}
