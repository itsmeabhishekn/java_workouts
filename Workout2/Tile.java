//TODO
// Create a class Tile to store the edge length of a square tile, and create another class Floor to
//store the length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class
//with Tile as an argument to calculate the whole number of tiles needed to cover the floor
//completely.


public class Tile {
    int EdgeLength = 5;

}
class Floor
{
    int floorLength;
    int floorWidth;
    public Floor()
    {
        this.floorLength = 100;
        this.floorWidth = 120;
    }
    Tile t1= new Tile();

    void totalTiles(Tile t)
    {
        //number of tiles required
        float totalFloor = floorLength*floorWidth;
        float tileEdgeLength = t.EdgeLength;
        System.out.println("tiles required are : "+totalFloor/(tileEdgeLength*tileEdgeLength));
            }

    public static void main(String[] args) {
        Floor f1= new Floor();
        Tile t1= new Tile();
        f1.totalTiles(t1);
    }
}
