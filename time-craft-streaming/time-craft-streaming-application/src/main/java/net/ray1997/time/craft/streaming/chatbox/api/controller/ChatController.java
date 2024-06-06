package net.ray1997.time.craft.streaming.chatbox.api.controller;

import com.google.common.collect.Lists;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import net.ray1997.time.craft.streaming.chatbox.service.ChatBoxService;
import net.ray1997.time.craft.streaming.chatbox.utility.MessageUtils;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class ChatController {

    private static final String VOICE_STYLE = "teacher";

    //    @Resource
    OllamaChatModel chatModel;

    @Resource
    ChatBoxService chatBoxService;

    @GetMapping(
            value = "/chat/{prompt}",
            produces = MediaType.APPLICATION_OCTET_STREAM_VALUE
    )
    public Flux<ChatResponse> chat(@PathVariable String prompt) {

        final List<Message> msg = Lists.newArrayList(MessageUtils.getSystemMessage(VOICE_STYLE),
                                                     new UserMessage(prompt)
        );

        return chatModel.stream(new Prompt(msg));
    }

    @GetMapping(
            value = "/sse/{prompt}",
            produces = MediaType.TEXT_EVENT_STREAM_VALUE
    )
    public Flux<ServerSentEvent<String>> sse(@PathVariable String prompt) {
        return Flux.just("hello", "world", "from", prompt)
                   .map(s -> {
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException _) {
                       }
                       return ServerSentEvent.<String>builder()
                                             .event("sse")
                                             .data(s)
                                             .build();
                   });
    }

    @GetMapping(
            value = "/async/{prompt}",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public String asyncGetData(String prompt) {
        try {
            return chatBoxService.chat(prompt)
                                 .get();
        } catch (Throwable e) {
            log.error("asyncGetData has error!", e);
            throw new RuntimeException(e);
        }
    }
}
