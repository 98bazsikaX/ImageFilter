import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageLoader {

    private BufferedImage image;
    private String path;

    public ImageLoader(String path){
       if(path.contains(".")){
            String regex = "\\.";
            int len = path.split(regex).length;
            if(!ExtensionFilter.Checker(path.split(regex)[len-1])){
                new ErrorPanel("Not supported file type " + path.split(regex)[len-1]);
            }
       }else{
           new ErrorPanel("Unknown file format");
       }



    setPath(path);
    setImage();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setImage() throws RuntimeException{

        try {
            image = new BufferedImage(100,100,1);
            image = ImageIO.read(new File(getPath()));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Img not found");
        }
    }


    public BufferedImage getImage() {
        return this.image;
    }
}
