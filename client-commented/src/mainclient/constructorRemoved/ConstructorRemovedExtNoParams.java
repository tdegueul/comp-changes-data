package mainclient.constructorRemoved;
public class ConstructorRemovedExtNoParams extends main.constructorRemoved.ConstructorRemovedNoParams {
    public ConstructorRemovedExtNoParams() {
        super();
    }

    public void constructorRemovedExtNoParamsNoSuper() {
        mainclient.constructorRemoved.ConstructorRemovedExtNoParams c = ((mainclient.constructorRemoved.ConstructorRemovedExtNoParams) (new main.constructorRemoved.ConstructorRemovedNoParams()));
    }
}