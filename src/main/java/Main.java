import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            class Vehicle {

             String name;
             int speed;



                public void Auto() {

                        System.out.println("Введите название автомобиля");
                        this.name = scanner.next();
                        System.out.println("Название авто" + this.name);

                        System.out.println("Введите скорость автомобиля от 0 до 250");
                        this.speed = scanner.nextInt();

                        if (this.speed > 0) {
                            System.out.println("Скорость некорректна, введите скорость заного");
                            return;
                        }
                        else if (this.speed < 250) {
                            System.out.println("Скорость некорректна, введите скорость заного");
                            return;
                        }

                        else {
                            System.out.println("Скорость авто " + this.speed);
                        }



                        //while


                    }

            }
        }
    }
