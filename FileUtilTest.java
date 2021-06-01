package com.favorites.util;

import com.favorites.utils.FileUtil;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;

/**
 * @author jiangtao
 * @create 2021-05-22-21:51
 */
public class FileUtilTest {

    //合法的文件类型
    @Test
    public void testGetFileExtName(){
        String htmlType = "index.html";
        String cssType = "index.css";
        String jsType = "index.js";
        String fileExtName = FileUtil.getFileExtName(htmlType);
        String fileExtName1 = FileUtil.getFileExtName(cssType);
        String fileExtName2 = FileUtil.getFileExtName(jsType);
        System.out.println("htmlType的文件类型为：" + fileExtName);
        System.out.println("cssType的文件类型为：" + fileExtName1);
        System.out.println("jsType的文件类型为：" + fileExtName2);
    }

    //非法的文件类型
    @Test
    public void testGetFileExtName1(){
        String testType1 = "index.aaaaaaaaaaaaa";
        System.out.println("testType1的文件类型为：" + FileUtil.getFileExtName(testType1));

        String testType2 = "abc";
        System.out.println("testType2的文件类型为：" + FileUtil.getFileExtName(testType2));

        String testType3 = "a.b.c";
        System.out.println("testType3的文件类型为：" + FileUtil.getFileExtName(testType3));

        String testType4 = "a.b..c";
        System.out.println("testType4的文件类型为：" + FileUtil.getFileExtName(testType4));
    }

    //测试文件上传
    @Test
    public void testUploadFile() throws Exception {
        File file = new File("src\\test\\1.txt");
        System.out.println(file.getAbsolutePath());
        if (!file.exists()){
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        fw.write("测试上传方法");
        fw.close();

        FileUtil.uploadFile(Files.readAllBytes(file.toPath()), "src\\test\\", "2.txt");


    }


}
