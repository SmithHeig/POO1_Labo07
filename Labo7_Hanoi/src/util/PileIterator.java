package util;

/**
 * Classe Représentant un itérateur sur la classe Pile
 * @author Adrien Alleman et James Smith
 */
public class PileIterator{
    private PileElement currentEl;
    
    /**
     * Constructeur d'itérateur
     * @param element élément ou doit commencé l'itérateur 
     *        (en général la tête de la pile)
     */
    PileIterator(PileElement element){
        currentEl = new PileElement(null,element);
    }
    
    /**
     * Permet d'aller à l'élément suivant et de retourner l'élément actuel
     * @return l'élément actuel
     */
    public Object next() {
        if(!hasNext()){
            return null; //Exception ?
        }
        currentEl = currentEl.next;
        return currentEl.data;
    }
    
    /**
     * Fonction testant si il y a encore des éléments après l'élément courant
     * @return true si il y a un élément suivant et false dans le cas contraire
     */
    public boolean hasNext(){
        return (currentEl.next != null); // temp
    }
}
