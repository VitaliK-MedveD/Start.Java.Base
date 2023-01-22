package Runner;

import work.work;

public class Runner {

    static String soname = "MedveD";
    static boolean smoking = true;
    static Byte numberOfFriends = 8;
    static Integer index = 246000;

    public static void main(String[] args) {

        String wifeName ="Medved";
        byte wifeAge = 25;
        long creditCard = 1102858596694664L;
        Boolean driverLicense = false;

        work unit1 = new work();

        unit1.setAge((byte) 35);
        unit1.setFootSize(41.5F);
        unit1.setHandSize(8.5F);
        unit1.setHeight(180);
        unit1.setId(13967373515L);
        unit1.setMarried(true);
        unit1.setName("Vladimir");
        unit1.setPets(true);
        unit1.setWeight((short) 70);
        System.out.println("Имя " + unit1.getName());
        System.out.println("Фамилия " + soname);
        System.out.println("Возраст " + unit1.getAge());
        System.out.println("Идентификатор " + unit1.getId());
        System.out.println("Женат " + unit1.isMarried());
        System.out.println("Рост " + unit1.getHeight());
        System.out.println("Вес " + unit1.getWeight());
        System.out.println("Размер ноги " + unit1.getFootSize());
        System.out.println("Размер руки " + unit1.getHandSize());
        System.out.println("Есть питомец " + unit1.getPets());
        System.out.println("Кредитная карта " + creditCard);
        System.out.println("Вредные привычки " + smoking);

        int wife = wifeAge; // При расширении типа данные не теряются.
        int card = (int) creditCard; // Теряется часть данных при сужении типа.
        System.out.println("Карта " + card);

    }
}
