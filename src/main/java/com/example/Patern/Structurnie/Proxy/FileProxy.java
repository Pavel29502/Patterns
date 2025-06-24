package com.example.Patern.Structurnie.Proxy;

public class FileProxy implements File {
    private RealFile realFile;
    private final String filename;
    private final String userRole;

    public FileProxy(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    public void open() {
        if (!userRole.equals("admin")) {
            System.out.println("Доступ запрещён - требуется admin");
            return;
        }
        if (realFile == null) {
            realFile = new RealFile(filename);
        }
        realFile.open();
    }

    public static void main(String[] args) {
        File file1 = new FileProxy("секрет.txt", "user");
        file1.open();
        System.out.println();

        File file2 = new FileProxy("секрет.txt", "admin");
        file2.open();
        file2.open();
    }
}
