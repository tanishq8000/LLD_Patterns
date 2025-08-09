package Observer_Pattern.Observer;

import Observer_Pattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName,StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMsgOnMobile(userName,"Hurry Up!!, product is available now.");
    }

    private void sendMsgOnMobile(String userName,String msg){
        System.out.println("Message Sent to - " + userName + "that " + msg);
    }
}
