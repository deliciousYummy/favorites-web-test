package com.favorites.util;

import com.favorites.utils.URLUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yummy
 * 2021/5/20 19:54
 */
@DisplayName("URL测试")
class URLUtilTest {
    @DisplayName("测试连接成功")
    @Test
    void isConnect() {
        assertEquals(false,URLUtil.isConnect(null));
        assertEquals(true,URLUtil.isConnect("http://localhost:8080/"));
    }

    @Test
    void getDomainUrl() {
        String a = URLUtil.getDomainUrl("http://localhost:8080/index.html");
        assertEquals("http://localhost:8080",a);
    }

    @Test
    void getHost() {
    }

    @Test
    void main() {
    }
}