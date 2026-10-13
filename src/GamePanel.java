import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class GamePanel extends JPanel {
    int x,y,g;
    int mouseX,mouseY;

    public GamePanel() {
        setSize(800, 600);

        Timer timer = new Timer(16, e -> repaint());
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        g.drawString("Game Started", mouseX, mouseY);
    }
}
