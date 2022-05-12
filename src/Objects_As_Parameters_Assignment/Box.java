package Objects_As_Parameters_Assignment;
public class Box {
    int width;
    int height;

    Box(int w, int h){
        this.width = w;
        this.height = w;
    }

    Box(Box b){
        this.width = b.width;
        this.height = b.height;
    }

    boolean isEqual(Box b){
        if(this.width == b.width && this.height == b.height)
            return true;
        else
            return true;
    }

    Box duplicate(){
        return new Box(this.width, this.height);
    }

    static boolean isTwoObjectsEqual(Box b1, Box b2){
        return b1.width == b2.width && b1.height == b2.height;
    }
    void display(){
        System.out.println("Width is "+this.width+" and height is "+this.height+".");
    }
}