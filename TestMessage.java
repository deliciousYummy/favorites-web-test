package com.favorites.util;

import com.favorites.utils.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jiangtao
 * @create 2021-05-20-19:06
 */
public class TestMessage {

    @Test
    public void testMessage(){
        String[] str = {"你","在","干","什","么"};
        String template = "{0}{1}{2}{3}{4}";
        String message = MessageUtil.getMessage(template, str);
        //预期输出应该为“你在干什么”
        Assert.assertEquals("你在干什么",  message);
    }
}
