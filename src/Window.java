import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel g = new GamePanel();
        add(g);
    }
}
