package algoritmosOrdenacao;

import java.util.ArrayList;

public class MergeSort {
    
    ArrayList<Integer> lista = new ArrayList();

    public MergeSort(){
        
        String txt = FileManager.readFromFile("couting.txt");
        String[] split = txt.split("\n");

        for(int i = 0; i<split.length; i++){
            lista.add(Integer.parseInt(split[i]));
        } 
    }
    public void mergeSort(){
        divide(0, (lista.size()-1));
    }
    
    private void divide(int inicioLista, int fimLista){
        int meioLista = (inicioLista+fimLista)/2;
        int auxArray[] = new int[lista.size()];
        if(inicioLista<fimLista){
            divide(inicioLista, meioLista);
            divide(meioLista+1, fimLista);
            merge(inicioLista, meioLista, fimLista, auxArray);
        }
    }
    private void merge(int inicioLista, int meioLista, int fimLista, int auxArray[]){
        
        int elementos = fimLista - inicioLista+1; //Qtd de elementos da lista
        int esquerda = inicioLista; //aponta para o 1º elemento da primeira metade
        int direita = meioLista+1;//aponta para o 1º elemento da segunda metade
        int posicaoArray = inicioLista; // posição do array auxiliar
        
        //percorre as duas metade simultaneamente
        while(esquerda<= meioLista && direita<=fimLista){
            
            //compara elementos, o menor entra no array
            if(lista.get(esquerda)<lista.get(direita)){
                auxArray[posicaoArray] = lista.get(esquerda);
                esquerda++;
            } else{
                auxArray[posicaoArray] = lista.get(direita);
                direita++;
            }
            posicaoArray++;
        }
        
        //caso haja elementos restantes em uma das listas
        while(esquerda<=meioLista){
            auxArray[posicaoArray] = lista.get(esquerda);
            esquerda++;
            posicaoArray++;
        }
        while(direita<=fimLista){
            auxArray[posicaoArray] = lista.get(direita);
            direita++;
            posicaoArray++;
        }
        
        //transfere os elementos do array auxiliar para a lista
        for(int i = 0; i<elementos; i++, inicioLista++){
            lista.set(inicioLista, auxArray[inicioLista]);
        }
    }
    
    public String toString() {
        return "Lista{\n"
                + "\t" + lista
                + "\n}";
    }
}