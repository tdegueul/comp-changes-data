package mainclient.classNowAbstract;
public class ClassNowAbstractMI {
    public void createObject() {
        main.classNowAbstract.ClassNowAbstract c = // [CLASS_NOW_ABSTRACT:INSTANTIATION]
        new main.classNowAbstract.ClassNowAbstract();
    }

    public void createObjectParams() {
        main.classNowAbstract.ClassNowAbstract c = // [CLASS_NOW_ABSTRACT:INSTANTIATION]
        new main.classNowAbstract.ClassNowAbstract(3);
    }

    public void createSubObject() {
        mainclient.classNowAbstract.ClassNowAbstractExt c = new mainclient.classNowAbstract.ClassNowAbstractExt(3);
    }

    public void accessConstant() {
        int i = main.classNowAbstract.ClassNowAbstract.CTE;
    }
}