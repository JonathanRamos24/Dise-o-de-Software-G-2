class EmailSender {
    public void sendEmail(String msg) {
        System.out.println("Email: " + msg);
    }
}

class NotificationService {
    private EmailSender sender = new EmailSender();

    public void notifyUser(String msg) {
        sender.sendEmail(msg);
    }
}
