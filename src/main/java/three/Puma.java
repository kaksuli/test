package three;

public abstract class Puma implements HasTail{
    public/* must be public because of interface*/ int getTailLength(){
        return 4;
    }
}
