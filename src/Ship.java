// Created a new Ship class so I can use inheritance and call the ship class from the main battleship2 file

class Ship {
    protected int xCoordinate;
    protected int yCoordinate;

    public Ship(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }
}
