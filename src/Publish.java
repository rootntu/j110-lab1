public class Publish {
    String name;
    String city;

    public Publish(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new NullPointerException("Название должно быть не пустой ссылкой");
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) throw new NullPointerException("Город должен быть не пустой ссылкой");
        this.city = city;
    }

    public Publish[] fillArray() {
        Publish[] publishArray = new Publish[]{
                new Publish("Проспект", "Москва"),
                new Publish("Питер", "Санкт-Петербург"),
                new Publish("БХВ", "Санкт-Петебург"),
                new Publish("Диалектика", "Киев")
        };
        return publishArray;
    }

    public void changeArray(Publish[] publishArray) {
        publishArray[3].setName("Санкт-Петербург");
    }
    //Проспект, Москва;
    // Питер, Санкт-Петербург;
    // БХВ, Санкт-Петебург (ошибка сделана намеренно);
    // Диалектика, Киев
}
