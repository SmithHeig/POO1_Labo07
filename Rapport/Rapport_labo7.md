#POO - Labo 7 - Les tours de Hanoi

## Question 1

*En  supposant  des  moines  surentraînés  capables  de  déplacer  un  disque  à  la  seconde,  combien  de  temps reste-t-il avant que l’univers disparaisse (celui-ci a actuellement 13.7 milliards d’années) ?*

Tel que décrit, la situation initiale où tout les disks se trouvent sur la première tour dans l'ordre croissant et doivent finir sur la dernière tour dans l'ordre croissant, corresponds au pire cas de l'algorithme de résolution du problème. Ainsi la formule pour calculer le nombre de déplacements nécessaires est donnée par :

$nombre\ de\ coups = 2^{nombre\_de\_disks}- 1$

Pour 64 disks, le temps basé sur le nombre de déplacement sera donc :

$2^{64} -1 = 18'446'744'073'709'551'616\ secondes$

pour avoir un résultat plus représentatif passons le en milliard d'années en le divisant par :

$60 * 60 * 24 * 365,2421875 * 1000000000 = 3,1556925e16$ 

(nous nous basons sur la durée d'une année selon [Johann Heinrich von Mädler](https://fr.wikipedia.org/wiki/Johann_Heinrich_von_M%C3%A4dler))

Ainsi nous obtenons que l'univers va disparaitre au bout de (arrondit à la 6ième décimalle soit au millier d'années)

$au\ bout\ de \ 584.554549\ milliards\ d'années$ 

Etant donné que celui-ci a actuellement $ 13,7\ milliards\ d'années$ il nous reste donc $584.5 - 13.7 = 570.8\ milliards\ d'années$ avant que l'univers ne disparaisse.

## Question 2

 

## Algorithme de Hanoi

```java
private void transfert(Pile from, Pile via, Pile to, int n){
  if(n > 0){
    transfert(from,to,via,n-1);
    to.stack(from.unstack());
    cmpt++;                  // incrémentation du nombre de tour
    displayer.display(this); // Affichage de status
    transfert(via,from,to,n-1);
  }
}
```

Pour résoudre le jeu d'Hanoi, nous avons décidé de prendre une solution récursive que nous avions déjà étudié en ASD1. 

- Pile from - est la Pile de départ
- Pile via - est la Pile qui servira d'intérmédiaire
- Pile to - est la Pile ou les disques finiront.

L'algorithme consiste à déplacé tous les disques sauf le plus gros sur la tour intérmédiaire, puis déplacer le plus gros sur la pile de destination et redéplacer les disques sur la tour de destination.

Pour mieux visualisé voilà une représentation graphique:

![Hanoi Algorithme](img/HanoiAlgo.PNG)

