package util;

/**
 * Classe Représente un élément de la Pile. Contient un Objet
 * @author Adrien Alleman et James Smith
 */
class PileElement {
    Object data;          //prof ?
    PileElement next;     //prof ?
    
    /**
     * Constructeur d'élément de la Pile
     * @param data objet que la PileElement doit contenir
     * @param oldHead l'élément qui était sur le sommet de la pile
     */
    PileElement(Object data, PileElement oldHead){
        this.data = data;
        this.next = oldHead;
    }
    
    /**
     * Fonction permettant de représenté l'objet contenu dans la PileElement
     * @return String contenant la représentation de l'objet contenu
     */
    public String toString(){
        return data.toString();
    }
}
