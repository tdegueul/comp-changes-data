package mainclient.constructorRemoved;
public class ConstructorRemovedExtParams extends main.constructorRemoved.ConstructorRemovedParams {
    public ConstructorRemovedExtParams() {
        super(0);
    }

    public void constructorRemovedExtParamsNoSuper() {
        mainclient.constructorRemoved.ConstructorRemovedExtParams c = ((mainclient.constructorRemoved.ConstructorRemovedExtParams) (new main.constructorRemoved.ConstructorRemovedParams(0)));
    }
}