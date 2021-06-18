package mainclient.classTypeChanged;
public class ClassTypeChangedI2AllTD {
    main.classTypeChanged.ClassTypeChangedI2A i2a;

    main.classTypeChanged.ClassTypeChangedI2C i2c;

    main.classTypeChanged.ClassTypeChangedI2E i2e;

    public void e2aDep() {
        main.classTypeChanged.ClassTypeChangedI2A i2a;
    }

    public void e2iDep() {
        main.classTypeChanged.ClassTypeChangedI2C i2c;
    }

    public void e2cDep() {
        main.classTypeChanged.ClassTypeChangedI2E i2e;
    }
}