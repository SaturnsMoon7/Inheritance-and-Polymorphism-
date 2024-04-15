public class Window 
{
    private int length;
    private int width;
    private boolean open;

    public Window(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void toggleWindow()
    {
        this.open = !this.open;
        System.out.println(this.open);
    }
}
