public class Aluno {
   private String nome;
   private String curso;
   private String disciplina;
   private int bimestre;
   private String mencao;

   //construtor da classe
   public Aluno(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
   }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void set(String curso){
        this.curso = curso;
    }

    public String getCurso (){
        return this.curso;
    }

    public void setDisciplina(String Disciplina){
        this.Disciplina = Disciplina;
    }

    public String getDisciplina (){
        return this.disciplina;
    }

    public void setBimestre(int bimestre){
        this.bimestre = bimestre;
    }

    public int getBimestre (){
        return this.bimestre;
    }

    public void setMencao(String mencao){
        this.mencao = mencao;
    }

    public String getMencao (){
        return this.mencao;
    }




}
