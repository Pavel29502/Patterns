package com.example.Patern.Structurnie.Bridge;

public class Book extends PublicationEntity {

    public Book(PaperType paperType) {
        super(paperType);
    }

    @Override
    public void publish() {
        paperType.paper("Книга: Маугли");
    }

    public static void main(String[] args) {
        PublicationEntity book1 = new Book(new RegularPaper());
        PublicationEntity book2 = new Book(new LaminatedPaper());

        PublicationEntity comix1 = new Comix(new LaminatedPaper());
        PublicationEntity comix2 = new Comix(new RegularPaper());
    }
}
