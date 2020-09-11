package oopchallenge;

public class Skin extends Organ {
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Skin color "+this.getColor());
    }

    public String getColor() {
        return color;
    }

}
