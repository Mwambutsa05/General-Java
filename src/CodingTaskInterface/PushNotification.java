package CodingTaskInterface;

public class PushNotification implements NotificationService {

    public int deviceId;

    public PushNotification(int deviceId) {
        this.deviceId = deviceId;
    }

    public static void main(String[] args) {
        NotificationService service = new PushNotification(001);
        service.sendNotification("Notification Services available");
        service.setDefaultPriority();

        NotificationService service1 = new EmailNotification();
        service1.sendNotification("Notification of a message via Email");

        NotificationService service2 = new SmsNotification();
        service2.sendNotification("Notification of a message via Sms");

        NotificationService service3 = new TsapNotification();
        service3.sendNotification("Notification of a message via WhatsApp");

        NotificationService service4 = new SnapNotification();
        service4.sendNotification("Notification of a message via SnapChat");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(deviceId + "  : Sending Push Notification: " + message);
    }

    @Override
    public void setDefaultPriority() {
        NotificationService.super.setDefaultPriority();
    }
}


class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}


class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(" Sending Sms Notification: " + message);
    }
}

class TsapNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(" Sending Tsap Notification: " + message);
    }
}

class SnapNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(" sending Snap Notification: " + message);
    }
}

