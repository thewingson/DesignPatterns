package kz.almat.Builder;

public class ChineseHouseBuilder implements HouseBuilder {

    private String walls;
    private String doors;
    private String windows;
    private HouseType type = HouseType.CHINESE;

    @Override
    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public HouseBuilder setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public HouseBuilder setWindows(String windows) {
        this.windows = windows;
        return this;
    }

    @Override
    public House build() {
        return new House(this.walls, this.doors, this.windows, this.type);
    }
}
