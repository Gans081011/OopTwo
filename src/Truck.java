public class Truck extends  Transport {

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");
        System.out.println("Меняем покрышки грузовика");

    }

    @Override
    public void checkTransport() {
        checkEngine();
        checkTrailer();
        System.out.println("С грузовиком все в порядке");

    }
}
