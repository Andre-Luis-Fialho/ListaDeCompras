# Lista de Compras

Projeto desenvolvido em Java para praticar **manipulação de listas de objetos**, **ordenação**, e **polimorfismo**.

## 📌 Sobre o Projeto

Este programa simula um sistema de compras onde o usuário define um **limite de cartão** e pode ir adicionando produtos até que o saldo seja ultrapassado. Ao final, os produtos são exibidos **ordenados por preço**, junto com o total gasto e o saldo restante.

## Conceitos Aplicados

### Manipulação de Listas de Objetos
- Utilização de `ArrayList<Produto>` para armazenar os produtos adicionados
- Adição dinâmica de objetos à lista conforme as escolhas do usuário

### Ordenação de Objetos
- Implementação da interface `Comparable<Produto>` na classe `Produto`
- Método `compareTo()` sobrescrito para ordenar produtos por **preço**
- Uso de `Collections.sort` para organizar a lista

### Polimorfismo
- A lista armazena objetos do tipo `Produto` (classe pai)
- O método `compareTo()` se comporta de forma específica para cada objeto
- O `Collections.sort()` trabalha de forma genérica com qualquer `Comparable`

### Controle de Fluxo e Validações
- Verificação de saldo antes de cada compra
- Acumulador `totalGasto` para controle do limite
- Loop controlado por condição (`while`) e pela vontade do usuário

### Encapsulamento
- Atributos privados na classe `Produto` (`nome`, `preco`, `precoTotal`)
- Acesso controlado por getters e setters

## 🛠️ Tecnologias

- Java (24)
- Collections (`ArrayList`, `Collections.sort()`)
- JetBrains Intellij IDEA / VSCode
- Git para versionamento
