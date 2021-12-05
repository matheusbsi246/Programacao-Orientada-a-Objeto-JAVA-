#include "TadProduto.h"
#include <stdio.h>
#include <stdlib.h>
int main()
{
    Lista_Produto *li_prt;
    Lista_Cliente *li_clt;
    Lista_Funcionario *li_fco;
    Produto pt,
        pt2,
        pt_teste = {1005, 10, 5, 900.0, "PORTRAIT_DX_NAMI", "MEGAHOUSE"};

    Cliente cl,
        cl_teste = {34343434332, 98993999, "30/01/1977", "GangPlank", 9000.00};
    Funcionario fc,
        fc_teste = {8477473333, 987.00, "09/08/1998", "20/12/2021", "Walter White"};
    li_prt = list_init_produto();
    li_clt = list_init_cliente();
    li_fco = list_init_funcionario();
    fopen_produto("produto.txt", li_prt);
    fopen_funcionario("funcionario.txt", li_fco);
    fopen_cliente("cliente.txt", li_clt);
    // list_print_produto(li_prt);
    // list_print_cliente(li_clt);
    // list_print_funcionario(li_fco);
    produto_mais_vendido(li_prt, &pt);
    printf("\nproduto mais vendido: %s", pt.nome);
    cliente_maior_gasto(li_clt, &cl);
    printf("\no CLiente que mais gastou foi: %s%", cl.nome);
    cad_produto(li_prt, pt_teste);
    cad_cliente(li_clt, cl_teste);
    cad_funcionario(li_fco, fc_teste);
    // cad_funcionario(li_fco)
    //  list_print_produto(li_prt);
    venda_produto(li_prt, li_fco, li_clt, 1001, 8888888888, 11111111111);
    // list_print_produto(li_prt);
    // list_print_cliente(li_clt);
    // list_print_funcionario(li_fco);
    escrever_lista_produto(li_prt, "produto_resultado.txt");
    escrever_lista_funcionario(li_fco, "funcionario_resultado.txt");
    escrever_lista_cliente(li_clt, "cliente_resultado.txt");
    consulta_produto(li_prt, 1002, &pt2);
    printf("\nO estoque do produto %s eh: %d", pt2.nome, pt2.estoque);
    return 0;
}