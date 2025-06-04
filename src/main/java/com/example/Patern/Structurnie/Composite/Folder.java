package com.example.Patern.Structurnie.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    List<FileSystemComponent> newFolder = new ArrayList<>();

    public void add(FileSystemComponent component) {
        newFolder.add(component);
    }

    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent file : newFolder) {
            totalSize += file.getSize();
        }
        return totalSize;
    }

    public static void main(String[] args) {
        File file1 = new File(15);
        File file2 = new File(20);

        Folder folder = new Folder();
        folder.add(file1);
        folder.add(file2);

        Folder rootFolder = new Folder();
        rootFolder.add(folder);

        System.out.println(rootFolder.getSize());
    }
}
