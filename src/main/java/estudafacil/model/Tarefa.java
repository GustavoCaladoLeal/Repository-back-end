package estudafacil.model; //local do arquivo e ele está dentro da pasta model

//todas as ferramentas que vou usar para criar a tarefa
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

//usei a etiqueta @entity para dizer que essa clsse é uma entidade de banco de dados para que o spring criar uma tabela chamada Tarefa
@Entity
public class Tarefa {

    //usei o @id para facilitar a identificação de cada linha da tabela, e o @GeneratedValue para gerar um id automaticamente para cada linha, e por fim o Long só para falar que pode ter numeros bem grandes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Aqui são os campos da tarefa para o HTML, estou usando string e o Lacaldate para a data
    private String titulo;
    private String disciplina;
    private LocalDate prazo;
    private String prioridade;
    private String status;

    //esse é um construtor vazio para o spring conseguir criar a tabela
    public Tarefa() {
    }
    //Aqui é para alterar as Strings e a data da tarefa
    public Long getId() { return id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public LocalDate getPrazo() { return prazo; }
    public void setPrazo(LocalDate prazo) { this.prazo = prazo; }

    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}