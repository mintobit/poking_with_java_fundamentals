package innner_classes;

import innner_classes.utils.Message;

public class I2_LocalInnerClasses {
    public static void main(String[] args) {
        Message message = new Message("Hello, World!");
        // Check out Message::formatForTerminal implementation
        System.out.println(message.formatForTerminal());
    }
}
