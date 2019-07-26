package ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ssm.service.HelloService;

/**
 * @author wangsheng
 * @date 2019/7/26 0026 下午 3:54
 * Configuration 指明这是一个配置类
 */

@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中;容器中这个主键的默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){

        System.out.println("配置类给容器中添加组件了");
        return new HelloService();
    }
}
