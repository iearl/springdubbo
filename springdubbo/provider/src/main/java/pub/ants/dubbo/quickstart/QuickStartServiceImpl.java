package pub.ants.dubbo.quickstart;


import pub.ants.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

    @Override
    public void sendMsg(String msg) {
        System.out.println(msg+"_impl");
    }
}
