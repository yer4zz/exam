//Практика: реализовать сервис, который получает репозиторий через конструктор.


public class Main18 {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Service service = new Service(repository);

        service.performAction();
    }
}

class Repository {
    public void fetchData() {
        System.out.println("Fetching data from repository...");
    }
}

class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void performAction() {
        System.out.println("Service is performing an action...");
        repository.fetchData();
    }
}

