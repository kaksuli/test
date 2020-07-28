package three;

public class Cougar extends Puma{
    public static void main(String[] args) {
        Puma puma = new Puma() {
            @Override
            public int getTailLength() {
                return super.getTailLength();
            }
        };
    }
    public int getTailLength(int length){
        return 2;
    }
}
