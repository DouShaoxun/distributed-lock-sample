package cn.cruder.dousx.dls;

import cn.cruder.dousx.rdl.annotation.EnableRdl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dousx
 */
@EnableRdl
@EnableAspectJAutoProxy
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}