package design.architecture.adaptor;

public class LjBProcessor implements IMakeTeaProcessor{

    private MakeTeaLj makeTeaLj = new MakeTeaLj();

    @Override
    public void process1() {
        makeTeaLj.washCupB();
    }

    @Override
    public void process2() {
        makeTeaLj.washTeaLj();
    }

    @Override
    public void process3() {
        makeTeaLj.makeTeaLj();
    }
}
