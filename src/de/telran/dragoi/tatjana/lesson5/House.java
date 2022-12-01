package de.telran.dragoi.tatjana.lesson5;

public class House {
    public int lenght, width, hight;
    public String adress, owner;

    public House(int hight, String owner) {
        this.hight = hight;
        this.owner = owner;
    }
    private House (String adress, int width, int lenght) {
        this.adress = adress;
        this.width = width;
        this.lenght = lenght;
    }
}






