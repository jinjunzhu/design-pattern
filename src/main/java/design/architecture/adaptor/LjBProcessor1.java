package design.architecture.adaptor;

public class LjBProcessor1 extends MakeTeaLj implements IMakeTeaProcessor{

    @Override
    public void process1() {
        super.washCupB();
    }

    @Override
    public void process2() {
        super.washTeaLj();
    }

    @Override
    public void process3() {
        super.makeTeaLj();
    }
}
