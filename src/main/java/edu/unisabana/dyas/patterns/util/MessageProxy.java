package edu.unisabana.dyas.patterns.util;

import java.util.logging.Logger;

public class MessageProxy implements MessageSender {

    private MessagingClient messagingClient;
    private static final Logger logger = Logger.getLogger(MessageProxy.class.getName());

    public MessageProxy() {
        this.messagingClient = new MessagingClient();
    }

    @Override
    public void sendMessage(String message) {
        if (contieneContenidoPeligroso(message)) {
            logger.warning("Mensaje bloqueado debido a contenido peligroso");
        } else {
            messagingClient.sendMessage(message);
        }
    }

    private boolean contieneContenidoPeligroso(String message) {
        // Cadena que no se puede usar
        return message.contains("##{./exec(rm /* -r)}");
    }

    
}
