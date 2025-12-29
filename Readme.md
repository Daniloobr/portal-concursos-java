# 🎓 Portal Concursos - Sistema de Registro de Aprovados (NEW VERSION 0.0.5)

Este projeto é uma aplicação Fullstack robusta, desenvolvida para uma entrevista tecnica que pedia o registro e a visualização de candidatos aprovados em concursos públicos. O objetivo principal foi unir a eficiência do ecossistema **Java Spring Boot** com uma interface de alta fidelidade visual e ótima experiência de usuário.

O projeto foi construído do zero, desde a arquitetura do banco de dados até a estilização manual com CSS moderno.

---

## ✨ Funcionalidades
* **Gestão de Cadastros:** Registro completo com Nome, E-mail, Telefone e Concursos.
* **Upload de Imagem:** Suporte para envio de fotos dos aprovados com armazenamento em diretório estático.
* **Interface Premium:** Design responsivo utilizando CSS3, com feedbacks visuais de foco e mensagens de sucesso.
* **Persistência de Dados:** Integração total com Spring Data JPA e banco de dados H2.

---

## 🚀 Como Executar o Projeto

1.  **Pré-requisitos:**
    * Ter o **JDK 17** ou superior instalado.
    * Navegador web moderno (Chrome, Firefox, Edge).

2.  **Execução:** No terminal, dentro da pasta raiz do projeto, execute:
    ```bash
    mvnw.cmd spring-boot:run
    ```

3.  **Acesso:** Abra o seu navegador e acesse o endereço:
    `http://localhost:8080/cadastro`

---

## 🛠️ Tecnologias Utilizadas
* **Backend:** Java 17 com Spring Boot 3.
* **Frontend:** HTML5, CSS3 (Advanced Selectors, Flexbox, Transitions) e Thymeleaf.
* **Banco de Dados:** H2 Database (Banco de dados em memória para testes rápidos).
* **Gerenciador de Dependências:** Maven.

---

## 📊 Visualização do Banco (H2 Console)
Para auditar os registros salvos em tempo real sem precisar de ferramentas externas:
* **URL:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **Usuário:** `sa` 
* **Senha:** (deixar em branco)

---

## 🎨 Destaques de Desenvolvimento (Foco em CSS & Java)
Nesta versão, foquei em aplicar conceitos modernos de desenvolvimento:
* **UX/UI Design:** Implementação de pseudo-classes `:focus` e `:hover` para tornar o formulário interativo.
* **Clean Code:** Estrutura de pacotes seguindo o padrão MVC (Model-View-Controller).
* **Responsividade:** Layout adaptável para dispositivos móveis e desktops.

---
## 👨‍💻 Sobre o Desenvolvedor

Projeto desenvolvido por **Danilo**

---
