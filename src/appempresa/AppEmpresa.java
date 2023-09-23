package appempresa;

import java.util.ArrayList;

public class AppEmpresa {
    public static void main(String[] args) {
        // Simulando uma lista de clientes
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        // Adicionando um cliente à lista
        Cliente cliente = new Cliente();
        cliente.setNome("Rafael Teste");
        cliente.setEndereco("Rua Exemplo, 123");
        cliente.setTelefone("123-456-7890");
        cliente.setRg("1234567");
        cliente.setEmail("rafael@teste.com");
        cliente.setCpf("123.456.789-01");
        listaClientes.add(cliente);
        
        // Simulando uma lista de vendedores
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        
        // Adicionando um vendedor à lista
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("João Vendedor");
        vendedor.setEndereco("Avenida Venda, 456");
        vendedor.setRg("9876543");
        vendedor.setEmail("joao@vendedor.com");
        vendedor.setCpf("987.654.321-09");
        vendedor.setContaBancaria("12345-6");
        vendedor.setAgenciaBancaria("7890");
        vendedor.setContaCorrente("78901234-5");
        listaVendedores.add(vendedor);
        
        // Imprimindo informações dos clientes
        System.out.println("Informações dos Clientes:");
        for (Cliente c : listaClientes) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Endereço: " + c.getEndereco());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("RG: " + c.getRg());
            System.out.println("Email: " + c.getEmail());
            System.out.println("CPF: " + c.getCpf());
            System.out.println();
        }
        
        // Imprimindo informações dos vendedores
        System.out.println("Informações dos Vendedores:");
        for (Vendedor v : listaVendedores) {
            System.out.println("Nome: " + v.getNome());
            System.out.println("Endereço: " + v.getEndereco());
            System.out.println("RG: " + v.getRg());
            System.out.println("Email: " + v.getEmail());
            System.out.println("CPF: " + v.getCpf());
            System.out.println("Conta Bancária: " + v.getContaBancaria());
            System.out.println("Agência Bancária: " + v.getAgenciaBancaria());
            System.out.println("Conta Corrente: " + v.getContaCorrente());
            System.out.println();
        }
    }
}