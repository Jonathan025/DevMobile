# Rapport développement mobile 

 

1. Cadre du TP 

2. Calculatrice 

3. Flux RSS 

4. Prochaine Version et Critiques 

5. Conclusion 

 

## 1/ Cadre du TP 

Nous voulons coder une application pour smartphone disposant de 2 fonctionnalités principales : Une calculatrice et un afficheur de flux RSS reçu depuis Lemonde. 

 

## 2/ Calculatrice 

Nous rendons l’application suivante : un écran d’accueil nous permettant d’aller sur le flux RSS ou bien la calculatrice via 2 boutons. La calculatrice est très minimaliste et dispose de fonctionnalités très limitées. En effet, elle n’opère que sur des entiers, n’a pas de parenthèses ou encore de fonctions mathématiques.  De plus pour des raisons graphiques ou encore pour ne pas subir des erreurs, la barre contenant les calculs est limitée à 10 caractères seulement. Cela la rend très solide contre toute attaque ou bug. En effet, comme la barre est limité, un attaquant ne peut pas dépasser une possible taille maximale ni casser le code pour s’y introduire en demandant un calcul beaucoup trop grand à faire (il faudrait dépasser la valeur max d’un double pour ce faire, quand bien même, j’utilise la fonction evaluate de JavaScriptEngine qui renvoie infini si jamais cela se produit). La seule erreur restante qu’il fallait prendre en compte pour éviter les attaques ou les crashs était les expressions mathématiques invalide, en effet “5++5” faisait planter l’application. Pour régler ce problème j’ai juste récupéré l’exception que pouvait renvoyer evaluate afin d’écrire Invalid en tant que résultat sur la calculatrice. 

Lorsqu’un résultat d’une opération précédente se trouve sur l’écran, il y a la possibilité de retravailler dessus en écrivant un opérateur, ou bien de la supprimer totalement en rentrant un nouveau chiffre. 

Lorsque Invalid se trouve sur l’écran, n’importe qu’elle entrée supprime ce dernier. 

Le code de la calculatrice se trouve sur 2 .java différents, CalculatorActivity et CalculatorModel. CalculatorActivity fait le lien entre le xml de la page calculatrice et CalculatorModel qui réalise notamment les tâches de calcul. CalculatorActivity s’occupe ainsi de lier les boutons aux actions qui leur correspondent et d’afficher ce que lui donne CalculatorModel. 

De nombreux tests ont ainsi été réalisé sur des fonctions de CalculatorModel, j’ai suivi la méthode qui stipule de créer d’abord les tests fonctionnels afin de s’occuper du code. Cette façon de faire est bénéfique car on sait dans quelle direction on se dirige et que notre code est correct. Ainsi, plusieurs tests sont disponibles, des cas nominaux, des cas dégénérés et un cas limite. On test l’ajout de caractères, la suppression de caractère même s’il n’y en a plus, un résultat d’opération valide, un résultat d’opération invalide et enfin, le cas limite, lorsque nous avons déjà 10 caractères, il est impossible d’en ajouter un. On notera qu’il est inutile de vérifier si une expression dépasse ou non la limite fixée puisque nous n’avons que des opérateurs simples et ceux-ci ne permettent pas de dépasser le maximum avec des opérions contenant au maximum limite-1 chiffres.  

On notera que les boutons de la calculatrice se situe en bas de l’écran, près des pouces pour des raisons ergonomique. 

La calculatrice m’a également permis de découvrir des Layouts, et notamment le Layout Gravity. En effet, j'ai eu des problèmes pour faire descendre les boutons et ces layout m’y a aidé. 

En revanche, l’application n'est pas faite pour des écrans trop grands, typiquement les tablettes. En effet les boutons ne s'adapteront pas, nous pourrions y remédier si besoin dans une seconde version de l'application. Néanmoins, la calculatrice garde les boutons groupés, ce qui fait que lorsqu’on tourne l’écran ou qu’on se retrouve sur une tablette, bien qu’on perde beaucoup en ergonomie, la calculatrice reste simple d’utilisation et claire. 

On remarque de plus qu’en haut de la page de la calculatrice se trouve 2 boutons, l’un permet de retourner sur la page d’accueil, l’autre permet de basculer sur la page du flux RSS. 

 

## 3/ Flux RSS 

Présentons maintenant l’activité lié au flux RSS. Elle se lance, néanmoins elle n’affiche rien d’intéressant. En effet, c’est une page avec quelques boutons et des zones de textes ou encore une zone pour une image, mais rien n’est utilisé. Elle est pourtant prête à être utilisée. Le problème est les erreurs insurmontables qui ont eu lieu. Bien que rien ne s’affiche, vous pourrez tout de même observer que j’ai réussi à recevoir et travailler sur le flux RSS. En effet, si vous regardez les logs lorsque vous lancer le flux RSS, vous pourrez voir que j’affiche belle et bien le titre, la description et la date. Ainsi je suis parvenu à travailler dessus. Mais alors pourquoi ça ne fonctionne pas ? 

Si vous souhaitez voir l’erreur qui empêche mon flux RSS de s’afficher, il faut aller dans FluxModel, au niveau de la fonction public void show(Item item). Vous remarquerez qu’elle est passé en commentaire. En la réintégrant au code et en compilant le projet on obtient ces erreurs au lancement de la page Flux RSS : dans la fonction show, l’appel de getItem renvoie un null alors même que dans le code, des System.out.println() permettent d’observer que lors du travail sur le flux, il ne l’est pas. Beaucoup de tests ont été réalisé afin de voir d’où venait le problème, aucun n’a fonctionné. J’ai même mis des FluxActivity.show dans FluxModel ou dans MyRSSsaxHandler alors que ça va à l’encontre du code propre, mais rien n’y a fait, l’erreur persistait. Cela pourrait être revu dans une seconde version de l’application, lier les résultats du flux RSS avec l’affichage sans crash. 

Concernant les choix sur les graphismes de la page flux RSS, ils ont été réalisés en se basant exactement sur le code donné dans le cahier de TP. (Voir section Prochaine Version et Critiques)  

On aurait pu utiliser des StringBuffer pour les variables _title, _description et _date dans le fichier MyRSSsaxHandler mais comme il n'y a pas l'utilisation de thread dans le tp, j’ai préféré l'utilisation de StringBuilder pour sa performance. 

Pour récupérer et travailler sur le flux RSS j’ai choisi de prendre la librarie Volley car elle était fortement conseillée par mon professeur. J’ai également travaillé avec SAXparser car Jérôme avait réalisé son Flux RSS avec ce dernier et cela me permettait de pouvoir lui demander de l’aide en cas de besoin plus facilement que si j’avais travaillé avec DOMparser par exemple. 

J’ai créé une classe Item afin de stocker des informations du flux RSS comme le titre, la description, la date et l’image. Cela me permettait d’alléger le code à certains endroits, de le rendre un peu plus compréhensible et surtout de pouvoir communiquer plus facilement entre FluxModel, FluxActivity et MyRSSsaxHandler.  

 

## 4/ Prochaine Version et Critiques 

Le code a été fait de façon à ressembler à la méthode MVP sans pour autant être trop alourdi, c’est pourquoi j’ai simplement le fichier xml, un Activity et un Model. 

Nous pourrions pour commencer, rendre la page d’accueil plus intéressantes avec des dessins autour de nos boutons et des couleurs un peu plus chaleureuse. Pourquoi pas même un décor qui change en fonction des saisons pour avoir un sentiment de nouveau de temps à autre. 

Nous pourrions ajouter d’autres boutons aussi qui permettrait à l’utilisateur d’avoir des flux RSS provenant d’autres lieux que simplement Lemonde. Comme l’a montré Jérôme, il serait même possible de communiquer avec discord pour voir les messages. 

Il y a de nombreuses voies d’améliorations pour la calculatrice comme pour le flux RSS. 

Déjà, dans une prochaine version, nous pourrions rendre la calculatrice responsive ou encore faire en sorte qu’elle s’adapte à la taille de n’importe quel écran si besoin. Pour ce faire, on pourrait utiliser un TableLayout. Ceci n’a pas été fait car l’attention devait se prêter au flux RSS, mais un TableLayout ancré sur le bas de la page pourrait nous permettre d’adapter la taille des boutons. 

On pourrait également revoir les couleurs de la calculatrice, en effet, ces dernières ne sont pas en capacité de donné envie à l’utilisateur. 

On pourrait aussi rajouter des boutons tel que ‘,’, ‘(‘, ‘)’ ou encore des fonctions mathématiques tel qu’exponentiel ou sinus. Néanmoins ceci demanderait plus de travail, en effet, il faudrait peut-être revoir le design de la calculatrice et passer d’une calculatrice entière à une calculatrice de nombres décimaux. De plus, il serait maintenant possible de dépasser la limite de caractère, ce qui nous imposerait à rajouter un infini et un –infini. Concernant la limite, nous pourrions aussi l’enlever en la remplaçant par un dézoome sur l’expression. En effet, la police du texte pourrait rétrécir au fur et à mesure qu’on écrit pour rester sur une ligne. Néanmoins il faudrait faire attention et une prendre une décision pour que la taille d’écriture ne rende pas l’expression illisible. 

Pour faire interagir davantage la page Flux RSS avec la calculatrice, on pourrait faire apparaître des notifications en haut de la page de la calculatrice lorsqu’un nouvel item arrive sur le flux. 

Dans une seconde version de ce projet, nous pourrions aussi faire fonctionner le flux RSS (ce serait pas mal). Bien que j’y sois parvenu, c’est quand même très dommage d’avoir un travail qui ne peut être observer dans l’application et qui de surcroît donne une page qui ne répond pas à la fonction qui lui a été attribué ; afficher les données. 

On pourrait également revoir les graphismes de l’activité du Flux RSS, en effet, elle aurait davantage besoin de couleurs et de style que la calculatrice. Pour l’ergonomie on pourrait par exemple placer les boutons suivant et précédent en bas de la page pour qu’ils soient plus près des pouces. Adapter le flux à l’écran si jamais on désire pouvoir tourner le téléphone (fonctionnalité désactivée pour le flux) en laissant les boutons en bas de l’écrans mais en faisant défiler maintenant le flux de gauche à droite plutôt que de bas en haut. 

Et pour finir, nous pourrions rajouter 2 boutons en haut, comme sur la calculatrice, afin de pouvoir aller sur la page d’accueil ou la calculatrice. 

Concernant le code du flux, dans MyRSSsaxHandler nous avons ceci : private static class DownloadImageTask extends AsyncTask<String, Void, Bitmap>. J’ai étendu la classe AsyncTask car elle permet d'effectuer de longues opérations sans bloquer l'interface utilisateur. Ici c'est pour télécharger une image. 

Jérôme m'a aidé à faire et comprendre ce bout de code. 

Mais pour améliorer le code du Flux RSS, au lieu d’utiliser cette façon de faire, nous pourrions également utiliser des threads. De plus, ceci pourrait peut-être régler l’erreur de l’item null. Néanmoins il faudrait peut-être veiller à changer les StringBuilder en StringBuffer dans MyRSSsaxHandler si jamais des erreurs ou exceptions remontent.  

On pourrait également, renommer les tests réalisés pour la calculatrice. En effet, ceux-ci ont été réalisés alors que ma façon de voir les tests n’était pas la bonne. En effet, je testais des fonctions de CalculatorModel plutôt que les fonctionnalités de mon application, ce qui m’a bien embêté pendant mes tests. Ce qui fait que les noms sont peu représentatifs et ridicules. 

 

## 5/ Conclusion 

Ce TP m’a permis de m’ouvrir au développement mobile, mais surtout aux qualités nécessaires à un ingénieur en informatique. Nous ne devions pas simplement faire notre application, nous devions savoir nous adapter, communiquer et faire des compromis afin d’arriver au meilleur résultat possible avec le matériel à disposition et le temps attribué. J'ai ainsi beaucoup appris et je pense que ça me sera utile dès mes prochains TP. 

(Un git Pages est disponible) 