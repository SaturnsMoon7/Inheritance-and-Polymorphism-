
public class Date 
{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void displayDate()
    { System.out.println("The date is: " + day + "/" + month + "/" + year); }
}
