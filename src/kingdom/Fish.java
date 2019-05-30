package kingdom;

public class Fish extends AbstractAnimal
{
    public Fish(String name, int yearDiscovered)
    {
        super(name,yearDiscovered);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }
    @Override
    public String reproduce()
    {
        return "eggs";
    }
}