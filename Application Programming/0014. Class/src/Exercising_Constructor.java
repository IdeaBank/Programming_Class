public class Exercising_Constructor
{
    public static void main(String[] args)
    {
        Plane[] planes = {
                new Plane("Boeing", "Boeing777-200ER", 440),
                new Plane("Boeing", "Boeing777-300ER", 550)
        };
        System.out.println(planes[0].PlaneExplanation());
    }
}

class Plane
{
    Plane()
    {
        this.producer = null;
        this.modelName = null;
        this.maxPassenger = 0;
    }

    Plane(String producer, String modelName, int maxPassenger)
    {
        this.producer = producer;
        this.modelName = modelName;
        this.maxPassenger = maxPassenger;
    }

    String PlaneExplanation()
    {
        return "Producer : " + this.producer + "\nModel Name : " + this.modelName + "\nMax Passenger : " + this.maxPassenger;
    }

    private String producer;
    private String modelName;
    private int maxPassenger;
}
