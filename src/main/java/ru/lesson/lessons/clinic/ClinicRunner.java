package ru.lesson.lessons.clinic;

public class ClinicRunner {

    public static void main(String[] arg) {
        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Brow", new Cat("Diggy")));

        clinic.addClient(1, new Client("Nick", new Dog(new Animal("Sparky"))));

        clinic.addClient(
                2, new Client("Ann",
                    new CatDog(
                            new Cat("Tom"), new Dog(new Animal("Piccy"))
                    )
                ));
    }
}
