# ApiSieveJava
Api da plataforma Sieve em java para consolidar os conehcimetos de spring, e futuramente integrala com o front.

## application.properties:

Optei pelo mysql porque é o que eu tinha mais conhecimento, mas pode fazer em outro banco de dados só trocar a configuração.

spring.datasource.url=jdbc:Mysql://localhost:3306/sieve?createDatabaseIfNotExist=true&serverTimezone=UTC

spring.datasource.username=seuusername

spring.datasource.password=suasenha

jpa

spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

