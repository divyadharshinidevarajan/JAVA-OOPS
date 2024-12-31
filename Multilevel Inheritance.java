class animal
{
    void eat()
    {
        System.out.println("All animal can eat");
    }
}

class dog extends animal
{
    void barks()
    {
        System.out.println("Dog will bark");
    }
}

class Lion extends dog
{
    void king()
    {
        System.out.println("King of the jungle");
    }
}

public class multilevelinheritance
{
    public static void main(String[] args) 
    {
        Lion ani1=new Lion();
        ani1.eat();
        ani1.barks();
        ani1.king();
    }
}
