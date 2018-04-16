//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.springmvc.controller;

import com.example.httppost.HttpThread;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    String urlHead = DatabaseUtil.queryIpPort();

    public TestController() {
    }

    @RequestMapping(
        value = {"/test"},
        method = {RequestMethod.GET}
    )
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView("jsonView");

        try {
            mav.addObject("启动信息", "后台服务程序启动成功！请确认后台服务程序是否成功连接到仿真沙盘：如果" + this.urlHead + "中的IP地址是仿真沙盘的IP地址，则证明连接成功，否则请确认数据库中的IP地址配置是否为仿真沙盘的IP地址，如果不是，请修改数据库中的IP地址配置并重启Tomcat");
        } catch (Exception var3) {
            mav.addObject("success", false);
            mav.addObject("msg", var3.getMessage());
        }

        return mav;
    }

    private void readwait() {
        System.out.println("*********进入计时方法**************");
        int delay_once = 0;

        do {
            try {
                Thread.sleep(50L);
            } catch (InterruptedException var3) {
                var3.printStackTrace();
            }

            ++delay_once;
            if (HttpThread.succflag == 1) {
                return;
            }
        } while(delay_once < 80);

    }

    @RequestMapping({"type/jason/action/GetCarSpeed"})
    public ModelAndView GetCarSpeed(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetCarSpeed";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "超时了。。。");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetCarLocation"})
    public ModelAndView GetCarLocation(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetCarLocation";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetCarAccountBalance"})
    public ModelAndView GetCarAccountBalance(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetCarAccountBalance";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/SetCarMove"})
    public ModelAndView SetCarMove(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/SetCarMove";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/SetCarAccountRecharge"})
    public ModelAndView SetCarAccountRecharge(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/SetCarAccountRecharge";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetCarAccountRecord"})
    public ModelAndView GetCarAccountRecord(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetCarAccountRecord";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetTrafficLightNowStatus"})
    public ModelAndView GetTrafficLightNowStatus(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetTrafficLightNowStatus";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetTrafficLightConfigAction"})
    public ModelAndView GetTrafficLightConfigAction(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetTrafficLightConfigAction";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/SetParkRate"})
    public ModelAndView SetParkRate(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/SetParkRate";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetPakingListReport"})
    public ModelAndView GetPakingListReport(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetPakingListReport";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetParkFree"})
    public ModelAndView GetParkFree(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetParkFree";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetParkRate"})
    public ModelAndView GetParkRate(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetParkRate";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/SetEtcRate"})
    public ModelAndView SetEtcRate(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/SetEtcRate";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetEtcRate"})
    public ModelAndView GetEtcRate(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetEtcRate";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetEtcListReport"})
    public ModelAndView GetEtcListReport(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetEtcListReport";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetAllSense"})
    public ModelAndView GetAllSense(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetAllSense";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetLightSenseValve"})
    public ModelAndView GetLightSenseValve(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetLightSenseValve";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetBusStationInfo"})
    public ModelAndView GetBusStationInfo(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetBusStationInfo";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }

    @RequestMapping({"type/jason/action/GetRoadStatus"})
    public ModelAndView GetRoadStatus(@RequestBody String strjson) {
        ModelAndView mav = new ModelAndView("jsonView");
        String strUrl = this.urlHead + "type/jason/action/GetRoadStatus";
        System.out.println("#####接口进入#######");
        System.out.println("####strjson####" + strjson);
        HttpThread jsonThread = new HttpThread();
        jsonThread.setUrl(strUrl);
        jsonThread.setJsonstring(strjson);
        jsonThread.start();
        this.readwait();
        if (HttpThread.succflag == 1) {
            System.err.println("###HttpThread.webContent###：" + HttpThread.webContent);
            mav.addObject("serverinfo", HttpThread.webContent);
        } else {
            mav.addObject("serverinfo", "timeout！");
        }

        return mav;
    }
}
