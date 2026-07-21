class Box{
    int width;
    int height;
    int depth;
Box(int width, int height, int depth){
    this.width = width;
    this.height = height;
    this.depth = depth;
}
int volume(){
    return width*height*depth;
}
}
public class TestBox{
    public static void main(String[] args){
        Box b1 = new Box(10, 20, 15);
        System.out.println("width : " + b1.width);
        System.out.println("height : " + b1.height);
        System.out.println("depth : " + b1.depth);
        System.out.println("Volume : " + b1.volume());
    }
}