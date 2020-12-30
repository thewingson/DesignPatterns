package kz.almat.builder;

public abstract class HouseBuilder {

    protected String walls;
    protected String doors;
    protected String windows;
    protected HouseType houseType;

    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder setWindows(String windows) {
        this.windows = windows;
        return this;
    }

    public House build() {
        return new House(this.walls, this.doors, this.windows, this.houseType);
    }

}
