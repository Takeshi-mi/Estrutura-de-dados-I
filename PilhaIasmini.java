package Aula2;

public class PilhaIasmini {
    String pilha[];
    int topo;


    //Inicializando a pilha
    PilhaIasmini(int tamanho) {
        pilha = new String[tamanho];
        topo = 0;
    }

    boolean isFull() {
        if (pilha.length == topo)
            return true;
        return false;
        //return pilha.lenght == topo (dá pra fazer em uma linha só também)
    }

    boolean push(String valor) {
        if (isFull()) {
            return false;
        }
        pilha[topo] = valor;
        //o valor é o que estou passando por parâmetro na função
        topo++; //topo = topo+1
        return true;

    }


        //  Metodo para remover. Mas para isso é preciso verificar se está vazia para não dar erro.
    boolean isEmpty(){
            if(topo == 0){
                return true;
            }
            return false;
        }


    String pop() {
            if(isEmpty()){
                return null; //System.out.println("Não é possível remover. Pilha vazia"); // Poderia retornar null também.
            }
            String aux = pilha[topo];
            topo--;
            return aux;
        }
        int tamanho(){
            return topo;
        }

        //metodo para imprimir a pilha
        void print(){
            for(int i=0; i<topo; i++){
                System.out.println("|"+pilha[i]+"|");
            }
        }
        void print2(){
            for(int i = topo-1; i>0; i--){
                System.out.println("|"+pilha[i]+"|");
            }
        }//para fila a logica é parecida, mas será preciso criar uma variável para o final e uma para o início.
    }
