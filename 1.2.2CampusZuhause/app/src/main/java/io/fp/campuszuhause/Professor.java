package io.fp.campuszuhause;

public class Professor 
{
    private int alter;
    private String name;
    private String forschungsgebiet;
    private boolean spricht=true;
    
    public Professor(int alter, String name, String forschungsgebiet) 
    {
        this.alter=alter;
        this.name=name;
        this.forschungsgebiet=forschungsgebiet;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter=alter;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getForschungsgebiet()
    {
        return forschungsgebiet;
    }
    public void setForschungsgebiet(String forschungsgebiet)
    {
        this.forschungsgebiet=forschungsgebiet;
    }
    public boolean getSpricht()
    {
        return spricht;
    }
    public void setSpricht(boolean spricht)
    {
        this.spricht=spricht;
    }

    @Override
    public String toString() {
        return "Professor [name=" + name + ", alter=" + alter + "]";
    }
}
