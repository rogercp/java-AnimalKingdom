package kingdom;



public abstract class AbstractAnimals
{
    private static int maxId=0;
    protected int id;
    protected String name;
    protected int yearDiscovered;
    
    public AbstractAnimals (String name, int yearDiscovered)
    {
        maxId++;
        this.id=maxId;
        this.name=name;
        this.yearDiscovered=yearDiscovered;
    }

    public abstract String move();


    public abstract String breathe();
    
    public abstract String reproduce();


    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Animal: "+name+"\n"+"yearDiscovered: "+"\n";
    }

} 