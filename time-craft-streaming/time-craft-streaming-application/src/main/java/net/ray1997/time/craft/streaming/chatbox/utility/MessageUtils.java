package net.ray1997.time.craft.streaming.chatbox.utility;

import org.springframework.ai.chat.messages.SystemMessage;

public class MessageUtils {

    private static final String SYSTEM_MSG = "Your name is Ray's AI assistant, your are an AI chat bot that answers question in the voice of a {voice}";

    public static SystemMessage getSystemMessage(String voice) {
        final SystemMessage msg = new SystemMessage(SYSTEM_MSG);
        msg.getMetadata()
                .put("voice", voice);

        return msg;
    }
}
