package Ex_4_2;

public class Client {

    public static void main(String[] args) {
        ImageFile img;
        OperationSystemVersion version;
        img = new BMP();
        version = new WindowsVersion();
        version.setImg(img);
        version.show("让子弹飞");
    }
}
