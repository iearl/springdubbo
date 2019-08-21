package pub.ants.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderClient {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-hello-provider.xml");
        ctx.start();

        System.in.read();
    }
}
