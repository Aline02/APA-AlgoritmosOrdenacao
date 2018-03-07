package algoritmosOrdenacao;

/**
 *
 * @author aline
 */
public class AlgoritmosOrdenacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SelectionSort a = new SelectionSort();
        
        System.out.println("Sequencia de números não ordenada.");
        System.out.println(a);
        a.selectionSort();
        System.out.println("Sequencia ordenada de números ordenada pelo algoritmo Selection Sort");
        System.out.println(a);
        
        InsertionSort b = new InsertionSort();
        b.insertionSort();
        System.out.println("Sequencia ordenada de números ordenada pelo algoritmo Insertion Sort");
        System.out.println(b);
    }
    
}
