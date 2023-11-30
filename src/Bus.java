public class Bus
{
    private int currentStop;
    private int finalStop;
    private String direction;

    public Bus(int finalStop)
    {
        this.currentStop = 1;
        this.finalStop = finalStop;
        this.direction = "Towards final stop";
    }

    public int getCurrentStop()
    {
        return currentStop;
    }

    public void move()
    {
        if(currentStop == 1)
        {
            direction = "Towards final stop";
        }
        if(currentStop == finalStop)
        {
            direction = "Towards first stop";
        }
        if(direction.equals("Towards final stop"))
        {
            currentStop++;
        }
        if(direction.equals("Towards first stop"))
        {
            currentStop--;
        }
    }
}