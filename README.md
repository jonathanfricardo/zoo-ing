# Zoo Java Console Application
---
## Git

Voor het maken van deze opdracht wordt er gebruik gemaakt van het versiebeheersysteem Git.

Gebruikte **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/). (**Niet verplicht**)

Gebruikte **SDK**: [JDK 1.8](https://bitbucket.org/kychu/zoo/downloads/java-1.8.0-openjdk-1.8.0.212-3.b04.redhat.windows.x86_64.zip).

Mocht er problemen zijn met het openen van dit project, creëer dan een nieuw project binnen jouw IDE en kopieer de Java bestanden uit `src/com/ing/zoo`

Stappen:

1. Clone deze repository.
2. Maak een nieuwe repository aan, bijvoorbeeld op [Github](https://www.github.com).
3. Push jouw veranderingen naar jouw repository.
4. Maak jouw repository openbaar (public).
4. Als de applicatie af is, push dan de laatste versie naar jouw `master` branch.

--- 
## Opdracht
- Maak de applicatie af.
- Reorganiseer eventueel de folder structuur.
- Refactor eventueel de code (denk goed na over de class structure).
	- Probeer er voor de zorgen dat je bijvoorbeeld geen EatMeat methode kan aanroepen op een Zebra object.
- Voeg 2 nieuwe dieren toe.
---
## Eisen

Bij elke command laat je het resultaat in de console  zien.

- Als je de [hello] command uitvoert zonder dat er een naam is ingevuld zeggen alle dieren hallo.
	- Als er wel een naam is ingevuld [hello henk] zegt alleen dat dier hallo 
- Als je de [give leaves] command uitvoert krijgen alle herbivores leaves.
- Als je de [give meat] command uitvoert krijgen alle carnivores meat.
- Als je de [perform trick] command uitvoert doen alle dieren die dat kunnen hun trucje.
---
## Uitwerking

### Structuur

```
src/com/ing/zoo/
├── Zoo.java                 # main: leest commands en stuurt de dieren aan
├── animals/
│   ├── Animal.java          # abstracte basisklasse (naam + sayHello)
│   ├── Lion.java, Hippo.java, Pig.java, Tiger.java, Zebra.java
│   └── Monkey.java, Otter.java   # 2 nieuwe dieren
└── behaviour/
    ├── Herbivore.java       # eatLeaves()
    ├── Carnivore.java       # eatMeat()
    └── TrickPerformer.java  # performTrick()
```

Elk dier erft van `Animal` en implementeert alleen de interfaces die bij dat dier passen.
Zo heeft een `Zebra` geen `eatMeat()` methode, en kan die dus ook niet aangeroepen worden.
Gedrag zit in interfaces in plaats van in een klassenhiërarchie, omdat een dier meerdere
dingen kan zijn tegelijk (een `Pig` is zowel herbivoor als carnivoor en kan een trucje).

| Dier   | Naam   | Herbivore | Carnivore | TrickPerformer |
|--------|--------|:---------:|:---------:|:--------------:|
| Lion   | henk   |           | ✓         |                |
| Hippo  | elsa   | ✓         |           |                |
| Pig    | dora   | ✓         | ✓         | ✓              |
| Tiger  | wally  |           | ✓         | ✓              |
| Zebra  | marty  | ✓         |           |                |
| Monkey | ricard | ✓         | ✓         | ✓              |
| Otter  | lila   |           | ✓         | ✓              |

### Compileren en runnen

Vanuit de root van het project (JDK 1.8):

```
mkdir out
javac -d out src/com/ing/zoo/*.java src/com/ing/zoo/animals/*.java src/com/ing/zoo/behaviour/*.java
java -cp out com.ing.zoo.Zoo
```

### Commands

| Command         | Resultaat                                   |
|-----------------|---------------------------------------------|
| `hello`         | alle dieren zeggen hallo                    |
| `hello <naam>`  | alleen dat dier zegt hallo                  |
| `give leaves`   | alle herbivores eten bladeren               |
| `give meat`     | alle carnivores eten vlees                  |
| `perform trick` | alle dieren die een trucje kunnen doen het  |
| `exit`          | sluit de applicatie af                      |
