

package algoritmosOrdenacao;

import java.util.ArrayList;

/**
 *
 * @author aline
 */
public class InsertionSort {
    
     ArrayList<Integer> lista = new ArrayList();
    
    public InsertionSort(){
        
        String txt = FileManager.readFromFile("couting.txt");
        String[] split = txt.split("\n");
        
        for(int i = 0; i<split.length; i++){
            lista.add(Integer.parseInt(split[i]));
                                
        }
        
    }
    
    public void insertionSort(){
        
        //
        
        int aux, j;
        
        //'aux' guarda o valor do próximo elemento que será inserido na lista
        //'i' é o "ponteiro" que varre a lista desordenada
        //'j' é o "ponteiro" que varre a lista ordenada
        
        for(int i = 1; i < lista.size(); i++){
            
            aux = lista.get(i);
            
            for(j = i-1; j>=0; j--){
            
                if(aux>lista.get(j))
                    break;
                lista.set(j+1, lista.get(j));
            }
            
            lista.set(j+1, aux);
        }
    }
    
    public String toString() {
        return "Lista{\n"
                + "\t" + lista
                + "\n}";
    }
    
}
