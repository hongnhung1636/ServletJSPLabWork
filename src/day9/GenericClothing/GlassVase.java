package day9.GenericClothing;

public class GlassVase implements Sized{
    int size;
    public GlassVase(int size){
        this.size = size;
    }
    @Override
    public int getSize(){
        return size;
    }
}