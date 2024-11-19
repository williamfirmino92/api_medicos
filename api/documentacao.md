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


=========================================================================================================================================
[PAGINAÇÃO]
Para alterar o tamanho e a página que está sendo exibida pelo insomnia
`localhost:8080/medicos?size=1&page=2`

[ORDENAÇÃO]
Para alterar a ordenação 
`localhost:8080/medicos?sort=nome`
`localhost:8080/medicos?sort=nome,desc `- O padrão é asc.

=========================================================================================================================================

[DTO]-> Conversão de dados Json para objeto na API.
[DAO] -> Classes responsáveis por guardar as lógicas das persistências no Banco de Dados;
[JPA] -> Anotações responsáveis pela persistência no Banco de Dados;

=========================================================================================================================================

[DELETE] - Em muitas regras de negócios, o dado não é excluido e sim desativado. Chamamos isso de exclusão lógica.

Código a ser utilizado para o flyway, no arquivo migrations:
alter table medicos add ativo tinyint;
update medicos set ativo = 1;