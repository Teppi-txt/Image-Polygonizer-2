import java.awt.Color;
import java.awt.Graphics2D;

public class Shape {
    String type;
    Color color;
    BoundingBox bbox;


    // overides
    public void draw(Graphics2D g){
        throw new Error("Invalid draw call on empty shape.");
    }

    public void print_info(){
        throw new Error("Invalid print call on empty shape.");
    }

    public BoundingBox get_bounding_box() {
        throw new Error("Invalid bounding box call on empty shape.");
    }

    public Color get_color() {
        return this.color;
    }

    public void set_color(Color color) {
        this.color = color;
    }
    
    public String get_type () {
        return this.type;
    }

    public static Vector2 rotate_point(Vector2 point, Vector2 pivot, int angle) {
        double sin = Math.sin(Math.toRadians(angle));
        double cos = Math.cos(Math.toRadians(angle));

        // translate point to origin
        double ox = point.x - pivot.x;
        double oy = point.y - pivot.y;

        Vector2 rotated = new Vector2((int) (ox * cos - oy * sin) + pivot.x, (int) (ox * sin + oy * cos) + pivot.y);
        return rotated;
    }
}

