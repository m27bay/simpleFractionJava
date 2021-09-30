# simpleFractionJava

# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Git propose d'ajouter, lors de la création du dossier, un README.md, un .gitignore ou une license et les dépose sur le git comme "Initial commit".

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    # Le git 21804355 n'existe pas, ceci est un compte fictif.
    # Mon git : m27bay ( n°etudiant en description ).
    # Repertoire : simpleFractionJava
    git config --global user.name "Mickael Le Denmat"
    git config --global user.email mickael-ledenmat@ens.uvsq.fr
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    git add Fraction.java Main.java
    git commit -m "Message"
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    Fraction f = new Fraction( (double)1, (double)2 );
    systeme.out.printl( f.toString() );
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    git branch -M master
    git remote add origine https://github.com/m27bay/simpleFractionJava.git
    git push -u orgine master
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > La syntaxe utiliée pour ce fichier est le **markdown**
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    git pull
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    *.class
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    /vscode
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    ???
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > On commence par lancer le générateur de clé "ssh-keygen"
    ( Choix du chemin du chemin d'accès et du mot de passe )
    On ajoute notre clé privé dans le ssh-agent en faisant "eval 'ssh-agent'" puis en faisant "ssh-add ~/.ssh/<private_key_file>".
    Enfin on ajoute notre clé public dans github.

## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > OS : Debian, Shell : Bash
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    man *commande*
    man ls
    man cd
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        ls -sSh
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        wc -l fichier.txt
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        grep -w uneVariable Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        ???
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        find /home/user -name README.md -print
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        diff fichier1 fichier2
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Permet de modifier leurs serveurs distants sur internet.
    * `screen`/`tmux`
        > Répondre ici
    * `curl`/[HTTPie](https://httpie.org/)
        > Répondre ici
    * [jq](https://stedolan.github.io/jq/)
        > Répondre ici

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Sublime, vscode

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Répondre ici
1. Comment choisir le JDK à utiliser dans un projet ?
    > Répondre ici
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Répondre ici
1. Comment reformater un fichier source Java ?
    > Répondre ici
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
1. Comment renommer une classe dans l'ensemble du projet ?
    > Répondre ici
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici