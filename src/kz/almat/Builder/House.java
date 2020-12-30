package kz.almat.Builder;

public class House {

    private String walls;
    private String doors;
    private String windows;
    private HouseType type;

    public House(String walls, String doors, String windows, HouseType type){
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.type = type;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", type=" + type +
                '}';
    }
}
