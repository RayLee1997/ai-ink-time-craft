package net.ray1997.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"net.ray1997.time.craft.repository"})
public class MybatisConfiguration {

}
