package mainclient.classNoLongerPublic;
public class ClassNoLongerPublicTD {
    main.classNoLongerPublic.ClassNoLongerPublic field;

    public ClassNoLongerPublicTD(main.classNoLongerPublic.ClassNoLongerPublic field) {
        this.field = field;
    }

    public void refClassNoLongerPublic() {
        main.classNoLongerPublic.ClassNoLongerPublic c = /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        new main.classNoLongerPublic.ClassNoLongerPublic();
    }
}