class animal
{
    void eat()
    {
        System.out.println("Animals can eat");
    }
}
class dog extends animal
{
    void barks()
    {
        System.out.println("Dogs will bark");
    }
}
public class singleinheritance
{
    public static void main(String[] args) 
    {
        dog Dog=new dog();
        Dog.eat();
        Dog.barks();
    }
}
