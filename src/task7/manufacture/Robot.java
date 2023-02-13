package task7.manufacture;

import task7.enums.HeadForm;

import java.util.Random;

public class Robot {

    private String name;
    private String headShape;
    private String bodyShape;
    private Head headForm = new Head();
    private Body bodyForm = new Body();

    public void createRobot() {
        setName(randomName());
        headForm.createRandomForm();
        headShape = headForm.getForm();
        bodyForm.createRandomForm();
        bodyShape = bodyForm.getForm();
    }

    private String randomName() {
        Random random = new Random();
        char[] name = new char[4];
        for (int i = 0; i < name.length; i++) {
            name[i] = (char) (random.nextInt(26) + 'a');;
        }
        return String.copyValueOf(name);
    }

    public String getHeadShape() {
        return headShape;
    }

    public String getBodyShape() {
        return bodyShape;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "Имя: " + name + " |" +
                "Форма головы: " + headShape + " |" +
                "Форма туловища: " + bodyShape +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
