import java.util.Date;
// Declarando a Class
public class Main {

    public static void main(String[] args) {
        System.out.println("**Tuc Tuc v12 \n**");
        // Dados do cliente
        Cliente cliente = new Cliente();
            cliente.setCodCliente("CL001");
            cliente.setNomeCompleto("Luuy Acis");
            cliente.setCpf_passaporte("012.125.145-61");
            cliente.setGenero("Masculino");

        // Dados do colaborador
        Colaborador colaborador = new Colaborador();
            colaborador.setMatricula("CD001");
            colaborador.setNomeCompleto("Junior Cunha");
            colaborador.setCargo("Motorista");
            colaborador.setRg_cnh("125415288-7");
            colaborador.setParticipacaoLucro(0.35); // porcentagem
            colaborador.setTipoContrato("MEI");
            colaborador.setDtInicioCtt(new Date("01/01/2024"));    

        // Impressao no console dos dados do Cliente e Colaborador
        System.out.println("**Dados do cliente**");
        System.out.println(cliente.exibirDadosCliente());
        System.out.println("\n");
        System.out.println("**Dados do Motorista**");
        System.out.println(colaborador.exibirDadosColaborador());
    }
}
