package Observer_Pattern.Observer;

import Observer_Pattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId,StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update(){
        sendEmail(emailId,"Product is now available in Stock, Hurry Up!!");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println("Mail sent to - " + emailId);
    }
}
