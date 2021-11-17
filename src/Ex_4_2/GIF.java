package Ex_4_2;

public class GIF implements ImageFile{
    @Override
    public void parsing(String osType, String fileName) {
        System.out.println("格式为GIF的图片'"+fileName+"'在"+osType+"平台上显示");

    }
}
