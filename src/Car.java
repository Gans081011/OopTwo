public class Car extends Transport {

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки автомобиля");
        System.out.println("Меняем покрышки автомобиля");
        System.out.println("Меняем покрышки автомобиля");
        System.out.println("Меняем покрышки автомобиля");

    }

    @Override
    public void checkTransport() {
        checkEngine();
        System.out.println("С автомобилем все в порядке");

    }
}

