package cursoaula10;

public class CursoAula10 {

    public static void main(String[] args) {
       Aluno a1 = new Aluno();
       a1.setNome("Cláudio");
       a1.setMatr(1111);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.pagarMensalidade();
       
       Bolsista b1 = new Bolsista();
       b1.setMatr(1112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.pagarMensalidade();
    }
    
}
