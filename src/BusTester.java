public class BusTester
{
    public static void main(String[] args)
    {
        Bus bus1 = new Bus(3);

        System.out.println("EXPECTED RESULT : 1");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        bus1.move();

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        bus1.move();

        System.out.println("EXPECTED RESULT : 3");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        bus1.move();

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        bus1.move();
        bus1.move();

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        Bus bus2 = new Bus(5);

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + bus1.getCurrentStop());

        System.out.println("EXPECTED RESULT : 1");
        System.out.println("ACTUAL RESULT   : " + bus2.getCurrentStop());

        Bus b = new Bus(5);

        String route = b.getCurrentStop() + " ";

        for (int i = 0; i < 10; i++) {
            b.move();
            route += b.getCurrentStop() + " ";
        }
        System.out.println("EXPECTED RESULT : 1 2 3 4 5 4 3 2 1 2 3 ");
        System.out.println("ACTUAL RESULT   : " + route);
    }
}