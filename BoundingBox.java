public class BoundingBox {
    Vector2 top_left;
    Vector2 bot_right;

    public BoundingBox(Vector2 top_left, Vector2 bot_right) {
        this.top_left = top_left;
        this.bot_right = bot_right;
    }

    public void print() {
        this.top_left.print();
        this.bot_right.print();
    }
}