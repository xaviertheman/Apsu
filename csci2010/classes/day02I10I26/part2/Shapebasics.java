package csci2010.classes.day02I10I26.part2;

public class Shapebasics implements ShapeInterface {
    private int offest;

    public Shapebasics(int offest) {
        this.offest = offest;
    }
     public Shapebasics() {
        this.offest = 0;
    }
     public int getOffset() {
         return offest;
     }
     public void setOffset(int offest) {
         this.offest = offest;
     }


}
