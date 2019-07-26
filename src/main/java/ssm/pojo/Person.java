package ssm.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author wangsheng
 * @date 2019/7/26 0026 下午 2:45
 */

@Getter
@Setter
@ToString
@Component
@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * value="字面量" ${}
     */
//    @Value("${person.name}")
    private String name;

    private String username;

    private Integer age;

    private Map<String,Object> pet;

    private List<String> animal;

    private List<String> interest;

    private List<Object> friends;

    private List<Map<String,Object>> childs;
}
