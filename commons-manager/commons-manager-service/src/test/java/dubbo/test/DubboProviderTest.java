package dubbo.test;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j
public class DubboProviderTest {

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext classPathXmlApplicationContext =
                    new ClassPathXmlApplicationContext("classpath*:/spring/spring-introduce.xml");

            classPathXmlApplicationContext.start();
        } catch (BeansException e) {
            log.info("context start error:" + e);
        }
        synchronized (DubboProviderTest.class) {
            while (true) {
                try {
                    DubboProviderTest.class.wait();
                } catch (InterruptedException e) {
                    log.error("synchronizd error:" + e);
                }
                log.info("context start success");
            }
        }
    }

}
