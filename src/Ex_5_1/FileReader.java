package Ex_5_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public String read(String fileNameSrc) {
        System.out.println("读取文件，获取明文。");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream(fileNameSrc);
            int data;
            while ((data = fis.read()) != -1){
                sb.append(data);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }
        return sb.toString();
    }
}
