package mainclient.fieldNowFinal;
public class FieldNowFinalFA {
    public int fieldNowFinalAssignment() {
        main.fieldNowFinal.FieldNowFinal f = new main.fieldNowFinal.FieldNowFinal();
        f.fieldFinal = 3;
        return f.fieldFinal;
    }

    public int fieldNowFinalNoAssignment() {
        main.fieldNowFinal.FieldNowFinal f = new main.fieldNowFinal.FieldNowFinal();
        return f.fieldFinal;
    }

    public int fieldNowFinalAssignmentSub() {
        main.fieldNowFinal.FieldNowFinalSub f = new main.fieldNowFinal.FieldNowFinalSub();
        f.fieldFinal = 3;
        return f.fieldFinal;
    }

    public int fieldNowFinalNoAssignmentSub() {
        main.fieldNowFinal.FieldNowFinalSub f = new main.fieldNowFinal.FieldNowFinalSub();
        return f.fieldFinal;
    }
}