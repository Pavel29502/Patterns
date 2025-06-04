package com.example.Patern.Structurnie.Bridge;

public class LaminatedPaper implements PaperType {
    @Override
    public void paper(String title) {
        System.out.println("Печатаем на ламинированной бумаге " + title);
    }
}
