package Observer_Pattern;

import Observer_Pattern.Observable.IphoneObservableImpl;
import Observer_Pattern.Observable.StocksObservable;
import Observer_Pattern.Observer.EmailAlertObserverImpl;
import Observer_Pattern.Observer.MobileAlertObserverImpl;
import Observer_Pattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("test1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("test2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("test1234",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);
    }
}
