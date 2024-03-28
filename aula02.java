package JovemProgramador;
import java.util.Scanner;
public class aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tarefas = "" ;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de atividade para inserir: ");
		int nAtividades = entrada.nextInt();
		
		while(nAtividades > 0) {
		
		System.out.println("Digite o código da tarefa: ");
		String codigo = entrada.next();
		
		System.out.println("Digite a descrição da tarefa: ");
		String conteudo = entrada.next();
		
		System.out.println("Digite a hora do início: ");
		int inicio = entrada.nextInt();
		
		System.out.println("Digite a hora do término: ");
		int fim = entrada.nextInt();
		
		
		tarefas += cadastrarTarefa(codigo, conteudo, inicio, fim);
		
		nAtividades--;
		
		}
		
		exibirTarefas(tarefas);
		
		

	}
	
	  private static int horasRestantes = 8;
	
	private static void exibirTarefas(String tarefa) {
	    System.out.println("Codigo - Tarefa - Inicio - Fim --- Horas Livre");
	    System.out.println(tarefa);

	  }
	
	private static String cadastrarTarefa(String codigo, String descricao, int inicio, int fim) {
	    int duracao = fim - inicio;
	     horasRestantes = horasRestantes - duracao;
	    return String.format("%s - %s - %d - %d --------- %d horas\n", codigo, descricao, inicio, fim, horasRestantes);
	  }

	
}


