public class Main
{
    public static int effort;

    public static void main(String[] args)
    {
        calcEffort(100);
        calcEffort(50);
        calcEffort(20);
        calcEffort(360);
        calcEffort(80);
        calcEffort(160);
        calcEffort(500);
        calcEffort(240);
        calcEffort(40);
        calcEffort(40);

        calcPercent(8,3,30);
        calcPercent(9,3,30);
        calcPercent(10,3,30);
        calcPercent(11,3,30);
        calcPercent(8,4,30);
        calcPercent(8,5,30);
        calcPercent(8,6,30);

        calcPercent(8,3,40);
        calcPercent(9,3,40);
        calcPercent(10,3,40);
        calcPercent(11,3,40);
        calcPercent(8,4,40);
        calcPercent(8,5,40);
        calcPercent(8,6,40);

        calcPercent(8,3,35);
        calcPercent(9,3,35);
        calcPercent(10,3,35);
        calcPercent(11,3,35);
        calcPercent(8,4,35);
        calcPercent(8,5,35);
        calcPercent(8,6,35);
    }

    public static int calcEffort(int time)
    {
        effort = effort + time;
        return effort;
    }

    public static void calcPercent(int devs,int length,int hrs)
    {
        double capacity=effort/(double)(devs * length * hrs);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.0f%% of capacity\n",devs, length, hrs, capacity*100);
    }
}
