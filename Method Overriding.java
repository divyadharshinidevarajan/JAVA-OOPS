class animal
{
    void forest()
    {
        System.out.println("all animals can eat");
    }
}

class Lion extends animal
{
    @Override
    void forest()
    {
        System.out.println("King of the Jungle !");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        Lion ani1=new Lion();
        animal ani2=new animal();
        ani1.forest();
        ani2.forest();
    }
}
