
public class Holiday extends Date
{
    private String title;

    public Holiday(int year, int month, int day, String title)
    {
        super(year, month, day);
        this.title = title;
    }
    
    public String getTitle()
    { return title; }
}
