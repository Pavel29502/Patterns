package com.example.Patern.Structurnie.Bridge;

public class RegularPaper implements PaperType {
    @Override
    public void paper(String title) {
        System.out.println("Печатаем на обычной бумаге " + title);
    }
}
