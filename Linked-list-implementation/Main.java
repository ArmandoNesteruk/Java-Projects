// Das Interface für die Liste 
interface MyList<T> {
    void add(T value);
    T findMaxValue() throws LinkedListException;
}

// Das Listenelement (Knoten)
class MyLinkedListElement<T> {
    private T value;                         // Der eigentliche Wert
    private MyLinkedListElement<T> nextElement; // Verweis auf das nächste Element 

    public MyLinkedListElement(T value) {
        this.value = value;
        this.nextElement = null;             // Am Anfang gibt es kein nächstes Element
    }

    public T getValue() { return value; }
    public MyLinkedListElement<T> getNextElement() { return nextElement; }
    public void setNextElement(MyLinkedListElement<T> nextElement) { this.nextElement = nextElement; }
}


// Eigene Exception
class LinkedListException extends Exception {
    public LinkedListException() {
        super();
        System.out.println("Es ist ein Fehler in der LinkedList aufgetreten.");
    }
}


// Die Implementierung der Liste 
class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private MyLinkedListElement<T> root;     // Das erste Element der Liste (Wurzel) 

    public MyLinkedList() {
        root = null;    // Die Liste ist anfangs leer
    }

    @Override 
    public void add(T value) {
        if (root == null) {
            // Wenn die Liste leer ist, wird das root-Element erstellt
            root = new MyLinkedListElement<T>(value);
        } else {
            // Wir starten am Anfang der Liste
            MyLinkedListElement<T> lastElement = root;
            
            // Schleife bis zum letzten Element
            while (lastElement.getNextElement() != null) {
                lastElement = lastElement.getNextElement();
            }
            
            // Neues Element am Ende hinzufügen
            MyLinkedListElement<T> newElement = new MyLinkedListElement<T>(value); 
            lastElement.setNextElement(newElement);
        }
    }

    @Override 
    public T findMaxValue() throws LinkedListException {
        // Wenn die Liste leer ist, Fehler werfen
        if (root == null) throw new LinkedListException();
        
        MyLinkedListElement<T> maxElement = root; // Wir nehmen an, das erste ist das größte
        
        // Alle Elemente durchlaufen
        for (MyLinkedListElement<T> nextElement = root.getNextElement(); nextElement != null; nextElement = nextElement.getNextElement()) {
            // Wenn das nächste Element größer ist, aktualisieren wir maxElement
            if (maxElement.getValue().compareTo(nextElement.getValue()) < 0) {
                maxElement = nextElement;
            }
        } 
        return maxElement.getValue(); // Den größten Wert zurückgeben
    }
}


//Hauptklasse zum Testen
public class Main {
    public static void main(String[] args) {
        // Eine neue Liste für Strings erstellen
        MyList<String> linkedList = new MyLinkedList<String>(); 
        
        // Testdaten hinzufügen
        linkedList.add("Test");
        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.add("Zenith"); 

        try {
            // Maximum suchen und ausgeben
            String maxValue = linkedList.findMaxValue();
            System.out.println("Max value in list: " + maxValue);
        } catch (LinkedListException e) {
            // Fehler abfangen, falls die Liste leer war
            System.out.println("Exception caught!");
        }
    }
}