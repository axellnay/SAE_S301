**Le besoin**

* organiser les contrôles.
* repartir le placement des étudiants dans différentes salles.
* prendre en compte plusieurs contraintes de placement.
* réduire les erreurs et faciliter l'organisation.
* générer automatiquement un placement optimisé.



**profils utilisateurs**

* secretaire: gestion des listing étudiants, salles, contrôles, typologie de contrainte, placement et exports divers.
* enseignant: préparation, edition, consultation, et selon les droits modification des placements.
* étudiant: consultation de son placement.
* edition d'affichage collectif possible a l'entrée des salles(imprimables).



**étudiants**

* informations: nom, prénom, groupe, besoin spécifique.
* prévoir un id unique par étudiant.
* import initial depuis un fichier csv.
* validation des données lors de l'import.
* sauvegarde et réutilisation des listes pour plusieurs contrôles.



**besoin spé**

* étudiant devant être placé dans une salle spé.
* place particulière.
* près d'une sortie.
* ne pas placer a coté d'un autre étudiant.
* prise accessible pour ordi.



**construire des salles**

* créer et modifier les salles.
* définir les places et leur disposition.
* gérer des salles de formes et configuration différentes.
* sélectionner les places interdites.
* définir les caractéristiques des places: disponible, réservée, avec prise électrique, proche d'une sortie, etc.



**les contrôles**

* listing d'étudiants sont conservés dans une base réutilisable
* contrôle sélectionne les étudiants concernées
* un contrôle peut utiliser plusieurs salles
* les placements générés sont conservés dans l'historique



**règles de placements**

* un étudiant = une place
* places interdites ne peuvent pas être utilisées
* les salles et places imposées doivent être respectées
* les étudiants d'un meme groupe doivent être séparées
* les contraintes individuelles de voisinage doivent être respectées



**séparation des groupes**

* deux étudiant mm groupe ne doivent pas être directement voisins
* le voisinage concerné est horizontal ou vertical
* cette règle pourra être rendue configurable



**quand est-ce qu'un placement est optimal**

* respecter les contraintes obligatoire
* minimiser le nombre de salles utilisées
* remplir les salle efficacement
* repartir les groupe de manière aussi equitable que possible



**générer un placement**

* utilisateur peut choisir les options disponibles
* séparer les étudiants d'un groupe
* repartir les groupes
* minimiser le nombre de salles
* optimiser le remplissage
* respecter les besoins spécifiques
* définir si nécessaire un nombre maximum de salles
* une seule proposition de placement est nécessaire dans la première version



**voir et modifier le résultat**

* visualisation graphique de chaque salle selon sa dispo réelle
* liste étudiants avec tri des nom puis prénom
* recherche par filtres
* vue par salle
* déplacement manuel d'un étudiant
* vérification automatique des contraintes après chaque modification
* interdire une modification qui viole une contrainte obligatoire



**les sorties**

* PDF du plan de chaque salle
* excel
* csv
* liste des étudiants avec leur salle
* liste destinée aux surveillants
* affichage à l'entrée des salles



**sécurité et sauvegarde**

* authentification des utilisateurs
* gestion des roles et permissions
* mot de passe sécurisées
* sauvegarde dans la base de données
* journalisation des operations importantes
* protection des données personnelles
* validation des fichiers importés
* protection des API



**si aucun placement n'es possible**

* le système doit expliquer la cause de l'impossibilité
* identifier les contraintes qui empêchent le placement
* permettre a l'utilisateur de comprendre et de corriger la situation





**critère de réussite**

* importer, sauvegarder et réutiliser les étudiants
* créer des configurations différentes de salles et définir les places
* générer un placement valide et optimisé
* verifier les contraintes après modification
* visualiser, rechercher et consulter par salle
* produire les exports et listes adaptées

