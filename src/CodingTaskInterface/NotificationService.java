package CodingTaskInterface;

public interface NotificationService {
    void sendNotification(String message);

    default void setDefaultPriority() {
        System.out.println("Setting default priority");
    }
}
