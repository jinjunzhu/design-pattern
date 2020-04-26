package design.architecture.facade;

/**
 * @author jinjunzhu
 * @date 2020/4/16
 */
public class ServiceD implements InterfaceD{

    private InterfaceA interfaceA;

    private InterfaceB interfaceB;

    private InterfaceC interfaceC;

    @Override
    public void d() {
        interfaceA.a();
        interfaceB.b();
        interfaceC.c();
    }
}
