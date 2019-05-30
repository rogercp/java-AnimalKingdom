package kingdom;

import org.graalvm.compiler.lir.aarch64.AArch64Move.Move;

public abstract class AbstractAnimal
{
    private static int maxId=0;
    protected int id;
    protected String name;
    protected int yearDiscovered;
    
    public Animal (String name, int yearDiscovered)
    {
        maxId++;
        this.id=maxId;
        this.name=name;
        this.yearDiscovered=yearDiscovered;
    }

    public void String move()


    public void String breath()
    
    public void String reproduce()


    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public int getName()
    {
        return name;
    }


} 