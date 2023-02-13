package task7.manufacture;

import task7.enums.BodyForm;

public class Body implements Form {

    private BodyForm body;
    private String form;

    @Override
    public void createRandomForm() {
        switch (random.nextInt(1, 4)) {
            case 1:
                body = BodyForm.TRIANGULAR;
                form = body.getForm();
                break;
            case 2:
                body = BodyForm.RECTANGULAR;
                form = body.getForm();
                break;
            case 3:
                body = BodyForm.PENTAGONAL;
                form = body.getForm();
                break;
        }
    }

    public Body() {
    }

    public String getForm() {
        return form;
    }
}
