package com.zts1993.Service;

import com.zts1993.Bean.CookieElement;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TianShuo on 14-6-22.
 */
public class KczlLoginService {

    private static Logger log = LogManager.getLogger("KczlLoginService");

    private static String loginURL = "http://202.119.248.68/timetable/login.action";

    private String userId;
    private String strResult;
    private String passwd;

    public String getStrResult() {
        return strResult;
    }

    public void setStrResult(String strResult) {
        this.strResult = strResult;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public KczlLoginService(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    public String login() {


        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(loginURL);
         try {
            ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);

            // Your DATA
            nameValuePairs.add(new BasicNameValuePair("email", userId));
            nameValuePairs.add(new BasicNameValuePair("password", passwd));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "utf8"));
            HttpResponse response = httpclient.execute(httppost);
            /* 若状态码为200，Post成功 */
            if (response.getStatusLine().getStatusCode() == 200) {
                /* 读返回数据 */
                strResult = EntityUtils.toString(response.getEntity());
                List<Cookie> cookies = ((AbstractHttpClient) httpclient).getCookieStore().getCookies();
                if (cookies.isEmpty()) {
                    log.debug("-------Cookie NONE---------");

                } else {
                    CookieElement cookie = new CookieElement();
                    for (int i = 0; i < cookies.size(); i++) {
                        // 保存cookie
                        if (cookies.get(i).getName().toUpperCase()
                                .equals("JSESSIONID")) {
                            cookie.setJSESSIONID(cookies.get(i).getValue());
                        }
                        if (cookies.get(i).getName().toUpperCase()
                                .equals("EMAIL")) {
                            cookie.setEmail(cookies.get(i).getValue());
                        }
                        if (cookies.get(i).getName().toUpperCase()
                                .equals("SESSIONCODE")) {
                            cookie.setSessioncode(cookies.get(i).getValue());
                        }
                        log.debug(cookies.get(i).getName() + "="
                                + cookies.get(i).getValue());

                    }
//                    kczlApplication.sCookie=cookie;
//                    kczlApplication.Cookies=((AbstractHttpClient)httpclient).getCookieStore();//读cookie
                }
            } else {

                strResult = "Error Response:"
                        + response.getStatusLine().toString();

                return "exception";
            }
        } catch (ClientProtocolException e) {

             strResult=e.getMessage();

             e.printStackTrace();
            return "exception";

        } catch (IOException e) {

             strResult=e.getMessage();
            e.printStackTrace();
            return "exception";

        }
        strResult = strResult.trim();

        log.debug(strResult);



        /**
         * JSON示例
         {
         begindate: "学期开始时间",
         birthday: "生日",
         campusname: "地点",
         collegename: "学院",
         email: "学号",
         fieldname: "专业",
         grade: 入学年份,
         natureclassname: "班级",
         realname: "姓名",
         schoolCalendar: null,
         schoolnumber: "学号",
         sessioncode: "sessioncode",
         sex: "男",
         tel: "电话",
         universityname: "学校"
         }
         */

        return "success";


    }


}
