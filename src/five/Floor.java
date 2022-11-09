package five;

public class Floor {
    int length;
    int width;


    int areaOfFloor() {
        return length * width;
    }
    void totalTiles( Tile tile) {
        System.out.println(areaOfFloor()/ tile.areaOfTile());
    }

    public static void main(String[] args) {
        Floor floor = new Floor();
        floor.length = 10;
        floor.width = 2;

        Tile tile = new Tile();
        tile.side = 2;

        floor.totalTiles(tile);

    }
}
