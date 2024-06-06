package net.ray1997.time.craft.streaming.chatbox.service;

import java.util.concurrent.CompletableFuture;

public interface ChatBoxService {

    CompletableFuture<String> chat(String prompt);
}
