package com.test.controller;



import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

@WebServlet(name = "code", urlPatterns = "/code")
public class code extends HttpServlet {
    private static String appid = null;//appId
    private static String secret = null;//密钥

    /**
     *  获取token
     * @throws ClientProtocolException 异常
     * @throws IOException 异常
     */
    public static String GetUrlS() throws ClientProtocolException, IOException {
        HttpGet httpGet = new HttpGet(
                "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
                        + appid + "&secret=" + secret);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse res = httpClient.execute(httpGet);
        HttpEntity entity = res.getEntity();
        String result = EntityUtils.toString(entity, "UTF-8");
        JSONObject jsons = JSONObject.fromObject(result);
        String expires_in = jsons.getString("expires_in");

        //缓存
        if (Integer.parseInt(expires_in) == 7200) {
            //ok

            return jsons.getString("access_token");
        } else {
            System.out.println("出错获取token失败！");
        }
        return null;
    }


    /**
     * img流转Base64
     * @param bufferedInputStream 图片输入流
     * @return base64
     * @throws IOException 异常
     */
    private static String imgToBase(InputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[bufferedInputStream.available()];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来
        while ((len = bufferedInputStream.read(buffer)) != -1) {
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        bufferedInputStream.close();
        byte[] data = outStream.toByteArray();
        //对字节数组Base64编码
        Base64.Encoder encoder = Base64.getEncoder();
        String base64 = encoder.encodeToString(data);
        base64=base64.replace("/[\r\n]/g", "");
//        System.out.println("data:image/jpeg;base64," + base64);
        return "data:image/jpeg;base64," + base64;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String appid=req.getParameter("appid");
        String secret=req.getParameter("key");
        String parameterar=req.getParameter("par");
        String page=req.getParameter("page");
        code.appid =appid;
        code.secret=secret;
        String a = p(parameterar,page);
        resp.getWriter().println(a);
    }

    /**
     *
     * @param Parameter 携带的参数
     * @param page 跳转的页面
     * @return 二维码
     */
    private String p(String Parameter,String page) {
        try {

            String access_token =GetUrlS();
            URL url = new URL("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + access_token);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");// 提交模式
            // conn.setConnectTimeout(10000);//连接超时 单位毫秒
            // conn.setReadTimeout(2000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            // 发送请求参数
            JSONObject paramJson = new JSONObject();
            paramJson.put("scene", Parameter);
            paramJson.put("page", page);
            paramJson.put("width", 480);
            paramJson.put("auto_color", true);
            /**
             * line_color生效
             * paramJson.put("auto_color", false);
             * JSONObject lineColor = new JSONObject();
             * lineColor.put("r", 0);
             * lineColor.put("g", 0);
             * lineColor.put("b", 0);
             * paramJson.put("line_color", lineColor);
             * */

            printWriter.write(paramJson.toString());
            // flush输出流的缓冲
            printWriter.flush();
            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            return imgToBase(bis);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
