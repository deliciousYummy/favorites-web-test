package com.favorites.util;

import com.favorites.utils.DateUtils;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.springframework.data.auditing.CurrentDateTimeProvider;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jiangtao
 * @create 2021-05-20-19:27
 */
public class DateUtilsTest {

    //获取当前时间为"yyyyMMddHHmmssSSS"格式
    @Test
    public void testGetDateSequence(){
        String dateSequence = DateUtils.getDateSequence();
    }

    //合法时间
    @Test
    public void testGetTimeFormatText(){
        long time = new Date().getTime();
        System.out.println(time);
        //几年前
        String timeFormatText = DateUtils.getTimeFormatText(1589975976771L);
        System.out.println(timeFormatText);
        //几个月前
        String timeFormatText1 = DateUtils.getTimeFormatText(1600000000000L);
        System.out.println(timeFormatText1);
        //几天前
        String timeFormatText2 = DateUtils.getTimeFormatText(1620000000000L);
        System.out.println(timeFormatText2);
        //几个小时前
        String timeFormatText3 = DateUtils.getTimeFormatText(1622500000000L);
        System.out.println(timeFormatText3);
        //几分钟前
        String timeFormatText4 = DateUtils.getTimeFormatText(1622556000000L);
        System.out.println(timeFormatText4);
        //刚刚
        String timeFormatText5 = DateUtils.getTimeFormatText(1622556500000L);
        System.out.println(timeFormatText5);

    }

    @Test
    public void testGetTimeFormatText1(){

        //null
        String timeFormatText = DateUtils.getTimeFormatText(null);
        System.out.println(timeFormatText); //null

        //负的Long型值
        String timeFormatText2 = DateUtils.getTimeFormatText(-1622556500000L);
        System.out.println(timeFormatText2); //100年前

        //未来时间
        String timeFormatText1 = DateUtils.getTimeFormatText(1722556500000L);
        System.out.println(timeFormatText1); //刚刚
    }

    @Test
    public void testGetDayBegin(){
        long dayBegin = DateUtils.getDayBegin(System.currentTimeMillis());
        System.out.println(dayBegin);
        String format = "yyyy-MM-dd HH:mm:ss";
        String toDayString = new SimpleDateFormat(format).format(dayBegin);
        String toDayString1 = new SimpleDateFormat(format).format(System.currentTimeMillis());
        System.out.println("当日0点时间" + toDayString);
        System.out.println("当时时间" + toDayString1);
    }
}
