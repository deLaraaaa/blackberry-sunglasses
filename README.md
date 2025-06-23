# Inventory Management System

A simple inventory management system built with Spring Boot that allows users to manage products and categories.

## Project Information / Informações do Projeto

### Integrantes
- **Desenvolvedor**: Leonardo, Matheus Sady, Rafael de Lara e Rafael Venturi 

### Projeto
**Sistema de Gerenciamento de Estoque (Blackberry Sunglasses)**

### Objetivo
Desenvolver um sistema web simples para gerenciamento de estoque que permite controlar produtos e categorias com foco no aprendizado, oferecendo uma interface intuitiva para operações CRUD (Create, Read, Update, Delete).

### Principais requisitos e/ou casos de uso implementados

#### Gestão de Produtos:
- **Listar produtos** - Visualização de todos os produtos em tabela
- **Cadastrar produto** - Formulário para adicionar novos produtos
- **Editar produto** - Modificação de dados existentes
- **Excluir produto** - Remoção com confirmação via modal
- **Associação com categorias** - Produtos vinculados a categorias

#### Gestão de Categorias:
- **Listar categorias** - Visualização de todas as categorias
- **Cadastrar categoria** - Formulário para adicionar novas categorias
- **Editar categoria** - Modificação de dados existentes
- **Excluir categoria** - Remoção com confirmação via modal
- **Contagem de produtos** - Exibição da quantidade de produtos por categoria

#### Funcionalidades Técnicas:
- **Interface responsiva** - Design adaptável com Material Design
- **Validação de dados** - Tratamento de erros e validações
- **Navegação intuitiva** - Links entre produtos e categorias
- **Persistência de dados** - Banco H2 com JPA

### Principais classes e telas e seu funcionamento

#### Classes Principais:

**Entidades (Entity):**
- **`Product.java`**: Representa um produto com atributos: id, nome, quantidade, preço e categoria
- **`Category.java`**: Representa uma categoria com id, nome e lista de produtos associados

**Controladores (Controller):**
- **`ProductController.java`**: Gerencia todas as operações HTTP relacionadas a produtos
  - `GET /produtos` - Lista todos os produtos
  - `GET /produtos/novo` - Exibe formulário de cadastro
  - `POST /produtos` - Salva novo produto
  - `GET /produtos/{id}/editar` - Exibe formulário de edição
  - `POST /produtos/{id}` - Atualiza produto existente
  - `POST /produtos/{id}/excluir` - Remove produto

- **`CategoryController.java`**: Gerencia operações HTTP relacionadas a categorias
  - `GET /categorias` - Lista todas as categorias
  - `GET /categorias/nova` - Exibe formulário de cadastro
  - `POST /categorias` - Salva nova categoria
  - `GET /categorias/{id}/editar` - Exibe formulário de edição
  - `POST /categorias/{id}` - Atualiza categoria existente
  - `POST /categorias/{id}/excluir` - Remove categoria

**Repositórios (Repository):**
- **`ProductRepository.java`**: Interface para operações de banco com produtos
- **`CategoryRepository.java`**: Interface para operações de banco com categorias

#### Telas e Funcionamento:

**1. Lista de Produtos (`produtos.html`):**
- **Funcionalidade**: Exibe tabela com todos os produtos cadastrados
- **Campos**: ID, Nome, Preço, Quantidade, Ações
- **Ações**: Botões para Editar e Excluir cada produto
- **Navegação**: Link para "Adicionar Produto" e "Gerenciar Categorias"
- **Modal**: Confirmação antes de excluir produtos

**2. Formulário de Produto (`produto-form.html`):**
- **Funcionalidade**: Formulário para cadastrar/editar produtos
- **Campos**: Nome, Preço, Quantidade, Categoria (dropdown)
- **Validação**: Campos obrigatórios e formatação de preço
- **Comportamento**: Reutilizado para criar e editar

**3. Lista de Categorias (`categorias.html`):**
- **Funcionalidade**: Exibe tabela com todas as categorias
- **Campos**: ID, Nome, Quantidade de Produtos, Ações
- **Ações**: Botões para Editar e Excluir cada categoria
- **Navegação**: Link para "Adicionar Categoria" e "Gerenciar Produtos"
- **Modal**: Confirmação antes de excluir categorias

**4. Formulário de Categoria (`categoria-form.html`):**
- **Funcionalidade**: Formulário para cadastrar/editar categorias
- **Campos**: Nome da categoria
- **Validação**: Campo obrigatório
- **Comportamento**: Reutilizado para criar e editar

### Observações (Orientações de como rodar o sistema)

#### Pré-requisitos:
- Java 21 ou superior
- Maven 3.6+ (ou usar o wrapper incluído)

#### Como executar:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/deLaraaaa/blackberry-sunglasses
   cd blackberry-sunglasses
   ```

2. **Execute com Maven:**
   ```bash
   # Linux/Mac:
   ./mvnw spring-boot:run
   
   # Windows:
   mvnw.cmd spring-boot:run
   
   # Ou com Maven instalado:
   mvn spring-boot:run
   ```

3. **Acesse a aplicação:**
   - URL principal: http://localhost:8081
   - Lista de produtos: http://localhost:8081/produtos
   - Lista de categorias: http://localhost:8081/categorias
   - Console H2: http://localhost:8081/h2-console

#### Configuração do Banco:
- **Tipo**: H2 (banco em memória)
- **URL**: `jdbc:h2:mem:estoque_db`
- **Usuário**: `sa`
- **Senha**: (deixar vazio)

## License

This project is licensed under the MIT License.