package mainclient.fieldTypeChanged;
public class FieldTypeChangedFA {
    public void accessAndAssign() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        int a = ftc.unchangedPrimitive;
        main.fieldTypeChanged.A b = ftc.unchangedReference;
        int c = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedPrimitive;
        main.fieldTypeChanged.A d = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReference;
        byte e = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenPrimitive;
        main.fieldTypeChanged.B f = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenReference;
        short g = ftc.narrowPrimitive;
        main.fieldTypeChanged.A h = ftc.narrowReference;
        int i = ftc.boxing;
        java.lang.Integer j = ftc.unboxing;
        boolean k = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedBoxing;
        java.util.List<main.fieldTypeChanged.A> l = ftc.narrowReferenceList;
        java.util.List<main.fieldTypeChanged.B> m = ftc.widenReferenceList;
        java.util.List<main.fieldTypeChanged.A> n = ftc.changedReferenceList;
        java.util.List<main.fieldTypeChanged.A> o = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowListReference;
        java.util.List<main.fieldTypeChanged.A> p = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenListReference;
        int[] q = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowPrimitiveArray;
        int[] r = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenPrimitiveArray;
        int[] s = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.boxPrimitiveArray;
        java.lang.Integer[] t = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.unboxPrimitiveArray;
        main.fieldTypeChanged.A[] u = ftc.narrowReferenceArray;
        main.fieldTypeChanged.B[] v = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenReferenceArray;
        main.fieldTypeChanged.A[] w = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReferenceArray;
    }

    public void casts() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        main.fieldTypeChanged.B a = ((main.fieldTypeChanged.B) (ftc.unchangedReference));
        main.fieldTypeChanged.B b = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ((main.fieldTypeChanged.B) (ftc.changedReference));
        main.fieldTypeChanged.B c = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenReference;
        // B d = ftc.narrowReference;
        // ftc.widenReference = ftc.unchangedReference;
        ftc.widenReference = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ((main.fieldTypeChanged.B) (ftc.changedReference));
        ftc.widenReference = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenReference;
        // ftc.widenReference = ftc.narrowReference;
    }

    public void accessAndAssignCompatible() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        java.lang.Integer a = ftc.unchangedPrimitive;
        java.lang.Object b = ftc.unchangedReference;
        long c = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedPrimitive;
        java.lang.Object d = ftc.changedReference;
        short e = ftc.widenPrimitive;
        main.fieldTypeChanged.A f = ftc.widenReference;
        int g = ftc.narrowPrimitive;
        java.lang.Object h = ftc.narrowReference;
        double i = ftc.boxing;
        int j = ftc.unboxing;
        java.lang.Boolean k = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedBoxing;
        java.util.Collection<main.fieldTypeChanged.A> l = ftc.narrowReferenceList;
        java.util.List<? extends main.fieldTypeChanged.A> m = ftc.widenReferenceList;
        java.util.Collection<? extends main.fieldTypeChanged.A> n = ftc.changedReferenceList;
        java.util.Collection<main.fieldTypeChanged.A> o = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowListReference;
        java.util.List<? extends main.fieldTypeChanged.A> p = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenListReference;
        int[] q = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowPrimitiveArray;
        int[] r = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenPrimitiveArray;
        int[] s = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.boxPrimitiveArray;
        java.lang.Integer[] t = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.unboxPrimitiveArray;
        java.lang.Object[] u = ftc.narrowReferenceArray;
        main.fieldTypeChanged.A[] v = ftc.widenReferenceArray;
        java.lang.Object[] w = ftc.changedReferenceArray;
    }

    public void accessAndWrite() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        ftc.unchangedPrimitive = 2;
        ftc.unchangedReference = new main.fieldTypeChanged.A();
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedPrimitive = 2;
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReference = new main.fieldTypeChanged.A();
        ftc.widenPrimitive = 23;
        ftc.widenReference = new main.fieldTypeChanged.B();
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowPrimitive = 2;
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowReference = new main.fieldTypeChanged.A();
        ftc.boxing = 2;
        ftc.unboxing = 2;
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedBoxing = false;
        ftc.narrowReferenceList = new java.util.ArrayList<main.fieldTypeChanged.A>();
        ftc.widenReferenceList = new java.util.ArrayList<main.fieldTypeChanged.B>();
        ftc.changedReferenceList = new java.util.ArrayList<main.fieldTypeChanged.A>();
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowListReference = new java.util.ArrayList<main.fieldTypeChanged.A>();
        ftc.widenListReference = new java.util.ArrayList<main.fieldTypeChanged.A>();
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowPrimitiveArray = new int[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenPrimitiveArray = new int[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.boxPrimitiveArray = new int[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.unboxPrimitiveArray = new java.lang.Integer[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowReferenceArray = new main.fieldTypeChanged.A[1];
        ftc.widenReferenceArray = new main.fieldTypeChanged.B[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReferenceArray = new main.fieldTypeChanged.A[1];
    }

    public void accessAndWriteCompatible() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        ftc.unchangedPrimitive = ((int) (2.2));
        ftc.unchangedReference = new main.fieldTypeChanged.B();
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedPrimitive = ((int) (2.2));
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReference = new main.fieldTypeChanged.B();
        ftc.widenPrimitive = ((char) (23));
        ftc.widenReference = new main.fieldTypeChanged.B();
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowPrimitive = ((short) (2.2));
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowReference = new main.fieldTypeChanged.B();
        ftc.boxing = new java.lang.Integer(2);
        ftc.unboxing = new java.lang.Integer(2);
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedBoxing = 2 == 2;
        ftc.narrowReferenceList = new java.util.ArrayList<main.fieldTypeChanged.A>() {};
        ftc.widenReferenceList = new java.util.ArrayList<main.fieldTypeChanged.B>() {};
        ftc.changedReferenceList = new java.util.ArrayList<main.fieldTypeChanged.A>() {};
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowListReference = new java.util.ArrayList<main.fieldTypeChanged.A>() {};
        ftc.widenListReference = new java.util.ArrayList<main.fieldTypeChanged.A>() {};
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowPrimitiveArray = new int[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.widenPrimitiveArray = new int[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.boxPrimitiveArray = new int[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.unboxPrimitiveArray = new java.lang.Integer[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.narrowReferenceArray = new main.fieldTypeChanged.A[1];
        ftc.widenReferenceArray = new main.fieldTypeChanged.B[1];
        /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReferenceArray = new main.fieldTypeChanged.A[1];
    }

    public void accessSuper() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        main.fieldTypeChanged.A a = ftc.sameReference;
        int b = ftc.samePrimitive;
        main.fieldTypeChanged.A c = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentReference;
        int d = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive;
    }

    public void otherUses() {
        main.fieldTypeChanged.FieldTypeChanged ftc = new main.fieldTypeChanged.FieldTypeChanged();
        java.util.Objects.isNull(/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentReference);
        java.util.Objects.isNull(/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive);
        java.lang.String s = (/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive != 0) ? "y" : "n";
        java.util.function.Predicate<java.lang.Integer> f1 = ( i) -> i == /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive;
        java.util.function.Predicate<java.lang.Integer> f2 = ( i) -> {
            return (i == /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
            ftc.differentPrimitive) && new main.fieldTypeChanged.A().equals(/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
            ftc.differentReference);
        };
        java.util.List<main.fieldTypeChanged.A> as = new java.util.ArrayList<>();
        as.add(/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentReference);
        as.add(/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentReference);
        int a = 0;
        a += /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive;
        int b = a + /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive;
        int[] c = new int[/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive];
        int[] d = new int[]{ /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitive };
        boolean b1 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentReference instanceof main.fieldTypeChanged.A;
        while (/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitiveBoolean);
        do {
        } while (/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitiveBoolean );
        if (/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitiveBoolean) {
        } else if (/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitiveBoolean);
        while (/* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentPrimitiveBoolean);
        for (main.fieldTypeChanged.A t : /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.changedReferenceArray);
        try {
            throw /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
            ftc.exceptionTypeChanged;
        } catch (java.lang.Exception e) {
        }
        class Cls {
            public main.fieldTypeChanged.A f1 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
            ftc.differentReference;

            public int f2 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
            ftc.differentPrimitive;

            public main.fieldTypeChanged.A f3 = ftc.sameReference;

            public int f4 = ftc.samePrimitive;
        }
        Cls cls = new Cls();
        cls.f1 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        ftc.differentReference;
    }
}