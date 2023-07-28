package Publisher_Subscriber;

public class test {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        subscriptionSubject.attach(new WeiXinUser("Anna"));
        subscriptionSubject.attach(new WeiXinUser("Xue"));
        subscriptionSubject.attach(new WeiXinUser("Hao"));
        subscriptionSubject.notify("Mia has found a job in USA");


    }
}
