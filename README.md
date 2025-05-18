
# 🧊 Fridge API - Controle de Alimentos

Este é um projeto simples feito em **Java com Spring Boot**, com o objetivo de **cadastrar, listar e excluir alimentos** da sua "geladeira digital". Utiliza um banco de dados em memória (**H2**) para facilitar o desenvolvimento e testes.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## 📁 Estrutura do Projeto

```
src/
├── controller        # Endpoints REST
├── services          # Regras de negócio
├── models            # Entidades do banco
└── repository        # Interface JPA
```

---

## 🔧 Funcionalidades

- ✅ **GET /food** – Lista todos os alimentos
- ✅ **POST /food** – Cadastra um novo alimento
- 🛠️ **DELETE /food?id=1** – (Pode ser adicionado em breve)

---

## 📦 Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/fridge-api.git
   ```

2. Navegue até o projeto:
   ```bash
   cd fridge-api
   ```

3. Rode com Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse o H2 Console (opcional):
   ```
   http://localhost:8080/h2-console
   ```

   Use os dados:
   - JDBC URL: `jdbc:h2:mem:testdb`
