import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class HeartTextAnimation extends JPanel implements Runnable {

    private final String word = "I love you Ipsha ";
    private final int totalPoints = 200;
    private final Point2D.Double[] pts = new Point2D.Double[totalPoints];
    private double shift = 0;
    private Image image;

    public HeartTextAnimation() {
        setBackground(Color.black);
        generateHeartPoints();
        // Image path
        image = new ImageIcon("D:/java/center.png/IMG_1076.png").getImage();
        if (image == null) {
            System.out.println("Image not loaded!");
        }
        new Thread(this).start();
    }

    private void generateHeartPoints() {
        for (int i = 0; i < totalPoints; i++) {
            double t = (Math.PI * 2 * i) / totalPoints;
            double x = 16 * Math.pow(Math.sin(t), 3);
            double y = 13 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t);
            pts[i] = new Point2D.Double(x, -y);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        int w = getWidth();
        int h = getHeight();

        g2.translate(w / 2, h / 2);

        // Heart scale
        double scale = 18; // text scale (smaller than image)
        double imgScale = 20; // image scale

        // Calculate heart bounding box
        double maxX = 0, maxY = 0;
        for (Point2D.Double p : pts) {
            maxX = Math.max(maxX, Math.abs(p.x));
            maxY = Math.max(maxY, Math.abs(p.y));
        }

        // Image size slightly smaller than heart
        int imgWidth = (int)(maxX * imgScale * 1.5);
        int imgHeight = (int)(maxY * imgScale * 1.5);

        // Draw image at center
        g2.drawImage(image, -imgWidth/2, -imgHeight/2, imgWidth, imgHeight, null);

        // Draw heart text along border
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        int wordIndex = 0;
        for (int i = 0; i < totalPoints; i += 2) {
            int safeIndex = (int)((i + shift) % totalPoints);
            if (safeIndex < 0) safeIndex += totalPoints;

            Point2D.Double p = pts[safeIndex];
            int x = (int)(p.x * scale);
            int y = (int)(p.y * scale);

            g2.setColor(new Color(255, 100 + (i % 155), 180));
            char ch = word.charAt(wordIndex);
            g2.drawString(String.valueOf(ch), x, y);
            wordIndex = (wordIndex + 1) % word.length();
        }
    }

    @Override
    public void run() {
        while (true) {
            shift += 0.5;
            repaint();
            try { Thread.sleep(50); } catch (Exception ignored) {}
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart Text Animation");
        HeartTextAnimation panel = new HeartTextAnimation();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);
    }
}
