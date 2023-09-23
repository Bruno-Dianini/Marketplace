package appempresa;

import java.util.ArrayList;

public class AppEmpresa {
    public static void main(String[] args) {
        FuncionarioDao dao = new FuncionarioDao();
        Funcionario addfuncionario = new Funcionario();
        ArrayList <Funcionario> listaFuncionarios = dao.getLista();
        
        addfuncionario.setNumat(1285);
        addfuncionario.setNome("Rafael Teste");
        addfuncionario.setSalario(95000.0);
        addfuncionario.setSexo("M");
        addfuncionario.setNdepto(4);
        addfuncionario.setNsuper(9876);
        dao.adiciona(addfuncionario);
        
        for (Funcionario funcionario : listaFuncionarios)
            System.out.println(
                "Numat: " + funcionario.getNumat() +" "+ 
                "Nome: " + funcionario.getNome() +" "+ 
                "Salario: " + funcionario.getSalario() +" "+
                "Sexo: " + funcionario.getSexo() +" "+
                "Ndepto: " + funcionario.getNdepto() +" "+
                "Nsuper: " + funcionario.getNsuper() +" "
            );
        
    }
    
}
