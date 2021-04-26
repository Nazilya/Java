package Homework6;

public class Cat extends Animal {
    String name;
    String color;
    int dlina_run;
    final int cat_run;
    final int cat_sw;


    public Cat(String name,String color, int dlina_run, final int cat_sw) {
        this.name = name;
        this.color = color;
        this.dlina_run = dlina_run;
        this.cat_run = 200;
        this.cat_sw = 0;
    }
    @Override
    public void info() {
        System.out.println("Кот имя: " + name + " Цвет: " + color);
    }
    @Override
    public void jump() {
        System.out.println("Кот подпрыгнул");
    }
    @Override
    public void run(){
        if (dlina_run <= 200) {
        System.out.println(name + " пробежал " + dlina_run + " метров");}
        //else {
        if (dlina_run > 200) {
            System.out.println("Кошка не может пробежать > " + cat_run +" метров");
        }
    }
    @Override
    public void sweem(){
        System.out.println("Кошки не умеют плавать. " + name + " проплыл " + cat_sw +" метров");
    }
}
