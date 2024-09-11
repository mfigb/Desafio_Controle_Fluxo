# Desafio de Controle de Fluxo (Claro - Java com Spring Boot)

Esse projeto faz parte do Bootcamp Claro - Java com Spring Boot.  O desafio consiste em inserir dois números inteiros via terminal. Após a inserção é calculada a contagem de números entre eles e são impressos os números incrementados. Caso o segundo número seja menor que o primeiro, é enviada uma mensagem de exceção personalizada.

# Funcionalidade

Inserir dois parâmetros inteiros.
Verificar se as entradas são números inteiros válidos.
Sendo válidos, calcula a quantidade de iterações necessárias (utilizando um loop for) para imprimir cada interação.
Caso contrário, será exibida uma mensagem de erro e solicitará novamente entradas válidas.

# Exceção
O programa faz tratamento de exceções personalizadas. Se o segundo número for menor que o primeiro, uma exceção personalizada chamada ParametrosInvalidosException mostrará a mensagem: "O segundo parâmetro deve ser maior que o primeiro"
