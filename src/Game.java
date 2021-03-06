import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

class Fire{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Fire(int x, int y) {
        this.x = x;
        this.y = y;

    }
}
public class Game extends JPanel implements KeyListener, ActionListener {

    private int passing_time = 0;
    private int spent_fire = 0;

    private BufferedImage image;

    private ArrayList<Fire> fires = new ArrayList<Fire>();

    private int fire_isY = 1;

    private int ballX = 0;
    private int ball_isX = 2;
    private int space_ShipX =0;

    private int is_SpaceX = 20;



    public Game() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("Space12.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBackground(Color.BLACK);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(ballX,0,20,20);

        g.drawImage(image,space_ShipX,510,image.getWidth()/20, image.getHeight()/20,this);



    }

    @Override
    public void repaint(Rectangle r) {
        super.repaint(r);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
