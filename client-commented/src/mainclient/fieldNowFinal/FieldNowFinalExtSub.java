package mainclient.fieldNowFinal;
public class FieldNowFinalExtSub extends main.fieldNowFinal.FieldNowFinalSub {
    public int fieldNowFinalAssignmentSuperKey() {
        /* [FIELD_NOW_FINAL:FIELD_ACCESS] */
        super.fieldFinal = 3;
        return super.fieldFinal;
    }

    public int fieldNowFinalNoAssignmentSuperKey() {
        return super.fieldFinal;
    }

    public int fieldNowFinalAssignmentNoSuperKey() {
        /* [FIELD_NOW_FINAL:FIELD_ACCESS] */
        fieldFinal = 3;
        return fieldFinal;
    }

    public int fieldNowFinalNoAssignmentNoSuperKey() {
        return fieldFinal;
    }
}