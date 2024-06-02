package net.ray1997.ai.ink.time.craft.application.controller;

import com.google.common.collect.Lists;
import jakarta.annotation.Resource;
import net.ray1997.ai.ink.time.craft.common.MessageUtils;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("api/ai")
public class ChatController {

    private static final String VOICE_STYLE = "teacher";

    @Resource
    OllamaChatModel chatModel;

    @GetMapping("chat/{prompt}")
    public Flux<ChatResponse> chat(@PathVariable String prompt) {

        final List<Message> msg = Lists.newArrayList(
                MessageUtils.getSystemMessage(VOICE_STYLE),
                new UserMessage(prompt)
                                                    );

        return chatModel.stream(new Prompt(msg));
    }
}
