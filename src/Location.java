/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    public boolean equals(Object obj){
        //получаем ссылку на объект, проверяем является ли она экземпляром класса Location
        if (obj instanceof Location){
            Location loc = (Location) obj;
            //Если является - сравниваем его координаты
            return (loc.xCoord == xCoord && loc.yCoord == yCoord);
        }
        //Если не является, то возвращаем false
        return false;
    }

    public int hashCode(){
        //Возвращаем хэш-код, "контрольную сумму" объекта по его координатам.
        return (xCoord * xCoord) + (yCoord * (xCoord - 7));
    }
}
