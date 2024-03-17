class Ship {
    protected int xCoordinate;
    protected int yCoordinate;

    public Ship(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setXCoordinate(int x) {
        this.xCoordinate = x;
    }

    public void setYCoordinate(int y) {
        this.yCoordinate = y;
    }
}
