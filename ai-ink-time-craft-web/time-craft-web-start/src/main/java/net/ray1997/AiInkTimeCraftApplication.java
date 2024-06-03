package net.ray1997;

import org.springframework.ai.autoconfigure.ollama.OllamaAutoConfiguration;
import org.springframework.ai.autoconfigure.vectorstore.qdrant.QdrantVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.data.redis.RedisHealthContributorAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.data.redis.RedisReactiveHealthContributorAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.redis.LettuceMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        LettuceMetricsAutoConfiguration.class,
        RedisRepositoriesAutoConfiguration.class,
        RedisReactiveHealthContributorAutoConfiguration.class,
        RedisReactiveAutoConfiguration.class,
        RedisHealthContributorAutoConfiguration.class,
        ManagementWebSecurityAutoConfiguration.class,
        SecurityAutoConfiguration.class,
        QdrantVectorStoreAutoConfiguration.class,
        OllamaAutoConfiguration.class
})
public class AiInkTimeCraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiInkTimeCraftApplication.class, args);
    }

}
