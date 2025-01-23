# Calculadora Simples em Java

Este projeto é uma calculadora simples desenvolvida em Java, que permite ao usuário realizar operações matemáticas básicas: soma, subtração, multiplicação e divisão. 
O programa interage com o usuário por meio do console, pedindo a entrada de dois números e uma operação.

## Funcionalidades

- Soma (`+`)
- Subtração (`-`)
- Multiplicação (`*`)
- Divisão (`/`), com validação para evitar divisões por zero.

## Como Executar

### Pré-requisitos

1. Ter o **Java Development Kit (JDK)** instalado.
2. Configurar o **JAVA\_HOME** no ambiente.
3. Um editor ou IDE como **Eclipse**, **IntelliJ IDEA** ou **VS Code**.

### Passos para Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-simples-java.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd calculadora-simples-java
   ```
3. Compile o arquivo `Calculadora.java`:
   ```bash
   javac src/exercicio/Calculadora.java
   ```
4. Execute o programa:
   ```bash
   java -cp src exercicio.Calculadora
   ```

## Estrutura do Projeto

```
calculadora-simples-java/
|— src/
   |— exercicio/
       |— Calculadora.java
```

- **`src/`**: Contém o código-fonte do projeto.
- **`exercicio/`**: Pacote onde está localizada a classe principal `Calculadora`.

## Exemplo de Uso

Ao executar o programa, o usuário verá o seguinte fluxo:

```
Digite o primeiro número: 10
Digite o segundo número: 5
Escolha a operação (+, -, *, /): +
Resultado da adição: 15.0
```

### Caso de Divisão por Zero

```
Digite o primeiro número: 10
Digite o segundo número: 0
Escolha a operação (+, -, *, /): /
Erro: Divisão por zero não é permitida.
```

## Contribuindo

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Envie sua branch para o repositório remoto (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está sob a licença [MIT](LICENSE).

---

Desenvolvido por Walter Santos.

