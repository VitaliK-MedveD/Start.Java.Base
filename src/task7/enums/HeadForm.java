package task7.enums;

public enum HeadForm {

    ROUND("Круглая"),
    OVAL("Овальная"),
    SQUARE("Квадратная");

    private final String form;

    HeadForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }


}
