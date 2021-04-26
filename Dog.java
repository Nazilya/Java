package Homework6;

public class Dog extends Animal {
    String name;
    String color;
    int dlina_run;
    int dlina_sw;
    final int dog_run;
    final int dog_sw;

    public Dog(String name, String color, int dlina_run, int dlina_sw) {
        this.name = name;
        this.color = color;
        this.dlina_run = dlina_run;
        this.dlina_sw = dlina_sw;
        this.dog_run = 500;
        this.dog_sw = 10;
    }

    @Override
    public void info() {
        System.out.println("Собаку зовут " + name + " Цвет: " + color);
    }

    @Override
    public void jump() {
        System.out.println("Собака подпрыгнула");
    }

    @Override
    public void run() {
        if (dlina_run <= 500) {
            System.out.println(name + " пробежал " + dlina_run + " метров");
        }
        //else {
        if (dlina_run > 500) {
            System.out.println("Собака не может пробежать > " + dog_run + " метров");
        }
    }

    @Override
    public void sweem() {
        if (dlina_sw <= 10) {
            System.out.println(name + " проплыл " + dlina_sw + " метров");
        }
        //else {
        if (dlina_sw > 10) {
            System.out.println("Собака не может проплыть > " + dog_sw + " метров");
        }
    }
}