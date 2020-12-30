package kz.almat.Builder;

public interface HouseBuilder {

    HouseBuilder setWalls(String walls);
    HouseBuilder setDoors(String doors);
    HouseBuilder setWindows(String windows);
    House build();

}
