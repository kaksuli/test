public class Egret {
    private String color;
    public Egret(String color){
        /*this.*/color = color;
    }
    public Egret(){
        this("White");
    }

    public static void main(String[] args) {
        Egret egret = new Egret();
        System.out.println(("Color:" + egret.color));
    }
}
