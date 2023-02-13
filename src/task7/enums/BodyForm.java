package task7.enums;

public enum BodyForm {

    RECTANGULAR("Прямоугольная"),
    TRIANGULAR("Треугольная"),
    PENTAGONAL("Пятиугольная");

    private final String form;

    BodyForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }
}
