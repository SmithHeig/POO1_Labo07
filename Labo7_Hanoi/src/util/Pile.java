package util;

/**
 * Classe représentant une Pile LIFO
 * @author Adrien Alleman et James Smith
 */
public class Pile {
    private PileElement head;
    
    /**
     * Constructeur par défaut
     */
    public Pile(){
        // Do nothing
    }
    
    /**
     * Constructeur prenant des objects en paramètres
     * @param objects Objets à stocker dans la pile
     */
    public Pile(Object ... objects){
        for(Object o : objects){
            stack(o); // A demander pourquoi il y a l'avertissement
        }
    }
    
    /**
     * Fonction qui permet d'ajouter un objet sur le sommet de la pile
     * @param o Objet à stocker
     */
    public void stack(Object o){
        PileElement newEl = new PileElement(o,head);
        head = newEl;
    }
    
    /**
     * Fonction qui permet d'enlever l'élément du sommet de la Pile
     * @return l'Objet enlever de la Pile
     */
    public Object unstack(){
        PileElement temp = head;
        head = head.next;
        return temp.data;
    }
    
    /**
     * Fonction permettant de représenter la pile graphiquement
     * @return la réprésentation de la Pile en String
     */
    public String toString(){
        String print = "";
        for(Object o : status()){
            print += "<" + o + "> ";
        }
        return print;
    }
    
    /**
     * Fonction permettant de récupéré l'état de la Pile
     * @return Un tableau d'objet contenant les objets de la pile
     */
    public Object[] status(){
        PileIterator it = iterator();
        Object[] objects = new Object[size()];
        int i = 0;
        while(it.hasNext()){
            objects[i++] = it.next();
        }
        return objects;
    }
    
    /**
     * Fonction permetant de récupéré un itérator de la Pile
     * @return Un PileIterator qui pointe sur le sommet de la Pile
     */
    public PileIterator iterator(){
        return new PileIterator(head);
    }
    
    /**
     * Fonction retournant le nombre d'élément contenu dans la pile
     * @return nombre d'élément dans la pile
     */
    public int size(){
        PileIterator it = iterator();
        /*
        if(head == null){
            return 0;
        }
        */
        int cmpt = 0;
        while(it.hasNext()){
            cmpt++;
            it.next();
        }
        return cmpt;
    }
    
}
