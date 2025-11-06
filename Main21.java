//Практика: реализовать декоратор для логирования вызова функции/


public class Main21 {

    // Интерфейс для операции
    public interface Operation {
        void execute();
    }

    // Конкретная реализация операции
    public static class ConcreteOperation implements Operation {
        @Override
        public void execute() {
            System.out.println("Выполняется операция");
        }
    }

    // Декоратор для логирования
    public static class LoggingDecorator implements Operation {
        private final Operation operation;

        public LoggingDecorator(Operation operation) {
            this.operation = operation;
        }

        @Override
        public void execute() {
            System.out.println("Логирование: начало выполнения метода...");
            operation.execute();
            System.out.println("Логирование: завершение выполнения метода.");
        }
    }

    public static void main(String[] args) {
        // Создаем конкретную операцию
        Operation operation = new ConcreteOperation();

        // Оборачиваем операцию в декоратор логирования
        Operation loggingOperation = new LoggingDecorator(operation);

        // Выполняем операцию с логированием
        loggingOperation.execute();
    }
}
