
package algoritmosOrdenacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aline
 */
public class MaxHeap {
    
    ArrayList<Integer> lista = new ArrayList();
    private int heapSize;

    public MaxHeap(){
        
        String txt = FileManager.readFromFile("couting.txt");
        String[] split = txt.split("\n");

        for(int i = 0; i<split.length; i++){
            lista.add(Integer.parseInt(split[i]));
        } 
        
        heapSize = lista.size()-1;
    }
    
   
    
    
    //Testa se o elemento está dentro do limite da lista
    private boolean indiceValido(int indice){
        return (indice < this.lista.size() && indice >= 0);
    }
    //Retorna o tamanho do Heap
    public int getHeapSize() {
        return heapSize;
    }
    //Retorna o parametro do pai
    private int pai(int i){
        return (i-1)/2;
    }
    //Retorna o parametro do filho esquerdo
    private int esquerdo(int i){
        return (i*2+1);
    }
    //retorna o parametro do filho direito
    private int direito(int i){
        return (i*2+1)+1;
    }
    public void heapify(){
        this.heapify(0);
    }
    private void heapify(int indiceAtual){
        int filhoEsquerdo, filhoDireito;
        int aux, maiorFilho;
        
        //percorre todo o array; metade do heap é folhas
        for(int i = indiceAtual; i<getHeapSize()/2;i++){
            filhoEsquerdo = esquerdo(i);
            filhoDireito = direito(i);
            
            //procura por filho maior que pai
            if(indiceValido(filhoEsquerdo)&&indiceValido(filhoDireito)){
                if(lista.get(filhoEsquerdo)>=lista.get(filhoDireito)){
                    maiorFilho = filhoEsquerdo;
                }else{
                    maiorFilho = filhoDireito;
                }
            //Quando não tiver filho direito, o esquerdo é maior    
            }else if (!indiceValido(filhoDireito)){
                maiorFilho = filhoEsquerdo;
            }else{
                maiorFilho = filhoDireito;
            }
            //Ao encontrar o maior, troca
            if(lista.get(i)<lista.get(maiorFilho)){
                aux = lista.get(i);
                lista.set(i, lista.get(maiorFilho));
                lista.set(maiorFilho, aux);
                
                //recursivamente até o fim do for
                heapify(i);
            }
        }
    }
    
    protected List heapSort(){
        heapify();
        //Troca a raiz com a o último elemento e subtrai o tamanho do Heap
        //Raiz do heap é sempre o maior elemento
        while(getHeapSize()>0){
            int aux = lista.get(getHeapSize());
            lista.set(getHeapSize(), lista.get(0));
            lista.set(0, aux);
            
            heapSize--;
            heapify();
        }
        
        return lista;
    }
    
    public String toString() {
        return "Max heap{\n"
                + "\t" + lista
                + "\n}";
    }
}
