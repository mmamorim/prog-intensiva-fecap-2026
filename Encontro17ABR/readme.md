
## Encontro - 17/04

#### Prática de Programação e Lógica com Codewars

Na aula de hoje, vamos focar no desenvolvimento do raciocínio lógico e das habilidades de programação por meio da prática. Para isso, utilizaremos a plataforma Codewars, que oferece desafios interativos (katas) em diferentes níveis de dificuldade.

https://www.codewars.com/

---

Vamos fazer esses?

https://www.codewars.com/kata/5704aea738428f4d30000914

https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15

https://www.codewars.com/kata/69b9359e8af0beedadc87db9

https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

https://www.codewars.com/kata/54e6533c92449cc251001667


~~~java
public class ZywOo {

  public static String warnTheSheep(String[] lista) {
    
    int ultimo = lista.length-1; 
    int sheep = 0;
    
    for(int i=ultimo; i >= 0; i--) {
         if(lista[i].equals("wolf") && i==ultimo) {
           return "Pls go away and stop eating my sheep";
         }
         if(lista[i].equals("wolf")) {
           return "Oi! Sheep number " + sheep + "! You are about to be eaten by a wolf!";
         }
         sheep++;
    }
    return "";
  }

}
~~~