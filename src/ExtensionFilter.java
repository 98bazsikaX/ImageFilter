public class ExtensionFilter {
    private static String[] img_ext = {"jpeg","jpg","gif","tiff","tif","png"};

   public static boolean Checker(String ext){
       for(String e : img_ext ){
           if(e.toLowerCase().equals(ext.toLowerCase())){
                return true;
           }
       }

       return false;


   }


}
