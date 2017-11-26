a)
Vis hvordan utskriften i terminalen blir når kodebiten under blir utført. Vis _hva_ som blir skrevet ut og _hvordan_ det blir seende ut.

```java
  int i = 0;
  while(i < 10){
    for(int j = 0; j <= i; j++){
      System.out.println(j + " ");
    }
    System.out.println();
    i++;
  }
```
0

0
1

0
1
2

0
1
2
3

0
1
2
3
4

0
1
2
3
4
5

0
1
2
3
4
5
6

0
1
2
3
4
5
6
7

0
1
2
3
4
5
6
7
8

0
1
2
3
4
5
6
7
8
9


b)
x = 1, y = 2 og z = 3
alle er heltall.

Hvordan blir utskriften ved følgende kodebit:

```java
  x = x + y;
  y = y + x;
  z = z + (x++) + (++y); //*
  System.out.println("x = " + x + "\ny = " + y + " \nz = " + z);
```

line 1:
x = 1 + 2, __x = 3__
y = 2 + 3, __y = 5__
z = 3 + (3 (_inkrementert etter_)) + (6 (_inkrementert før_)), __x = 4, y = 6, z = 12__

Terminalvinduet:
x = 4
y = 6
z = 12


Dersom parentesene i linje 3 fjernes skjer det ingen endringer, så lenge spacing behodes

x = x + y;
y = y + x;
z = z + x++ + ++y;

c)
Nr. 1: 18
Nr. 2:
8
Nr. 3:
0 //dersom datatypen er double og .00 som suffix -> 0.4
Nr. 4:
10
Nr. 5:
0 //dersom double og .00 -> (3 * 0.8 * 6) -> 14.4
