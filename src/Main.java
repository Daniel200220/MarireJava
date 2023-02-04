abstract class AbstractStudent {
    abstract void sustinExam();
}

class PhdStudent extends AbstractStudent {
    @Override
    void sustinExam() {
        System.out.println("Examenul se desfasoara prin prezentarea finala");
    }
}

class GradStudent extends AbstractStudent {
    @Override
    void sustinExam() {
        System.out.println("Examenul se desfasoara prin examen scris");
    }
}



