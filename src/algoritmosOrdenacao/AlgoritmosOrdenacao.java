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
        
        /*System.out.println(a);
        a.selectionSort();
        System.out.println(a);
        */
        InsertionSort b = new InsertionSort();
        System.out.println(b);
        b.insertionSort();
        System.out.println(b);
    }
    
}
