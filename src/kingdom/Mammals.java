package kingdom;

public class Mammals extends AbstractAnimals
{
    public Mammals(String name, int yearDiscovered)
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