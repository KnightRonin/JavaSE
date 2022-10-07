package File;

import java.io.*;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 15:54
 * 目录的拷贝
 **/


public class CopyDir {
    public static void main(String[] args) {
        // 拷贝源
        File srcFile = new File("G:\\PS作业");
        // 拷贝目标
        File destFile = new File("G:\\copyDir");
        // 调用方法拷贝
        copyDir(srcFile, destFile);
    }

    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()) {
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")
                        + srcFile.getAbsolutePath().substring(3);
                System.out.println(path);
                in = new FileInputStream(srcFile);
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] Files = srcFile.listFiles();
        // 得到的file可能是目录或文件
        for (File file : Files) {
            // 获得所有的文件包括目录
//            System.out.println(file.getAbsoluteFile());
            if (file.isDirectory()) {
                String srcDir = file.getAbsolutePath();
                System.out.println(srcDir);
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")
                        + srcDir.substring(3);
                System.out.println(destDir);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copyDir(file, destFile);
        }

    }
}
