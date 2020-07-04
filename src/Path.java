import javax.swing.*;
import java.io.File;

public class Path {

    private String path;
    private JFrame frame;

    public Path(JFrame frame){
        this.frame = new JFrame();
        this.frame  = frame;
    }

    public void setPath(){
        JFileChooser pathDialog = new JFileChooser();

        pathDialog.showOpenDialog(frame);
        File temp = pathDialog.getSelectedFile();

        if(temp == null){

            new ErrorPanel("No picture selected");
        }

        this.path = temp.getAbsolutePath();

    }
    public String getPath(){
        return this.path;
    }
}
