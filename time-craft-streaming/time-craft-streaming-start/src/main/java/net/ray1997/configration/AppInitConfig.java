package net.ray1997.configration;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppInitConfig {

    @Value("${spring.ai.ollama.base-url}")
    private String ollamaBaseUrl;
    @Value("${spring.ai.ollama.embedding.options.model}")
    private String ollamaEmbeddingModel;

//    @Bean
    OllamaChatModel ollamaChatModel() {
        final OllamaApi ollamaApi = new OllamaApi(ollamaBaseUrl);

        return new OllamaChatModel(ollamaApi, OllamaOptions.create()
                .withModel(OllamaModel.LLAMA3.getModelName())
                .withTemperature(0.9f));
    }

}
