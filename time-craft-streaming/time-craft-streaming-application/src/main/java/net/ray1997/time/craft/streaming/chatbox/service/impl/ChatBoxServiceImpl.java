package net.ray1997.time.craft.streaming.chatbox.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.ray1997.time.craft.streaming.chatbox.service.ChatBoxService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class ChatBoxServiceImpl implements ChatBoxService {

    @Async
    @Override
    public CompletableFuture<String> chat(String prompt) {
        final String msg = "[" + prompt + "] ->" + DateFormatUtils.format(new java.util.Date(),
                                                                          "yyyy-MM-dd HH:mm:ss.ZZ"
        );

        log.info(msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return CompletableFuture.completedFuture(msg);
    }
}
