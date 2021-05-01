package lesson7.Homework;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(final Plate p) {
        if (!satiety) {
            satiety = p.decreaseFood(appetite);
        }
    }
    public void info() {
        System.out.printf("Кот %s с аппетитом %d\n", name, appetite, satiety ? "сытый" : "остался голодный");
    }
}

