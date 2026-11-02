# Resolução do exercício Beecrowd1176

## Descrição do problema
Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.
## Como Funciona
1. **Pré-processamento (Cálculo da Sequência):**
   - Cria-se um vetor de inteiros longos `long fib[]` com tamanho 61 (para armazenar os índices de 0 a 60).
   - Define-se os casos base manualmente: `fib[0] = 0` e `fib[1] = 1`.
   - Um laço `for` de 2 até 60 preenche o vetor calculando cada posição como a soma das duas posições anteriores (`fib[i] = fib[i-1] + fib[i-2]`).
2. **Entrada de Dados e Consultas:**
   - O sistema lê a quantidade de testes `numentrada`.
   - Um laço `for` executa essa quantidade de vezes, lendo o índice pretendido `indice` a cada iteração.
3. **Saída de Dados:**
   - Em tempo constante, o programa acede diretamente à posição `fib[indice]` e imprime a mensagem formatada `"Fib(N) = X"`.