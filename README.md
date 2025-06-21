# Curso Especialista JPA

Seja bem-vindo ao curso **Especialista JPA**! Neste curso, você aprenderá desde os conceitos fundamentais de persistência de dados até recursos avançados de mapeamento, consultas e desempenho utilizando JPA (Jakarta Persistence API).

## Conteúdo do Curso

### Introdução
- O que é persistência de dados?
- Criando tabelas e persistindo dados pelo MySQL Workbench
- Usando o MySQL Client
- Instalando o JDK
- Instalando a IDE IntelliJ IDEA
- Importando o projeto do GitHub
- Entendendo e configurando o JUnit
- Acessando o banco de dados com JDBC
- O que é JPA?
- O que é Mapeamento Objeto-Relacional (ORM)?
- Jakarta Persistence vs Java Persistence API

### Iniciando com JPA
- Criando um projeto com Apache Maven
- Mapeando a primeira entidade com JPA
- Criando o `persistence.xml`
- Criando o EntityManager
- Montando a classe para testes com o JUnit
- Buscando objetos por identificador
- Criando uma classe genérica para testes
- Abrindo e fechando uma transação
- Inserindo o primeiro objeto com o método `persist`
- Removendo objetos com o método `remove`
- Atualizando objetos com o método `merge`
- Atualizando objetos gerenciados
- Adicionando objetos com o método `merge`
- Entendendo a diferença entre os métodos `persist` e `merge`
- Exercício: implementando um CRUD
- Desanexando objetos do contexto de persistência com o método `detach`
- Conhecendo e usando Lombok

### Mapeamento básico
- Conhecendo o modelo de domínio do projeto e criando as entidades
- Mapeando as entidades e customizando os nomes das tabelas e colunas
- Exercício: mapeando a classe Pedido
- Entendendo a diferença entre mapear atributos ou métodos
- Mapeando enumerações com `@Enumerated`
- Mapeando objetos embutidos com `@Embeddable`
- Conhecendo as estratégias para geração de identificador com `@GeneratedValue`
- Configurando a geração de identificador com `@SequenceGenerator`
- Configurando a geração de identificador com `@TableGenerator`
- Configurando geração de identificador com a estratégia `IDENTITY`
- Exercício: corrigindo classes de testes

### Mapeamento de Relacionamentos
- Conhecendo os tipos de relacionamentos entre entidades
- Mapeando relacionamentos muitos-para-um com `@ManyToOne`
- Exercício: mapeando relacionamentos muitos-para-um
- Mapeando relacionamentos um-para-muitos com `@OneToMany`
- Exercício: mapeando relacionamentos um-para-muitos
- Mapeando autorelacionamentos
- Removendo objetos referenciados por outras entidades
- Mapeando relacionamentos muitos-para-muitos com `@ManyToMany` e `@JoinTable`
- Mapeamento de relacionamentos um-para-um com `@OneToOne`
- Exercício: mapeando relacionamentos um-para-um
- Mapeando relacionamentos um-para-um com `@JoinTable`
- Entendendo o funcionamento de Eager e Lazy Loading
- Para o que serve o atributo `optional`
- Exercício: usando o atributo `optional`

### Conhecendo o EntityManager
- Estados e ciclo de vida dos objetos
- Entendendo o cache de primeiro nível
- Gerenciamento de transações
- Funcionamento do método `flush`
- Contexto de persistência e o Dirty Checking
- Callbacks para eventos do ciclo de vida
- Listeners para eventos do ciclo de vida

### Mapeamento avançado
- Detalhes da anotação `@Column`
- Exercício: anotação `@Column`
- Mapeando chave composta com `@IdClass`
- Exercício: usando `@IdClass`
- Mapeando chave composta com `@EmbeddedId`
- Mapeando chave primária e estrangeira na mesma coluna com `@MapsId`
- Exercício: usando `@MapsId`
- Declarando propriedades transientes com `@Transient`
- Mapeando coleções de tipos básicos com `@ElementCollection`
- Mapeando coleções de objetos embutidos com `@ElementCollection`
- Mapeando mapas com `@ElementCollection`
- Persistindo dados de arquivos com `@Lob`
- Exercício: persistindo fotos de produtos
- Mapeando tabela secundária com `@SecondaryTable`
- Mapeando herança com `@MappedSuperclass`
- Diferença entre entidade abstrata e `@MappedSuperclass`
- Mapeando herança com estratégia Single Table
- Mapeando herança com estratégia Table Per Class
- Mapeando herança com estratégia Joined Table
- Exercício: voltando o mapeamento de herança para Single Table

### Geração de DDL
- Quando criar o schema do banco usando JPA?
- Configurando detalhes da tabela com `@Table`
- Exercício: usando `@Table`
- Configurando colunas com `@Column`
- Exercício: usando `@Column`
- Corrigindo os testes do JUnit
- Usando a anotação `@Lob` em strings
- Configurando chaves estrangeiras com `@JoinColumn`
- Exercício: usando `@JoinColumn`
- Detalhes de `@JoinTable`
- Configurando tabelas secundárias com `@SecondaryTable`
- Estratégias de Schema Generation
- Gerando schema com arquivos SQL
- Gerando schema com metadados e scripts
- Exportando scripts para arquivos externos
- Configurando propriedades da unidade de persistência dinamicamente

### Operações em Cascata
- Configurando operações em cascata
- Fazendo inserções em cascata
- Exercício: inserções em cascata
- Fazendo atualizações em cascata
- Exercício: atualizações em cascata
- Fazendo remoções em cascata
- Remoção em cascata com `@ManyToMany`
- Removendo objetos órfãos com `orphanRemoval`
- Quando configurar operações em cascata?

### JPQL (Java Persistence Query Language)
- Introdução à JPQL
- TypedQuery vs Query
- Selecionando atributos específicos
- Trabalhando com projeções
- Projeções e DTO
- Inner Join
- Left Outer Join
- Join com Fetch
- Path Expressions
- Exercício: pedidos com produto específico
- Parâmetros nas consultas
- Expressões condicionais (`like`, `is null`, `is empty`, `between`, `>`, `<`)
- Operadores lógicos
- Ordenação
- Paginação e Limitação
- Funções para Strings, Datas, Números e Coleções
- Funções nativas e agregação
- Agrupamento com `group by` e `having`
- Expressões `case` e `in`
- Uso de `distinct`
- Subqueries (`in`, `exists`, `all`, `any`)
- Exercícios práticos
- Operações em lote (update e delete)
- Queries dinâmicas
- Queries nomeadas com `@NamedQuery`
- Externalizando queries para XML
- Abordagem híbrida entre dynamic e named queries

### Criteria API
- Introdução à Criteria API
- Seleções e Projeções
- Uso de Tuple e DTO
- Inner Join, Left Join e Fetch Join
- Cláusula `on` nos Joins
- Consultas parametrizadas
- Tipagem forte com Metamodel
- Expressões condicionais e lógicas
- Ordenação e paginação
- Funções (string, datas, números, coleções e nativas)
- Agrupamento, having e distinct
- Expressões `case` e `in`
- Subqueries (`in`, `exists`, `all`, `any`)
- Operações em lote
- Exercícios práticos

### Consultas Nativas
- Por que usar queries nativas?
- SQL com retorno de arrays e entidades
- Parâmetros em queries nativas
- Mapeando resultados com `@SqlResultSetMapping`
- NamedNativeQuery
- Consultas no arquivo XML
- Exercício: mapeando para DTO
- Uso de Stored Procedures (parâmetros, listas, updates)
- NamedStoredProcedureQuery
- Invocando views do banco

### Bean Validation, Pool de Conexões, Entity Graph
- Bean Validation
- Exercício: validando objetos
- Pool de conexões (HikariCP)
- Buscando conexões via JNDI
- Conversores de atributos
- Problemas de `@OneToOne` com Lazy no Hibernate
- Entity Graph e Subgraph
- Metamodel com Entity Graph
- NamedEntityGraph
- Solução do problema N+1

### Second Level Cache
- Cache de segundo nível
- Incluindo e removendo entidades do cache
- Modos de cache (`@Cacheable`)
- Controle dinâmico do cache
- Configurando EhCache

### Concorrência e Locking
- Conceitos de concorrência
- Lock Otimista com `@Version`
- Lock Pessimista (`PESSIMISTIC_READ`, `PESSIMISTIC_WRITE`)
- Mistura de locks
- Lock com JPQL e Criteria API

### Multitenancy
- O que é Multitenancy e tipos de abordagem
- Organização dos testes
- Implementando Multitenancy por:
  - Schema
  - Máquina
  - Coluna em aplicação web

### PostgreSQL e EclipseLink
- Instalação do PostgreSQL
- Configuração com JPA
- Uso do EclipseLink como implementação JPA

### JPA em Aplicações Web
- Aplicação JPA em projetos web
- Integração com Spring MVC
- Integração com KumuluzEE
- Transações `RESOURCE_LOCAL` vs `JTA`
- Publicando no JBoss Wildfly
- Conclusão do curso e próximos passos

---

## Sobre o Curso
Este é um curso completo, do básico ao avançado, para quem deseja dominar **JPA**, **Hibernate**, **Consultas Avançadas**, **Criteria API**, **Cache**, **Multitenancy** e muito mais, aplicando tudo em projetos web profissionais.

---
