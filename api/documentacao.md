# DIA 10/09/2024
1. Criação do Enum Status 
2. Criação do Enum Prioridade
3. 


Criação das tabelas pacientes e consultas


## Utilizando o Banco de dados H2 - Tempo de execução
1. Criar um arquivo chamado `application-test.properties` e incluir o seguinte código:

```java
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
2. Criar também o arquivo `application-dev.properties` e incluir tudo que está no `aplication.properties` padrão.

3. No arquivo original `application.properties`, realizar o apontamento para o `application-dev.properties`:
`spring.profiles.active=dev`

