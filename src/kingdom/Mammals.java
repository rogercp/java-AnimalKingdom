package kingdom;

public class Mammal extends AbstractAnimal
{
    public Mammal(String name, int yearDiscovered)
    {
        super(name,yearDiscovered);
    }

    @Override
    public String move()
    {
        return "walks";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }
    @Override
    public String reproduce()
    {
        return "live births";
    }

}