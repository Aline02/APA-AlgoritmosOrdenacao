
package algoritmosOrdenacao;

import java.util.ArrayList;


public class SelectionSort {
    
    ArrayList<Integer> lista = new ArrayList();
    
    public SelectionSort(){
        
        String txt = FileManager.readFromFile("couting.txt");
        String[] split = txt.split("\n");
        
        for(int i = 0; i<split.length; i++){
            lista.add(Integer.parseInt(split[i]));
                                
        }
        
    }
    
    public void selectionSort(){
        
        //A variável 'posMenor' indica a posição do menor elemento da lista; 
        //A variável 'aux' auxilia quando realizamos as trocas do elementos
        
        int aux, posMenor = 0;
        
        //O primeiro laço 'for' grava a posição do primeiro elemento enquanto 
        //o segundo faz uma comparação dele com todos os outros, procurando sempre o menor elemento
        
        for(int i = 0; i < lista.size()-1; i++){
                        
            for(int j = i+1; j<lista.size(); j++){
                
                if(lista.get(posMenor)>lista.get(j)){
                    posMenor = j;
                }
            }
            
            if(lista.get(i)>lista.get(posMenor)){
                aux = lista.get(posMenor);
                lista.set(posMenor, lista.get(i));
                lista.set(i, aux);
            }
        }
    }
    
    public String toString() {
        return "Lista{\n"
                + "\t" + lista
                + "\n}";
    }
}
