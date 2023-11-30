
Les graphismes sont très minimalistes et les fonctionnalités limités afin de ne pas se perdre dans ce premier tp.


J'ai découvert les layouts concernant la gravité. En effet, j'ai eu des problèmes pour faire descendre les boutons afin de rendre le programme plus ergonomique.
Le layout gravité a permis de tous les faire descendre et ainsi régler mon problème.

On aurait pu utiliser des StringBuffer pour les variables _title, _description et _date, mais comme il n'y a pas l'utilisation de thread dans le tp, l'utilisation de StringBuilder est préféré pour sa performance.

Dans MyRSSsaxHandler nous avons ceci : private static class DownloadImageTask extends AsyncTask<String, Void, Bitmap>
Nous avons étendu la classe AsyncTask car elle permet d'effectuer de longues opérations sans bloquer l'interface utilisateur. Ici c'est pour télécharger une image.
Jérôme m'a aidé à faire et comprendre ce bout de code.

L'application n'est pas faite pour des écrans trop grans. Typiquement les tablettes. En effet les boutons ne s'adapteront pas, nous pourrions y remédier si besoin dans une seconde version de l'application.
Pour régler ce problème, nous pourrions utiliser un table Layout.


Critique : 

Améliorations :
Ajouter des boutons comme les virgules ou encore des fonctions mathématiques


J'ai fait la fonction testAddCharacter afin de tester la fonction addCharacter en ajoutant un character au StringBuilder.
J'ai fait la fonction testAddCharacters afin de tester la fonction addCharacter utilisé plusieurs fois.
J'ai fait la fonction testAddCharacterLimit afin de tester les limites de la fonction addCharacter lorsqu'il y a trop de character.

J'ai fait la fonction testCalculResult afin de tester la fonction calculResult sur un cas nominal.
J'ai fait la fonction testCalculResultError afin de tester la fonction calculResult sur un cas dégénéré (2 opérateurs se suivant).

On notera qu'il n'y a pas besoin de vérifier si le résultat dépasse la limite car il ne peut pas sachant que le calcul ne peux s'effectuer que sur une opération à limit-1 chiffres maximum.