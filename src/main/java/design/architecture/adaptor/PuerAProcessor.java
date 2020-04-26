package design.architecture.adaptor;

public class PuerAProcessor implements IMakeTeaProcessor{

    private MakeTeaPuer makeTeaPuer = new MakeTeaPuer();

    @Override
    public void process1() {
        makeTeaPuer.washCupA();
    }

    @Override
    public void process2() {
        makeTeaPuer.washTeaPuer();
    }

    @Override
    public void process3() {
        makeTeaPuer.makeTeaPuer();
    }
}
