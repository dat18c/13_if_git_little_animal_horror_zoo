# 13_if_git_little_animal_horror_zoo
## Agenda
* repetition if
* equals til sammenligning af objekter som f.eks. strenge
* færdiggør opsætning af Git og GitHub
* arbejd med Little Inn og Animal Horror Zoo

Little Animal Horror Zoo skal afleveres onsdag inden kl. 16

Læg alle kodefiler og kode i samme folder og tilføj til GitHub. I kan tilføje ad flere omgange. Upload links til GitHub repository i afleveringsmappen i Fronter.
  
## GitHub
  * tip 1: .gitignore fortæller, hvad der *ikke* skal med, når I bruger git add.
  `````
  echo "*.class" >> .gitignore
  `````
  giver sørger for at class-filer (compilerede java-filer) ikke tilføjes.
* tip 2: git config --global core.editor "nano" giver en editor, der er lettere at bruge end VI. Den bruges kun, når det bliver svært, som f.eks. ved manglende commit-besked. Windows-brugere kan evt. bruge "notepad.exe" i stedet.
  ## Øvelser
  Ekstra øvelser til if. Self-check øvelse 2 og øvelsen med funktionen, der giver dage i måneden er vigtige. Desuden en lille ekstraøvelse ud over dem i allerede har fået.
  
  1. Lav et program, der kører igennem de første 20 heltal og udskriver om det er et lige eller et ulige tal. Lidt hjælp: Brug modulus-operatoren. *tal % n* giver rest ved division med n. F.eks. *27 % 6* giver 3.
  
  
  ``````
  Output:
  1 er ulige
  2 er lige
  .
  .
  .
  20 er lige
  ``````
