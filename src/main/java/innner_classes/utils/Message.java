package innner_classes.utils;

import java.time.LocalDateTime;

public class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    // Local inner class TerminalFormatter is only available within formatForTerminal method
    // Outside world is not aware of its existence
    public String formatForTerminal() {
        String prefix = String.format("[%s] ", LocalDateTime.now());
        class TerminalFormatter {
            public String format() {
                // local inner classes have access to variables of method they are created in
                return prefix + content.toUpperCase();
            }
        }

        return new TerminalFormatter().format();
    }
}
