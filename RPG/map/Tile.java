package map;

/**
 * Tile
 */
public class Tile {

    protected char character;
    protected Boolean is_walkable;
    protected int x;
    protected int y;

    public Tile(char character, Boolean is_walkable, int x, int y) {
        this.character = character;
        this.is_walkable = is_walkable;
        this.x = x;
        this.y = y;
    }

    public char getCharacter() {
        return (this.character);
    }
    
    public int getX() {
        return (this.x);
    }
    
    public int getY() {
        return (this.y);
    }
}