package com.favorites.util.html;

import com.favorites.utils.HtmlUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiangtao
 * @create 2021-05-22-14:14
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class HtmlUtilTest1 {

    public static Logger logger =  LoggerFactory.getLogger(HtmlUtil.class);

    private HtmlUtil htmlUtil;

    @Test
    public void testGetImge(){
        String imge = HtmlUtil.getImge("https://v.qq.com");
        System.out.println(imge);

    }

    @Test
    public void testIsConnect(){
        String url = "https://www.baidu.com";
        boolean connect = HtmlUtil.isConnect(url);
        System.out.println(connect); //true
    }

    @Test
    public void testGetPageImg() throws Exception{
        String pageImg = HtmlUtil.getPageImg("https://v.qq.com");
        System.out.println(pageImg);
    }

    @Test
    public void testExportHtml(){
        StringBuilder sb = new StringBuilder("测试exportHtml");
        StringBuilder sb1 = HtmlUtil.exportHtml("测试title", sb);
        System.out.println(sb1);
    }

    //@Test
    //public void testParseElements() throws IOException {
    //    HashMap<String, List<Map>> resultMap = new HashMap<>();
    //    Element element = new Document("https://uland.taobao.com/sem/tbsearch?refpid=mm_26632258_3504122_32538762&keyword=&clk1=d3eca7e415270fd1a086f0c42b86728c&upsId=d3eca7e415270fd1a086f0c42b86728c");
    //    Map<String, List<Map>> map = HtmlUtil.parseElements(element, resultMap);
    //    for (Map.Entry<String,List<Map>> entry:map.entrySet()) {
    //        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    //    }
    //}


    @Test
    public void testGetCollectFromUrl(){
        String url = "https://blog.csdn.net/tjcyjd/article/details/11111401";
        Map<String, String> map = HtmlUtil.getCollectFromUrl(url);
        for (Map.Entry<String, String> entry:map.entrySet()) {
                    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    @Test
    public void testParseHtmlOne() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("E:\\软件项目管理\\云收藏\\favorites-web-master\\favorites-web-master\\app\\src\\main\\resources\\templates\\index.html");
        Map<String, String> stringStringMap = HtmlUtil.parseHtmlOne(inputStream);
        System.out.println(stringStringMap);
    }

    @Test
    public void testParseHtmlTwo() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("E:\\软件项目管理\\云收藏\\favorites-web-master\\favorites-web-master\\app\\src\\main\\resources\\templates\\user.html");
        Map<String, Map<String, String>> stringMapMap = HtmlUtil.parseHtmlTwo(inputStream);
        System.out.println(stringMapMap);
    }
}
