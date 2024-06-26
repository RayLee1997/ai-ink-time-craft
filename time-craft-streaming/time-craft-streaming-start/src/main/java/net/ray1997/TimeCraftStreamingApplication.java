package net.ray1997;

import org.springframework.ai.autoconfigure.ollama.OllamaAutoConfiguration;
import org.springframework.ai.autoconfigure.vectorstore.qdrant.QdrantVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
        exclude = {DataSourceAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class,
                RedisReactiveAutoConfiguration.class, SecurityAutoConfiguration.class,
                QdrantVectorStoreAutoConfiguration.class, OllamaAutoConfiguration.class}
)
public class TimeCraftStreamingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeCraftStreamingApplication.class, args);
    }

}
