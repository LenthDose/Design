package Ex_5_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriter {

    public void write(String encryptStr, String fileNameDes){
        System.out.println("保存密文，写入文件");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fileNameDes);
            fos.write(encryptStr.getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }
    }
}
