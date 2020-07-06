import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageFilter {


    private BufferedImage img;
    private BufferedImage temp_image;

    public ImageFilter(BufferedImage img){
        this.img = img;
        this.temp_image = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_RGB);
        Greyscale();
    }


    public void Greyscale(){
            int red;
            int green;
            int blue;
            int gray;
            Color pixel;
            Color temp_pixel;

        for(int i = 0;i<img.getHeight();++i){
            for(int j = 0;j<img.getWidth();++j){
               pixel = new Color(img.getRGB(j,i));

               red = pixel.getRed();
               green = pixel.getGreen();
               blue = pixel.getBlue();

               gray = avarage(red,green,blue);

               temp_pixel = new Color(gray,gray,gray);

                temp_image.setRGB(j, i, temp_pixel.getRGB());
     




            }
        }
    }

    private int avarage(int red, int green, int blue){
        return (int) (red+green+blue)/3;
    }

    public BufferedImage getTemp() {
        return temp_image;
    }
}
