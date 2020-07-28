package eight;

public class Deer {
    public Deer(){
        System.out.print("Deer");
    }
    public Deer(int age){
        System.out.print("DeerAge");
    }

    private boolean hasHorns(){
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }

    /*
    private methods are not inherited and not overridden.
    Thus, when you call deer.hasHorns(), the method executed is Deer#hasHorns.
    In fact, if you move the main method from Deer to Reindeer or another class, that piece of code will fail.
     */
}
