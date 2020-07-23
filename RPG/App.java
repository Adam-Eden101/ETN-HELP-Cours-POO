import entities.*;
import map.*;
import enums.*;

public class App {
    public static void main(String[] args) {
        Player p1 = new Player();

        World world = new World(p1);

        world.drawMap();
        
        world.getPlayer().move(Direction.UP);

        world.drawMap();
        
        world.getPlayer().move(Direction.UP);

        world.drawMap();
        
        world.getPlayer().move(Direction.UP);

        world.drawMap();
        
        world.getPlayer().move(Direction.DOWN);

        world.drawMap();
        
        world.getPlayer().move(Direction.DOWN);

        world.drawMap();
        
        world.getPlayer().move(Direction.LEFT);

        world.drawMap();
    }
}
