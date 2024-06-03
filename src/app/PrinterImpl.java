package app;

public class PrinterImpl implements Printer {
    @Override
    public void print(Message message) {
        if (message.getText() == null && message.getSender() == null) {
            new Object() {
                void processEmptyMessage() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            }.processEmptyMessage();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}
