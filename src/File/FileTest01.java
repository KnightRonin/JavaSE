package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 14:11
 **/


public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("src/IO/File/print");

        // 判断文件或路径是否存在
        System.out.println(file.exists());
        // file.mkdir() 创建一个目录
        // file.mkdirs() 创建多级目录
        // file.getParent()、file.getParentFile()获取父级路径
        // 获取文件的最后修改时间

        long l = file.lastModified();
        Date date = new Date(l);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss SSS");
        String format = simpleDateFormat.format(date);
        System.out.println("文件【"+file.getName() + "】最后的修改时间为："+format);
        System.out.println("文件的大小为："+ file.length());
        System.out.println("=======================" );
        // 获取当前目录下所有的子文件
        File src = new File("src/IO/");
        File[] listFiles = src.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile.getAbsoluteFile());
        }
    }
}
