#POO - Labo 7 - Les tours de Hanoi

## Question 1

*En  supposant  des  moines  surentraînés  capables  de  déplacer  un  disque  à  la  seconde,  combien  de  temps reste-t-il avant que l’univers disparaisse (celui-ci a actuellement 13.7 milliards d’années) ?*

Tel que décrit, la situation initiale où tout les disks se trouvent sur la première tour dans l'ordre croissant et doivent finir sur la dernière tour dans l'ordre croissant, corresponds au pire cas de l'algorithme de résolution du problème. Ainsi la formule pour calculer le nombre de déplacements nécessaires est donnée par :

$nombre\ de\ coups = 2^{nombre\_de\_disks}- 1$

Pour 64 disks, le nombre de déplacement sera donc :

$2^{64} -1 = 18'446'744'073'709'551'616\ secondes$

