# 📚 Sistema de Gestão de Biblioteca Acadêmica

<div align="center">

![Java](https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=java)
![Console](https://img.shields.io/badge/Interface-Console-blue?style=for-the-badge&logo=terminal)
![POO](https://img.shields.io/badge/Paradigma-POO-green?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Funcionando-success?style=for-the-badge)

*Um sistema completo para gerenciamento de biblioteca acadêmica desenvolvido em Java puro com interface de console, aplicando todos os conceitos fundamentais da Programação Orientada a Objetos.*

[📖 Características](#-características) • [🚀 Como Executar](#-como-executar) • [💻 Como Usar](#-como-usar) • [🏗️ Arquitetura](#️-arquitetura) • [📋 Funcionalidades](#-funcionalidades)

</div>

---

## 🎯 **Visão Geral**

Este projeto implementa um **sistema completo de gestão de biblioteca acadêmica** utilizando Java console, demonstrando na prática todos os conceitos essenciais da **Programação Orientada a Objetos (POO)**:

- ✅ **Encapsulamento** - Atributos privados com getters/setters
- ✅ **Herança** - Classes Aluno e Professor herdam de Usuario  
- ✅ **Polimorfismo** - Comportamentos diferentes para cada tipo de usuário
- ✅ **Abstração** - Classes abstratas e interfaces bem definidas
- ✅ **Collections** - HashMap e ArrayList para gerenciamento de dados

---

## 📸 **Preview do Sistema**

```
=== SISTEMA DE GESTÃO DA BIBLIOTECA ACADÊMICA ===
Bem-vindo ao sistema!

==================================================
MENU PRINCIPAL
==================================================
1. Gerenciar Livros
2. Gerenciar Usuários
3. Gerenciar Empréstimos
4. Relatórios
0. Sair
Escolha uma opção: 1

==============================
GERENCIAR LIVROS
==============================
1. Cadastrar Livro
2. Buscar Livro por ISBN
3. Buscar Livros por Título
4. Listar Livros Disponíveis
5. Listar Todos os Livros
0. Voltar
Escolha uma opção: 4

📚 Livros disponíveis:
ISBN: 978-8543004792 | Título: Java: Como Programar | Autor: Deitel | Editora: Pearson | Status: Disponível
ISBN: 978-0132350884 | Título: Clean Code | Autor: Robert Martin | Editora: Prentice Hall | Status: Disponível
```

---

## 🚀 **Como Executar**

### **📋 Pré-requisitos**
- ☕ **Java 8** ou superior instalado
- 🖥️ **Terminal/CMD** para execução
- 📝 **IDE** (opcional): IntelliJ IDEA, Eclipse, VS Code

### **⚡ Execução Rápida**

```bash
# 1. Clone o repositório
git clone https://github.com/DaviSales1308/SistemaBiblioteca.git
cd biblioteca-java

# 2. Compile o projeto
javac -d bin src/biblioteca/modelo/*.java src/biblioteca/servico/*.java src/biblioteca/interface_/*.java src/biblioteca/principal/*.java

# 3. Execute o sistema
java -cp bin principal.Main
```
---

## 🏗️ **Arquitetura do Projeto**

```
📁 biblioteca/
├── 📂 modelo/                    # 🎯 Entidades do domínio
│   ├── 📄 Livro.java            #    📚 Classe Livro
│   ├── 📄 Usuario.java          #    👤 Classe abstrata Usuario  
│   ├── 📄 Aluno.java            #    🎓 Herda de Usuario
│   ├── 📄 Professor.java        #    👨‍🏫 Herda de Usuario
│   └── 📄 Emprestimo.java       #    📋 Classe Emprestimo
├── 📂 servico/                   # 🔧 Lógica de negócio
│   └── 📄 SistemaBiblioteca.java #    🏛️ Gerenciador principal
├── 📂 interface_/                # 🖥️ Interface do usuário
│   └── 📄 InterfaceBiblioteca.java #  💬 Interface console
└── 📂 principal/                 # 🚀 Ponto de entrada
    └── 📄 Main.java             #    ▶️ Classe principal
```
---

## 📋 **Funcionalidades**

### **📚 Gestão de Livros**
- ➕ **Cadastrar livros** com ISBN, título, autor, editora e ano
- 🔍 **Buscar livros** por ISBN ou título
- 📊 **Listar livros** disponíveis ou todos os livros
- 📈 **Controle de disponibilidade** automático

### **👥 Gestão de Usuários**
- 👨‍🎓 **Cadastrar alunos** (limite: 3 livros, prazo: 7 dias)
- 👨‍🏫 **Cadastrar professores** (limite: 5 livros, prazo: 14 dias)  
- 📋 **Listar usuários** com informações detalhadas
- 🔒 **Validação** de matrícula única

### **📤 Sistema de Empréstimos**
- 📚 **Realizar empréstimos** múltiplos por usuário
- ⏰ **Controle automático** de datas e prazos
- 🚫 **Validação de limites** por tipo de usuário
- ✅ **Verificação de disponibilidade** dos livros

### **📥 Sistema de Devoluções**
- 🔄 **Devolução simples** por número do empréstimo
- ⚠️ **Detecção automática** de atrasos
- 📊 **Atualização** do status dos livros

### **📊 Relatórios e Consultas**
- 📈 **Estatísticas gerais** do sistema
- ⚠️ **Empréstimos atrasados** com alertas
- 👤 **Histórico por usuário** completo
- 📚 **Consultas personalizadas** de livros

---

## 💻 **Como Usar**

### **🎮 Navegação no Sistema**

1. **Inicie o programa** executando `java -cp bin principal.Main`
2. **Navegue pelos menus** digitando o número da opção desejada
3. **Siga as instruções** na tela para cada operação
4. **Use '0'** para voltar aos menus anteriores

### **📝 Exemplos de Uso**

#### **Cadastrar um Livro:**
```
Escolha uma opção: 1
--- CADASTRAR LIVRO ---
Título: Effective Java
Autor: Joshua Bloch
ISBN: 978-0134685991
Ano: 2018
Editora: Addison-Wesley
✅ Livro cadastrado com sucesso!
```

#### **Realizar um Empréstimo:**
```
Escolha uma opção: 1
--- REALIZAR EMPRÉSTIMO ---
Matrícula do usuário: 2023001
Quantos livros deseja emprestar? 2
ISBN do livro 1: 978-0134685991
ISBN do livro 2: 978-8543004792
✅ Empréstimo realizado com sucesso! Número: 1
```

### **🎯 Dados de Exemplo Pré-cadastrados**

O sistema já vem com dados de exemplo para facilitar os testes:

**📚 Livros:**
- **Java: Como Programar** (ISBN: 978-8543004792)
- **Clean Code** (ISBN: 978-0132350884)  
- **Design Patterns** (ISBN: 978-0201633610)
- **Estruturas de Dados** (ISBN: 978-8535236996)

**👥 Usuários:**
- **Aluno:** João Silva (Matrícula: 2023001)
- **Professor:** Dr. Maria Santos (Matrícula: PROF001)
- **Aluno:** Ana Costa (Matrícula: 2023002)

---

## 🏆 **Diferenciais do Projeto**

### **✨ Características Técnicas**
- 🎯 **Código limpo** e bem documentado
- 🔧 **Arquitetura organizada** em camadas
- 🚀 **Performance otimizada** com HashMap
- 📱 **Interface intuitiva** e user-friendly
- 🛡️ **Validação robusta** de dados
- 🔄 **Tratamento de erros** completo

### **🎓 Valor Educacional**
- 📚 **Demonstra POO** na prática
- 🏗️ **Arquitetura escalável** e profissional
- 💡 **Padrões de projeto** aplicados
- 🧪 **Código testável** e modular
- 📖 **Documentação completa** 

### **🚀 Potencial de Evolução**
- 🗄️ **Fácil migração** para banco de dados
- 🌐 **Base sólida** para interface web
- 📱 **Estrutura pronta** para mobile
- 🔐 **Preparado** para autenticação
- 📊 **Extensível** para novos relatórios

---

## 🤝 **Contribuição**

Contribuições são bem-vindas! Se você quiser melhorar o projeto:

1. 🍴 **Fork** o repositório
2. 🌿 **Crie uma branch** para sua feature (`git checkout -b feature/AmazingFeature`)
3. 💾 **Commit** suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. 📤 **Push** para a branch (`git push origin feature/AmazingFeature`)
5. 🔄 **Abra um Pull Request**

---

## 👨‍💻 **Autor**

Desenvolvido com ❤️ como projeto acadêmico para demonstração dos conceitos de **Programação Orientada a Objetos** em Java.

**📧 Contato:** [davi.armando@hotmail.com](mailto:davi.armando@hotmail.com)  
**🐙 GitHub:** [@DaviSales1308]([https://github.com/seu-usuario](https://github.com/DaviSales1308))  
**💼 LinkedIn:** [Davi Armando Lira Sales](https://linkedin.com/in/daavisales)

---
