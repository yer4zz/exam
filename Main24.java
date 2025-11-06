//Практика: реализовать дескриптор для проверки, что цена товара всегда > 0.


public class Main24 {
    private double price;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Ошибка: цена товара должна быть больше 0.");
        }
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product product = new Product();

        product.setPrice(100.0); 
        System.out.println("Цена товара: " + product.getPrice());

        product.setPrice(-50.0); 
        System.out.println("Цена товара: " + product.getPrice());
    }
}
