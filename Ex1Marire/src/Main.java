abstract class AbstractStudent {
    public abstract void sustineExamen();
}

class PhdStudent extends AbstractStudent {
    @Override
    public void sustineExamen() {
        System.out.println("Examenul se desfasoara prin prezentare finala");
    }
}

class GradStudent extends AbstractStudent {
    @Override
    public void sustineExamen() {
        System.out.println("Examenul se desfasoara prin examen scris");
    }
}
