#include "TadProduto.h"

typedef struct cliente Cliente;
typedef struct produto Produto;
typedef struct funcionario Funcionario;
typedef struct no_cliente No_Cliente;
typedef struct lista_cliente Lista_Cliente;
typedef struct no_produto No_Produto;
typedef struct lista_produto Lista_Produto;
typedef struct no_funcionario No_Funcionario;
typedef struct lista_funcionario Lista_Funcionario;

struct lista_cliente
{
    No_Cliente *begin;
    No_Cliente *end;
    int size;
};

struct no_cliente
{
    struct cliente data;
    No_Cliente *next;
    No_Cliente *prev;
};

struct lista_produto
{
    No_Produto *begin;
    No_Produto *end;
    int size;
};

struct no_produto
{
    struct produto data;
    No_Produto *next;
    No_Produto *prev;
};

struct lista_funcionario
{
    No_Funcionario *begin;
    No_Funcionario *end;
    int size;
};

struct no_funcionario
{
    struct funcionario data;
    No_Funcionario *next;
    No_Funcionario *prev;
};

Lista_Produto *list_init_produto()
{
    Lista_Produto *li;
    li = (Lista_Produto *)malloc(sizeof(Lista_Produto));
    li->begin = NULL;
    li->end = NULL;
    li->size = 0;
    return li;
}
Lista_Cliente *list_init_cliente()
{
    Lista_Cliente *li;
    li = (Lista_Cliente *)malloc(sizeof(Lista_Cliente));
    li->begin = NULL;
    li->end = NULL;
    li->size = 0;
    return li;
}
Lista_Funcionario *list_init_funcionario()
{
    Lista_Funcionario *li;
    li = (Lista_Funcionario *)malloc(sizeof(Lista_Funcionario));
    li->begin = NULL;
    li->end = NULL;
    li->size = 0;
    return li;
}

int list_insert_produto(Lista_Produto *li, int pos, struct produto prt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    No_Produto *node = (No_Produto *)malloc(sizeof(No_Produto));
    if (node == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    node->data = prt;
    if (pos < 1 || pos > li->size + 1)
    {
        return OUT_OF_RANGE;
    }
    if (pos == 1 && li->size == 0)
    {
        node->prev = NULL;
        node->next = NULL;
        li->begin = node;
        li->end = node;
        li->size = 1;
    }
    else if (pos == 1 && li->size > 0)
    {
        node->prev = NULL;
        node->next = li->begin;
        li->begin->prev = node;
        li->begin = node;
        li->size++;

        return SUCCESS;
    }

    else if (pos == li->size + 1)
    {
        node->next = NULL;
        node->prev = li->end;
        li->end->next = node;
        li->end = node;
        li->size++;
        return SUCCESS;
    }
    else if (pos == li->size)
    {
        li->end->prev->next = node;
        node->prev = li->end->prev;
        node->next = li->end;
        li->end->prev = node;
        li->size++;
        return SUCCESS;
    }
    else if (pos < li->size)
    {
        No_Produto *atual;
        int count = 2;
        atual = li->begin;
        for (count; count < pos; count++)
        {
            atual = atual->next;
        }

        node->next = atual->next;
        node->prev = atual;
        atual->next->prev = node;
        atual->next = node;
        li->size = li->size + 1;

        return SUCCESS;
    }
}

int list_insert_cliente(Lista_Cliente *li, int pos, struct cliente clt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    No_Cliente *node = (No_Cliente *)malloc(sizeof(No_Cliente));
    if (node == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    node->data = clt;
    if (pos < 1 || pos > li->size + 1)
    {
        return OUT_OF_RANGE;
    }
    if (pos == 1 && li->size == 0)
    {
        node->prev = NULL;
        node->next = NULL;
        li->begin = node;
        li->end = node;
        li->size = 1;
    }
    else if (pos == 1 && li->size > 0)
    {
        node->prev = NULL;
        node->next = li->begin;
        li->begin->prev = node;
        li->begin = node;
        li->size++;

        return SUCCESS;
    }

    else if (pos == li->size + 1)
    {
        node->next = NULL;
        node->prev = li->end;
        li->end->next = node;
        li->end = node;
        li->size++;
        return SUCCESS;
    }
    else if (pos == li->size)
    {
        li->end->prev->next = node;
        node->prev = li->end->prev;
        node->next = li->end;
        li->end->prev = node;
        li->size++;
        return SUCCESS;
    }
    else if (pos < li->size)
    {
        No_Cliente *atual;
        int count = 2;
        atual = li->begin;
        for (count; count < pos; count++)
        {
            atual = atual->next;
        }

        node->next = atual->next;
        node->prev = atual;
        atual->next->prev = node;
        atual->next = node;
        li->size = li->size + 1;

        return SUCCESS;
    }
}

int list_insert_funcionario(Lista_Funcionario *li, int pos, struct funcionario fco)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    No_Funcionario *node = (No_Funcionario *)malloc(sizeof(No_Funcionario));
    if (node == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    node->data = fco;
    if (pos < 1 || pos > li->size + 1)
    {
        return OUT_OF_RANGE;
    }
    if (pos == 1 && li->size == 0)
    {
        node->prev = NULL;
        node->next = NULL;
        li->begin = node;
        li->end = node;
        li->size = 1;
    }
    else if (pos == 1 && li->size > 0)
    {
        node->prev = NULL;
        node->next = li->begin;
        li->begin->prev = node;
        li->begin = node;
        li->size++;

        return SUCCESS;
    }

    else if (pos == li->size + 1)
    {
        node->next = NULL;
        node->prev = li->end;
        li->end->next = node;
        li->end = node;
        li->size++;
        return SUCCESS;
    }
    else if (pos == li->size)
    {
        li->end->prev->next = node;
        node->prev = li->end->prev;
        node->next = li->end;
        li->end->prev = node;
        li->size++;
        return SUCCESS;
    }
    else if (pos < li->size)
    {
        No_Funcionario *atual;
        int count = 2;
        atual = li->begin;
        for (count; count < pos; count++)
        {
            atual = atual->next;
        }

        node->next = atual->next;
        node->prev = atual;
        atual->next->prev = node;
        atual->next = node;
        li->size = li->size + 1;

        return SUCCESS;
    }
}

int list_print_produto(Lista_Produto *li)
{
    int count;
    if (li == NULL)
    {
        return -INVALID_NULL_POINTER;
    }
    No_Produto *aux = li->begin;
    for (count = 1; count <= li->size; count++)
    {
        printf("\n\nLista %d: Codigo: %d\nNome: %s\nFabricante:%s\nPreco:%.2f", count, aux->data.codigo, aux->data.nome, aux->data.fabricante, aux->data.preco);
        printf("\nEstoque: %d\nQuantidade vendidas: %d", aux->data.estoque, aux->data.qtd_vendidas);
        aux = aux->next;
    }

    return SUCCESS;
}
int list_print_cliente(Lista_Cliente *li)
{
    int count;
    if (li == NULL)
    {
        return -INVALID_NULL_POINTER;
    }
    No_Cliente *aux = li->begin;
    for (count = 1; count <= li->size; count++)
    {
        printf("\n\nCliente %d: CPF: %.0lf\nNome: %s\nData de nascimento:%s\nCEP:%.0lf", count, aux->data.cpf, aux->data.nome, aux->data.data_nascimento, aux->data.cep);
        printf("\nQuantidade gasta: $%.2f", aux->data.gastos);
        aux = aux->next;
    }

    return SUCCESS;
}

int list_print_funcionario(Lista_Funcionario *li)
{
    int count;
    if (li == NULL)
    {
        return -INVALID_NULL_POINTER;
    }
    No_Funcionario *aux = li->begin;
    for (count = 1; count <= li->size; count++)
    {
        printf("\n\nFuncionario %d: CPF: %.0lf\nNome: %s\nData de nascimento:%s\nData de ingresso:%s", count, aux->data.cpf, aux->data.nome, aux->data.data_nascimento, aux->data.data_ingresso);
        printf("\n Quantidade liquida de lucro: $%.2f", aux->data.vendas);
        aux = aux->next;
    }

    return SUCCESS;
}

int fopen_produto(char *str, Lista_Produto *li)
{

    Produto prt;
    FILE *fp;
    int count = 1, aux = 1;
    char c;
    fp = fopen(str, "r");
    while (!feof(fp))
    {
        c = fgetc(fp);
        if (c == '\n')
        {
            count++;
        }
    }
    rewind(fp);
    count = count / 7;
    for (aux; aux <= count; aux++)
    {
        fscanf(fp, "%d", &prt.codigo);
        fscanf(fp, "%s", &prt.nome);
        fscanf(fp, "%s", &prt.fabricante);
        fscanf(fp, "%f", &prt.preco);
        fscanf(fp, "%d", &prt.estoque);
        fscanf(fp, "%d", &prt.qtd_vendidas);
        list_insert_produto(li, aux, prt);
    }
    fclose(fp);
    return 0;
}
int fopen_cliente(char *str, Lista_Cliente *li)
{
    Cliente clt;
    FILE *fp;
    int count = 1, aux = 1;
    char c;
    fp = fopen(str, "r");
    while (!feof(fp))
    {
        c = fgetc(fp);
        if (c == '\n')
        {
            count++;
        }
    }
    rewind(fp);
    count = count / 6;
    for (aux; aux <= count; aux++)
    {
        fscanf(fp, "%s", &clt.nome);
        fscanf(fp, "%lf", &clt.cpf);
        fscanf(fp, "%s", &clt.data_nascimento);
        fscanf(fp, "%lf", &clt.cep);
        fscanf(fp, "%f", &clt.gastos);
        list_insert_cliente(li, aux, clt);
    }
    fclose(fp);
    return 0;
}

int fopen_funcionario(char *str, Lista_Funcionario *li)
{
    Funcionario fco;
    FILE *fp;
    int count = 1, aux = 1;
    char c;
    fp = fopen(str, "r");
    while (!feof(fp))
    {
        c = fgetc(fp);
        if (c == '\n')
        {
            count++;
        }
    }
    rewind(fp);
    count = count / 6;
    for (aux; aux <= count; aux++)
    {
        fscanf(fp, "%s", &fco.nome);
        fscanf(fp, "%lf", &fco.cpf);
        fscanf(fp, "%s", &fco.data_nascimento);
        fscanf(fp, "%s", &fco.data_ingresso);
        fscanf(fp, "%f", &fco.vendas);
        list_insert_funcionario(li, aux, fco);
    }
    fclose(fp);
    return 0;
}

int produto_mais_vendido(Lista_Produto *li, struct produto *prt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        int count = li->size;
        No_Produto *atual = li->begin;
        *prt = li->begin->data;
        do
        {
            if (prt->qtd_vendidas <= atual->data.qtd_vendidas)
            {
                *prt = atual->data;
            }
            atual = atual->next;
            count--;
        } while (count > 0);
        return SUCCESS;
    }
}

int cliente_maior_gasto(Lista_Cliente *li, struct cliente *clt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        int count = li->size;
        No_Cliente *atual = li->begin;
        clt->gastos = li->begin->data.gastos;
        do
        {
            {
                *clt = atual->data;
            }
            atual = atual->next;
            count--;
        } while (count > 0);
        return SUCCESS;
    }
}

int cad_produto(Lista_Produto *li, Produto prt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        No_Produto *node = (No_Produto *)malloc(sizeof(No_Produto));
        node->data = prt;
        if (li->size == 0)
        {
            li->begin = node;
            li->end = node;
            node->next = NULL;
            node->prev = NULL;
            li->size = 1;
            return SUCCESS;
        }
        else
        {
            node->next = li->begin;
            li->begin->prev = node;
            li->begin = node;
            li->size = li->size + 1;
            return SUCCESS;
        }
    }
}

int cad_cliente(Lista_Cliente *li, Cliente clt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        No_Cliente *node = (No_Cliente *)malloc(sizeof(No_Cliente));
        node->data = clt;
        if (li->size == 0)
        {
            li->begin = node;
            li->end = node;
            node->next = NULL;
            node->prev = NULL;
            li->size = 1;
            return SUCCESS;
        }
        else
        {
            node->next = li->begin;
            li->begin->prev = node;
            li->begin = node;
            li->size = li->size + 1;
            return SUCCESS;
        }
    }
}
int cad_funcionario(Lista_Funcionario *li, Funcionario fco)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        No_Funcionario *node = (No_Funcionario *)malloc(sizeof(No_Funcionario));
        node->data = fco;
        if (li->size == 0)
        {
            li->begin = node;
            li->end = node;
            node->next = NULL;
            node->prev = NULL;
            li->size = 1;
            return SUCCESS;
        }
        else
        {
            node->next = li->begin;
            li->begin->prev = node;
            li->begin = node;
            li->size = li->size + 1;
            return SUCCESS;
        }
    }
}

int venda_produto(Lista_Produto *prt, Lista_Funcionario *fco, Lista_Cliente *clt, int cod_produto, double cpf_funcionario, double cpf_cliente)
{
    if (prt == NULL || fco == NULL || clt == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        No_Produto *node_pt = (No_Produto *)malloc(sizeof(No_Produto));
        No_Cliente *node_cl = (No_Cliente *)malloc(sizeof(No_Cliente));
        No_Funcionario *node_fc = (No_Funcionario *)malloc(sizeof(No_Funcionario));

        node_pt = prt->begin;
        while (node_pt->data.codigo != cod_produto)
        {
            node_pt = node_pt->next;
        }
        if (node_pt->data.codigo != cod_produto)
        {
            return OUT_OF_RANGE;
        }
        node_cl = clt->begin;
        while (node_cl->data.cpf != cpf_cliente)
        {
            node_cl = node_cl->next;
        }
        if (node_cl->data.cpf != cpf_cliente)
        {
            return OUT_OF_RANGE;
        }
        node_fc = fco->begin;
        while (node_fc->data.cpf != cpf_funcionario)
        {
            node_fc = node_fc->next;
        }
        if (node_fc->data.cpf != cpf_funcionario)
        {
            return OUT_OF_RANGE;
        }
        if (node_pt->data.estoque <= 0)
        {
            return OUT_OF_RANGE;
        }
        else
        {

            node_pt->data.estoque--;
            node_pt->data.qtd_vendidas++;
            node_cl->data.gastos += node_pt->data.preco;
            node_fc->data.vendas += node_pt->data.preco;
        }

        return SUCCESS;
    }
}

int escrever_lista_produto(Lista_Produto *li, char *str)
{
    {
        FILE *fp;
        if (li == NULL)
        {
            return INVALID_NULL_POINTER;
        }
        else
        {
            fp = fopen(str, "w");
            if (fp == NULL)
            {
                return INVALID_NULL_POINTER;
            }
            else
            {
                int count = 0;
                count = li->size;
                No_Produto *aux;
                aux = (No_Produto *)sizeof(malloc(sizeof(No_Produto)));
                aux = li->begin;
                rewind(fp);
                for (count; count > 0; count--)
                {
                    if (count != li->size)
                    {
                        fprintf(fp, "\n");
                    }
                    fprintf(fp, "%d", aux->data.codigo);
                    fprintf(fp, "\n");
                    fprintf(fp, "%s", aux->data.nome);
                    fprintf(fp, "\n");
                    fprintf(fp, "%s", aux->data.fabricante);
                    fprintf(fp, "\n");
                    fprintf(fp, "%f", aux->data.preco);
                    fprintf(fp, "\n");
                    fprintf(fp, "%d", aux->data.estoque);
                    fprintf(fp, "\n");
                    fprintf(fp, "%d", aux->data.qtd_vendidas);
                    fprintf(fp, "\n");
                    aux = aux->next;
                }
            }
            fclose(fp);
        }
        return SUCCESS;
    }
}

int escrever_lista_cliente(Lista_Cliente *li, char *str)
{
    {
        FILE *fp;
        if (li == NULL)
        {
            return INVALID_NULL_POINTER;
        }
        else
        {
            fp = fopen(str, "w");
            if (fp == NULL)
            {
                return INVALID_NULL_POINTER;
            }
            else
            {
                int count = 0;
                count = li->size;
                No_Cliente *aux;
                aux = (No_Cliente *)sizeof(malloc(sizeof(No_Cliente)));
                aux = li->begin;
                rewind(fp);
                for (count; count > 0; count--)
                {

                    if (count != li->size)
                    {
                        fprintf(fp, "\n");
                    }
                    fprintf(fp, "%s", aux->data.nome);
                    fprintf(fp, "\n");
                    fprintf(fp, "%.0lf", aux->data.cpf);
                    fprintf(fp, "\n");
                    fprintf(fp, "%s", aux->data.data_nascimento);
                    fprintf(fp, "\n");
                    fprintf(fp, "%.0lf", aux->data.cep);
                    fprintf(fp, "\n");
                    fprintf(fp, "%.2f", aux->data.gastos);
                    fprintf(fp, "\n");
                    aux = aux->next;
                }
            }
            fclose(fp);
        }
        return SUCCESS;
    }
}

int escrever_lista_funcionario(Lista_Funcionario *li, char *str)
{
    {
        FILE *fp;
        if (li == NULL)
        {
            return INVALID_NULL_POINTER;
        }
        else
        {
            fp = fopen(str, "w");
            if (fp == NULL)
            {
                return INVALID_NULL_POINTER;
            }
            else
            {
                int count = 0;
                count = li->size;
                No_Funcionario *aux;
                aux = (No_Funcionario *)sizeof(malloc(sizeof(No_Funcionario)));
                aux = li->begin;
                rewind(fp);
                for (count; count > 0; count--)
                {

                    if (count != li->size)
                    {
                        fprintf(fp, "\n");
                    }
                    fprintf(fp, "%s", aux->data.nome);
                    fprintf(fp, "\n");
                    fprintf(fp, "%.0lf", aux->data.cpf);
                    fprintf(fp, "\n");
                    fprintf(fp, "%s", aux->data.data_nascimento);
                    fprintf(fp, "\n");
                    fprintf(fp, "%s", aux->data.data_ingresso);
                    fprintf(fp, "\n");
                    fprintf(fp, "%.2f", aux->data.vendas);
                    fprintf(fp, "\n");
                    aux = aux->next;
                }
            }
            fclose(fp);
        }
        return SUCCESS;
    }
}

int consulta_produto(Lista_Produto *li, int codigo, struct produto *pt)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        int count = li->size;
        No_Produto *aux = (No_Produto *)malloc(sizeof(No_Produto));
        aux = li->begin;
        while (aux->data.codigo != codigo)
        {
            aux = aux->next;
        }
        if (aux->data.codigo != codigo)
        {
            return OUT_OF_RANGE;
        }
        else
        {
            *pt = aux->data;
        }
        return SUCCESS;
    }
}

int consulta_cliente(Lista_Cliente *li, int cpf, struct cliente *cl)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        int count = li->size;
        No_Cliente *aux = (No_Cliente *)malloc(sizeof(No_Cliente));
        aux = li->begin;
        while (aux->data.cpf != cpf)
        {
            aux = aux->next;
        }
        if (aux->data.cpf != cpf)
        {
            return OUT_OF_RANGE;
        }
        else
        {
            *cl = aux->data;
        }
        return SUCCESS;
    }
}

int consulta_funcionario(Lista_Funcionario *li, int cpf, struct funcionario *fc)
{
    if (li == NULL)
    {
        return INVALID_NULL_POINTER;
    }
    else
    {
        int count = li->size;
        No_Funcionario *aux = (No_Funcionario *)malloc(sizeof(No_Funcionario));
        aux = li->begin;
        while (aux->data.cpf != cpf)
        {
            aux = aux->next;
        }
        if (aux->data.cpf != cpf)
        {
            return OUT_OF_RANGE;
        }
        else
        {
            *fc = aux->data;
        }
        return SUCCESS;
    }
}