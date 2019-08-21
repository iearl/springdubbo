package pub.ants.dubbo.quickstart;


import pub.ants.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

    @Override
    public String sendMsg(String msg) {
        return "dubbo provider:"+msg;
    }
}
