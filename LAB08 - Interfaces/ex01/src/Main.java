public class Main{

    public static void main (String args[]){


        Classificavel[] produto = new Produto[3];
        Classificavel[] servico = new Servicos[3];
        Classificavel[] cliente = new Cliente[3];

        Produto[] prt = new Produto[3];
        Servicos[] srv = new Servicos[3];
        Cliente[] clt = new Cliente[3];

        produto[0] =  new Produto(3);
        produto[1] =  new Produto(1);
        produto[2] =  new Produto(2);

        cliente[0] =  new Cliente("Zamiliano");
        cliente[1] =  new Cliente("Wanessa");
        cliente[2] =  new Cliente("Andressa");

        servico[0] =  new Servicos(10.00);
        servico[1] =  new Servicos(7.00);
        servico[2] =  new Servicos(3.00);

        prt = (Produto[]) produto;
        srv = (Servicos[]) servico;
        clt = (Cliente[]) cliente;


        System.out.println();
        System.out.println("nao ordenado: ");
        System.out.println();

        for(int i = 1 ; i <= 3; i++){
            System.out.println("Cliente" + i +": " + clt[i - 1].getNome());
            System.out.println("produto" + i  +": " + prt[i - 1].getCodigo());
            System.out.println("servico" + i  +": " + srv[ i - 1].getPreco());

        }

        System.out.println();
        System.out.println("ordenado: ");
        System.out.println();

        prt[0].ordena(prt);
        clt[0].ordena(clt);
        srv[0].ordena(srv);

        for(int i = 1 ; i <= 3; i++){
            System.out.println("Cliente" + i +": " + (clt[i - 1].getNome()));
            System.out.println("produto" + i +": "   + prt[i - 1].getCodigo());
            System.out.println("servico" + i +": "  + srv[ i - 1].getPreco());
        }










    }
}
