package net.ray1997.time.craft.streaming.chatbox.api.controller;

import com.google.common.collect.Lists;
import net.ray1997.time.craft.streaming.chatbox.utility.MessageUtils;
import org.apache.commons.lang3.StringUtils;
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
public class ChatController {

    private static final String VOICE_STYLE = "teacher";

    //    @Resource
    OllamaChatModel chatModel;

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
    public Flux<ServerSentEvent<String>> flux(@PathVariable String prompt) {
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
        //
        //        return Flux.interval(Duration.ofSeconds(1))
        //                   .map(sequence -> ServerSentEvent.<List<String>>builder()
        //                                                   .id(String.valueOf(sequence))
        //                                                   .event("user-list-event")
        //                                                   .data(this.getSendData(prompt)
        //                                                             .stream()
        //                                                             .map(w -> w + " ")
        //                                                             .toList())
        //                                                   .build());
    }

    public List<String> getSendData(String prompt) {
        if (StringUtils.isBlank(prompt)) {
            prompt = "Ray's AI time craft!";
        }

        final List<String> words = Lists.newArrayList("hello", "world", "from");
        words.add(prompt);

        return words;
    }
}
