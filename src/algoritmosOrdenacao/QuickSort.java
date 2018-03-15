
package algoritmosOrdenacao;

import java.util.ArrayList;

/**
 *
 * @author aline
 */
public class QuickSort {
    
    ArrayList<Integer> lista = new ArrayList();

    public QuickSort(){
        
        String txt = FileManager.readFromFile("couting.txt");
        String[] split = txt.split("\n");

        for(int i = 0; i<split.length; i++){
            lista.add(Integer.parseInt(split[i]));
        } 
    }
    
public void quickSort(){
    quickSort(0, lista.size()-1);
}

private void quickSort(int inicio, int fim){
        int pivo;
        if(fim>inicio){
            pivo = Particiona(inicio, fim);
            quickSort(inicio, pivo);
            quickSort(pivo+1, fim);
        }
    }
    
    private int Particiona(int inicio, int fim){
        int aux, esquerda = inicio, direita = fim;
        int pivo = lista.get(inicio);
        //enquanto 'esquerda' e 'direita' não se cruzam
        while(esquerda<direita){
            while(lista.get(esquerda)<=pivo && esquerda < fim){
                esquerda++;
            }
            while(lista.get(direita)>pivo && direita > inicio){
                direita--;
            }
            //Verifica novamente para se certificar de que 'esquerda' e 'direita' não se cruzaram
            if(esquerda<direita){
                aux = lista.get(direita);
                lista.set(direita, lista.get(esquerda));
                lista.set(esquerda, aux);
            }
        }
        lista.set(inicio, lista.get(direita));
        //inicio = direita;
        lista.set(direita, pivo);
        //direita = pivo;
        
        return direita;
    }
    
    public String toString() {
        return "Lista{\n"
                + "\t" + lista
                + "\n}";
    }
}

