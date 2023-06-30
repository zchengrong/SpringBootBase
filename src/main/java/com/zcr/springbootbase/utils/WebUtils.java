package com.zcr.springbootbase.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 将字符串渲染到客户端
 * @date 2023/6/30 15:09:37
 */
public class WebUtils {
    public static String renderString(HttpServletResponse response, String string) {
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
