package Publisher_Subscriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    List<Observer>  WeiXinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        WeiXinUserList.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        WeiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : WeiXinUserList) {
            observer.update(message);
        }
    }
}
