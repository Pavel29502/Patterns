package com.example.Patern.Structurnie.Facade;

public class ComputerFacade {
    private CPU cpu;
    private VideoCard videoCard;
    private Ram ram;
    private HDD hdd;

    public void assemble() {
        System.out.println("Начинаем сборку пк..");
        cpu.instal();
        videoCard.instal();
        ram.install();
        hdd.install();
        System.out.println("Сборка завершена");
    }

    public void buildGamingPC() {
        cpu = new CPU("Intel Core i9");
        videoCard = new VideoCard("Nvidia RTX 4090");
        ram = new Ram(64);
        hdd = new HDD("ssd samsung 256 gb");

        assemble();
    }

    public void buildOfficePC() {
        cpu = new CPU("Intel core i3");
        videoCard = new VideoCard("geforce gtx 770");
        ram = new Ram(8);
        hdd = new HDD("500gb seagate");

        assemble();
    }

    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();

        System.out.println("Zakaz igrovogo pc");
        facade.buildGamingPC();

        System.out.println();

        System.out.println("Zakaz office pc");
        facade.buildOfficePC();
    }
}
