package Ex_4_2;

public class Client {

    public static void main(String[] args) {
        ImageFile img;
        OperationSystemVersion version;
        img = new BMP();
        version = new WindowsVersion();
        version.setImg(img);
        version.show("让子弹飞");
        System.out.println("=======================================");
        version = new UnixVersion();
        img = new JPG();
        version.setImg(img);
        version.show("让子弹飞");
        System.out.println("=======================================");
        img = new PNG();
        version = new LinuxVersion();
        version.setImg(img);
        version.show("让子弹飞");
        System.out.println("=======================================");
        img = new GIF();
        version = new LinuxVersion();
        version.setImg(img);
        version.show("让子弹飞");
        System.out.println("=======================================");
    }
}
