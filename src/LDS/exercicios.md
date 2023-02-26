Nome: Antonio Manuel Sitoe
Desenvolvimento de software

### 1 Pergunta:

Faça um programa que receba o nome e o salário de um funcionário, calcule e
imprima o nome do funcionário e o valor do imposto de renda a ser pago,
sabendo que o imposto equivale a 5% do salário.

```java
package LDS;
import java.util.Scanner;

public class salarioDeFuncionario {
    public static void main(String[] args) {
        String nome;
        double salario;
        double imposto;
        double taxa = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o teu nome");
        nome = sc.next();
        System.out.println("Digite o teu Salario");
        salario = sc.nextDouble();
        imposto = salario * taxa;

        System.out.println("O nome do funcionario: " + nome);
        System.out.println("O valor do imposto a pagar: " + imposto);
    }
}

```

### Pergunta 2

Faça um programa que receba a idade de uma pessoa em anos, calcule e imprima
essa idade em: NB cada alínea faça um programa e programa.
a) meses,
b) dias,
c) horas
d) minutos.

```java
package LDS;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        double age, month, day, hour, minuts;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tua idade");
        age = sc.nextDouble();
        // Validação da entrada do usuário
        if (age < 0) {
            System.out.println("A idade deve ser um valor positivo.");
            return;
        }

        month = age * 12;
        day  = age * 365;
        hour = day * 24;
        minuts = hour * 60;
        System.out.println("Idade  : "+ age);
        System.out.println("Meses  : "+ month);
        System.out.println("Dias   : "+day);
        System.out.println("Horas  : "+hour);
        System.out.println("Minutos : "+ minuts);

    }
}

```

### ### Pergunta 3

Escreva um programa que receba dois números inteiros, calcule e escreva: NB: cada alínea faça um programa e programa.
a) Soma dos dois números
b) Subtracção do primeiro pelo segundo
c) Subtracção do segundo pelo primeiro
d) Multiplicação dos dois números
e) Divisão do primeiro pelo segundo
f) Divisão do segundo pelo primeiro
g) o primeiro elevado ao quadrado

```java
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo  numero ");
        num2 = sc.nextInt();

//        a) soma dos dois numeros
        System.out.println("A soma dos dois numeros: "+ (num1+num2));
        System.out.println("Subtracao do primeiro pelo segundo "+ (num1-num2));
        System.out.println("Subtracção do segundo pelo primeiro "+ (num2 - num1));
        System.out.println("Multiplicação dos dois números "+ (num2 * num1));
        System.out.println("Divisão do primeiro pelo segundo "+ (num1 / num2));
        System.out.println("Divisão do segundo pelo primeiro "+ (num2 / num1));
        System.out.println("o primeiro elevado ao quadrado "+  Math.pow(num1, 2));

    }
}
```

### Pergunta 4

Faça um programa que receba o ano do nascimento de uma pessoa e o ano actual.
Calcule e imprima:
a) A idade dessa pessoa;
b) Essa idade convertida em semanas.

```java
package LDS;
import java.util.Scanner;

public class Ano {
    public static void main(String[] args) {
        double bornYear, frequentYear, age, ageForWeek;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        bornYear = sc.nextDouble();

        System.out.print("Digite o ano actual: ");
        frequentYear = sc.nextDouble();

        age = frequentYear - bornYear;
        ageForWeek = age * 52.177;

        System.out.println("IDADE : " + age);
        System.out.println("Essa idade convertida em semanas. : " + ageForWeek);
    }
}
```

### Pergunta 5

Escreva um programa que leia 2 valores C e B e calcule o valor de A, sabendo
Que C = (A + B) \* B. O programa deve imprimir os valores de A, B e C.

```java
package LDS;
import java.util.Scanner;
public class valorDeA {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite o valor de C: ");
            double c = sc.nextDouble();
            System.out.println("Digite o valor de B: ");
            double b = sc.nextDouble();


            double a = (c / b) - b;


            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("Valor de C: " + c);
        }
}

```
