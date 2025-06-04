package com.example.Patern.Structurnie.Bridge;

public abstract class PublicationEntity {
    PaperType paperType;

    public PublicationEntity(PaperType paperType) {
        this.paperType = paperType;
    }

    public abstract void publish();
}
