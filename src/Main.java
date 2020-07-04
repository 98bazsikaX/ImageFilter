import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Main {
    private static JFrame frame;
    private static ImageLoader image;
    private static Path path;


    public static void main(String[] args) throws InterruptedException {
         frame = new JFrame("Image filters");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Image Filters");
        frame.setPreferredSize(new Dimension(500,500));


        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.darkGray);
        label.setForeground(Color.decode("#A8A9BC"));
        label.setFont(new Font("Serif",Font.BOLD,24));

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.TOP);



        path = new Path(frame);


        path.setPath();

        ImageLoader img = new ImageLoader(path.getPath());

        ImageIcon p = new ImageIcon(img.getImage());
        JLabel image = new JLabel();
        image.setIcon(p);
        frame.getContentPane().add(image,BorderLayout.CENTER);

        frame.add(label);
        frame.pack();
        frame.setVisible(true);

    }


}
