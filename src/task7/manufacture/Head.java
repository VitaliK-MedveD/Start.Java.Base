package task7.manufacture;

import task7.enums.HeadForm;

public class Head implements Form {

    private HeadForm headForm;
    private String form;

    @Override
    public void createRandomForm() {
        switch (random.nextInt(1, 4)) {
            case 1:
                headForm = HeadForm.ROUND;
                form = headForm.getForm();
                break;
            case 2:
                headForm = HeadForm.OVAL;
                form = headForm.getForm();
                break;
            case 3:
                headForm = HeadForm.SQUARE;
                form = headForm.getForm();
                break;
        }
    }

    public String getForm() {
        return form;
    }
}
