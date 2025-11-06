//Практика: реализовать класс ComputerBuilder, поэтапно собирающий объект Computer.


public class Main28 {
    private String CPU, GPU;

    public Computer(String CPU, String GPU) {
        this.CPU = CPU;
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU='" + CPU + '\'' + ", GPU='" + GPU + '\'' + '}';
    }
}

public class ComputerBuilder {
    private String CPU, GPU;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, GPU);
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
            .setCPU("Intel i7")
            .setGPU("NVIDIA GTX 3080")
            .build();

        System.out.println(computer);
    }
}
