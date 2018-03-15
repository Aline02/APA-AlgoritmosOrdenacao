package algoritmosOrdenacao;

/**
 *
 * @author aline
 */
public class AlgoritmosOrdenacao {

    public static void main(String[] args) {
        SelectionSort a = new SelectionSort();
        
        System.out.println("Sequencia de números não ordenada.");
        System.out.println(a);
        a.selectionSort();
        System.out.println("Ordenada por Selection Sort");
        System.out.println(a);
        
        InsertionSort b = new InsertionSort();
        b.insertionSort();
        System.out.println("Ordenada por Insertion Sort");
        System.out.println(b);
        
        MergeSort c = new MergeSort();
        c.mergeSort();
        System.out.println("Ordenada por Merge Sort");
        System.out.println(c);
        
        QuickSort d = new QuickSort();
        d.quickSort();
        System.out.println("Ordenada por Quick Sort");
        d.quickSort();
        System.out.println(d);
    }
    
}
