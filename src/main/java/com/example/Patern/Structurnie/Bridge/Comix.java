package com.example.Patern.Structurnie.Bridge;

public class Comix extends PublicationEntity {
    public Comix(PaperType paperType) {
        super(paperType);
    }

    @Override
    public void publish() {
        paperType.paper("Комикс: Бэтмэн");
    }
}
