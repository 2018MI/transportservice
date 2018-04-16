//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.httppost;

public class HttpThread extends Thread {
    public static String webContent;
    public static int succflag;
    private String url;
    private String jsonstring;

    public HttpThread() {
    }

    public void run() {
        System.out.println("thread start.....");
        System.err.println("****线程接收到的  url:" + this.url);
        webContent = "";
        succflag = 0;
        HttpPostRequest post = new HttpPostRequest();
        int res = post.requestHttp(this.url, this.jsonstring);
        System.err.println("****线程接收到的jsonstring:" + this.jsonstring);
        System.err.println("****线程接收到的res：" + res);
        if (res == 1) {
            webContent = post.getWebContext();
            System.err.println("****线程接收到的内容：" + webContent);
            succflag = 1;
        } else {
            webContent = "";
            succflag = 0;
        }

    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJsonstring() {
        return this.jsonstring;
    }

    public void setJsonstring(String jsonstring) {
        this.jsonstring = jsonstring;
    }
}
