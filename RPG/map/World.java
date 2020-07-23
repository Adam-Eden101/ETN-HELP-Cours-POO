package map;

import java.util.*;
import entities.Player;

/**
 * World
 */
public class World {

    private ArrayList<Tile> map;
    private Player player;


    public World() {
        this.player = new Player();
        initDefaultMap();
    }

    public World(Player player) {
        this.player = player;
        initDefaultMap();
    }

    public World(String path) {
        // INTERPRETER LE FICHIER TEXTE
    }

    public Player getPlayer()
    {
        return (this.player);
    }

    public void initDefaultMap() {
        int x = 0;
        int y = 0;
        
        this.map = new ArrayList<Tile>();

        for (x = 0; x < 10; x++) {
            this.map.add(new Wall(x, y));
        }
        y++;
        x = 0;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 9) {
                    this.map.add(new Wall(x, y));
                } else {
                    this.map.add(new Floor(x, y));
                }
                x++;
            }
            x = 0;
            y++;
        }

        for (x = 0; x < 10; x++) {
            this.map.add(new Wall(x, y));
        }
    }

    public void drawMap() {
        int y = 0;

        for (Tile tile : map) {

            if (tile.getY() > y) {
                System.out.print('\n');
                y++;
            }
            if (tile.getX() == this.player.getX() && tile.getY() == this.player.getY()) {
                System.out.print('P');
            } else {
                System.out.print(tile.getCharacter());
            }
        }
        System.out.print('\n');
    }
}
