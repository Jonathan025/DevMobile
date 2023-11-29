Ce tp met en oeuvre une calculatrice très simpliste afin d'introduire à la programmation android.

La calculatrice n'est pas capable de prendre plus d'un opérateur à la fois.
Par exemple 5+5 est possible mais pas 5+5+5
Néanmoins il est possible de faire 5+5 puis rajouter 5 à ce résultat.

Les graphismes sont très minimalistes et les fonctionnalités limités afin de ne pas se perdre dans ce premier tp.


J'ai découvert les layouts concernant la gravité. En effet, j'ai eu des problèmes pour faire descendre les boutons afin de rendre le programme plus ergonomique.
Le layout gravité a permis de tous les faire descendre et ainsi régler mon problème.




Critique : 

Améliorations :
Ajouter des boutons comme les virgules ou encore des fonctions mathématiques


J'ai fait la fonction testAddCharacter afin de tester la fonction addCharacter en ajoutant un character au StringBuilder.
J'ai fait la fonction testAddCharacters afin de tester la fonction addCharacter utilisé plusieurs fois.
J'ai fait la fonction testAddCharacterLimit afin de tester les limites de la fonction addCharacter lorsqu'il y a trop de character.

J'ai fait la fonction testCalculResult afin de tester la fonction calculResult sur un cas nominal.
J'ai fait la fonction testCalculResultError afin de tester la fonction calculResult sur un cas dégénéré (2 opérateurs se suivant).

On notera qu'il n'y a pas besoin de vérifier si le résultat dépasse la limite car il ne peut pas sachant que le calcul ne peux s'effectuer que sur une opération à limit-1 chiffres maximum.