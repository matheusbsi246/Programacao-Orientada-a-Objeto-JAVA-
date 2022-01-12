#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#define SUCCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

struct cliente
{
    double cpf;
    double cep;
    char data_nascimento[12];
    char nome[20];
    float gastos;
};

struct produto
{
    int codigo;
    int estoque;
    int qtd_vendidas;
    float preco;
    char nome[20];
    char fabricante[20];
};

struct funcionario
{
    double cpf;
    float vendas;
    char data_nascimento[12];
    char data_ingresso[12];
    char nome[20];
};

typedef struct cliente Cliente;
typedef struct produto Produto;
typedef struct funcionario Funcionario;
typedef struct no_cliente No_Cliente;
typedef struct lista_cliente Lista_Cliente;
typedef struct no_produto No_Produto;
typedef struct lista_produto Lista_Produto;
typedef struct no_funcionario No_Funcionario;
typedef struct lista_funcionario Lista_Funcionario;

Lista_Produto *list_init_produto();
Lista_Cliente *list_init_cliente();
Lista_Funcionario *list_init_funcionario();
int list_print_produto(Lista_Produto *li);
int list_print_cliente(Lista_Cliente *li);
int list_print_funcionario(Lista_Funcionario *li);
int list_insert_produto(Lista_Produto *li, int pos, struct produto prt);
int list_insert_cliente(Lista_Cliente *li, int pos, struct cliente clt);
int list_insert_funcionario(Lista_Funcionario *li, int pos, struct funcionario fco);
int fopen_produto(char *str, Lista_Produto *li);
int fopen_cliente(char *str, Lista_Cliente *li);
int fopen_funcionario(char *str, Lista_Funcionario *li);
int produto_mais_vendido(Lista_Produto *li, struct produto *prt);
int cliente_maior_gasto(Lista_Cliente *li, struct cliente *clt);
int cad_produto(Lista_Produto *li, Produto prt);
int cad_cliente(Lista_Cliente *li, Cliente clt);
int cad_funcionario(Lista_Funcionario *li, Funcionario fco);
int venda_produto(Lista_Produto *prt, Lista_Funcionario *fco, Lista_Cliente *clt, int cod_produto, double cpf_funcionario, double cpf_cliente);
int escrever_lista_produto(Lista_Produto *li, char *str);
int escrever_lista_cliente(Lista_Cliente *li, char *str);
int escrever_lista_cliente(Lista_Cliente *li, char *str);
int escrever_lista_funcionario(Lista_Funcionario *li, char *str);
int consulta_produto(Lista_Produto *li, int codigo, struct produto *pt);
int consulta_cliente(Lista_Cliente *li, int cpf, struct cliente *cl);
int consulta_funcionario(Lista_Funcionario *li, int cpf, struct funcionario *fc);
