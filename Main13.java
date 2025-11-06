//Практика: реализовать класс NewsAgency, уведомляющий подписчиков


import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}

class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();
    private String news;

    public void addSubscriber(Observer observer) {
        subscribers.add(observer); 
    }

    public void setNews(String news) {
        this.news = news; 
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(news); 
        }
    }
}

class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " получил новость: " + news);
    }
}

public class Main13 {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber john = new Subscriber("John");
        Subscriber jane = new Subscriber("Jane");

        agency.addSubscriber(john);
        agency.addSubscriber(jane);

        agency.setNews("Java is awesome!");
    }
}