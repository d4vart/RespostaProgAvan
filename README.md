1. Explique com suas palavras o que é Spring Security: é um framework de java focado em fornecer camadas de segurança robustas

2. Para que serve o método csrf().disable()?: é utilizado para desativar a proteção nativa contra ataques CSR

3. Explique o que significa SessionCreationPolicy.STATELESS:  instrui o sistema a nunca criar ou usar sessões HTTP para autenticação

4. Qual a função do permitAll()?: libera o acesso irrestrito a endpoints ou métodos específicos em frameworks de segurança

5. Explique o que faz o requestMatchers().: mapeia e seleciona quais URLs ou requisições HTTP específicas devem ter uma determinada regra de segurança

6. Qual a função do anyRequest().authenticated()?: exigir que o usuário esteja autenticado (logado) para acessar qualquer requisição da aplicação

7. O que é uma API Stateless?: ) é um modelo de arquitetura onde o servidor não armazena nenhuma informação sobre as interações anteriores do cliente

8. Explique o que a lambda abaixo faz:
session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS): le informa ao sistema para não criar nem usar sessões HTTP para armazenar o estado do usuário, tornando a aplicação stateless



