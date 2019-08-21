package pub.ants.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsumerClient {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-hello-consumer.xml");
        ServiceAPI serviceAPI =(ServiceAPI)ctx.getBean("serviceAPI");
        while (true){
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println(serviceAPI.sendMsg(br.readLine()));
        }

    }
}
