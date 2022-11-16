package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("System: " + active);
        System.out.println("Status: " + status);
        System.out.println("Server" + message);
    }

    public static void main(String[] args) {
        Error error = new Error(false, 404, "error");
        Error error1 = new Error(true, 501, "error");
        Error error2 = new Error(true, 200, "error");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
    }
}

