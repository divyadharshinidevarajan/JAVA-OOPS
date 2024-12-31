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

class Lion extends animal
{
    void king()
    {
        System.out.println("King of the jungle");
    }
}

public class hierarchyinheritance
{
    public static void main(String[] args) 
    {
        Lion ani1=new Lion();
        ani1.eat();
        ani1.king();
        dog ani2=new dog();
        ani2.eat();
        ani2.barks();
    }
}
