//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.httppost;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpPostRequest {
    private String webContext;

    public HttpPostRequest() {
    }

    public String getWebContext() {
        return this.webContext;
    }

    public void setWebContext(String webContext) {
        this.webContext = webContext;
    }

    public int requestHttp(String url, String strjson) {
        int status = 0;
        DefaultHttpClient mHttpClient = new DefaultHttpClient();
        HttpPost mPost = new HttpPost(url);

        try {
            mPost.setEntity(new StringEntity(strjson));
        } catch (UnsupportedEncodingException var14) {
            var14.printStackTrace();
        }

        try {
            mHttpClient.getParams().setIntParameter("http.socket.timeout", 3000);
            mHttpClient.getParams().setIntParameter("http.connection.timeout", 3000);
            HttpResponse response = mHttpClient.execute(mPost);
            int res = response.getStatusLine().getStatusCode();
            if (res == 200) {
                System.out.println("连接响应值200................");
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String info = EntityUtils.toString(entity);
                    this.setWebContext(info);
                    status = 1;
                }
            } else if (res == 404) {
                status = 404;
            } else if (res == 500) {
                status = 500;
            }
        } catch (ClientProtocolException var10) {
            var10.printStackTrace();
            status = 900;
        } catch (ConnectTimeoutException var11) {
            var11.printStackTrace();
            status = 901;
        } catch (InterruptedIOException var12) {
            var12.printStackTrace();
            status = 902;
        } catch (IOException var13) {
            var13.printStackTrace();
            status = 903;
        }

        return status;
    }
}
