package Observer_Pattern.Observable;

import Observer_Pattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded){
        //System.out.println("Before if " + stockCount);
        if(stockCount == 0){
            //System.out.println("Stock is 0 now");
            notifySubscribers();
        }
        //System.out.println("current is "+stockCount);
        //System.out.println("Adding "+newStockAdded);
        stockCount = newStockAdded;
    }

    public int getStockCount(){
        return stockCount;
    }
}
