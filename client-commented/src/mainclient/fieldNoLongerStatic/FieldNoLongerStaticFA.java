package mainclient.fieldNoLongerStatic;
public class FieldNoLongerStaticFA {
    public int fieldNoLongerStaticClient() {
        return /* [FIELD_NO_LONGER_STATIC:FIELD_ACCESS] */
        main.fieldNoLongerStatic.FieldNoLongerStatic.fieldStatic;
    }

    public int fieldNoLongerStaticSuperClient1() {
        return main.fieldNoLongerStatic.FieldNoLongerStatic.superFieldStatic;
    }

    public int fieldNoLongerStaticSuperClient2() {
        return /* [FIELD_NO_LONGER_STATIC:FIELD_ACCESS] */
        main.fieldNoLongerStatic.FieldNoLongerStaticSuper.superFieldStatic;
    }

    public int fieldNoLongerStaticInstanceAccess() {
        main.fieldNoLongerStatic.FieldNoLongerStatic f = new main.fieldNoLongerStatic.FieldNoLongerStatic();
        return f.fieldStatic;
    }

    public int fieldNoLongerStaticInstanceAccessSuper1() {
        main.fieldNoLongerStatic.FieldNoLongerStatic f = new main.fieldNoLongerStatic.FieldNoLongerStatic();
        return f.superFieldStatic;
    }

    public int fieldNoLongerStaticInstanceAccessSuper2() {
        main.fieldNoLongerStatic.FieldNoLongerStaticSuper f = new main.fieldNoLongerStatic.FieldNoLongerStaticSuper();
        return f.superFieldStatic;
    }
}