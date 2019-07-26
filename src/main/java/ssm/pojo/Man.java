package ssm.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wangsheng
 * @date 2019/7/26 0026 下午 3:02
 *
 * @Component 注入主键
 * @ConfigurationProperties 加入到容器中
 */

@Component
@ConfigurationProperties(prefix = "man")
@Getter
@Setter
@ToString


public class Man {

    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birth;

    private Map<String,Object> maps;

    private List<Object> lists;

    private Dog dogs;
}
