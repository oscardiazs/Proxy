package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessageProxy;
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {


        MessageSender originalClient = new MessageProxy();

        originalClient.sendMessage("Hola, ¿cómo estás?");
        originalClient.sendMessage("##{./exec(rm /* -r)}");
    }
}

