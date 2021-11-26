package Ex_5_1;

public class Client {

    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("C:\\Users\\Silhouette76\\Desktop\\资料\\新建文本文档.txt", "des.txt");
    }
}
