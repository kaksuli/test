public class Grasshopper {
    public Grasshopper(String n){
        name = n;
    }

    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null; // after this line two is null and garbage collector only can collect one after block
        one = null;
    }

    private String name;
}
