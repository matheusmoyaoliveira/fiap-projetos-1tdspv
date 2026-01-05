# 📘 Guia Prático: Como Criar Submódulo Git no GitHub

## 📌 O que é um Submódulo?

Um **submódulo** é um repositório Git dentro de outro repositório Git. Ele é ideal para separar partes privadas ou reutilizáveis de um projeto maior, mantendo um vínculo claro e seguro.

## ✅ Etapas para Adicionar um Submódulo Corretamente

1. **Crie o repositório do submódulo no GitHub** (público ou privado).

2. **Clone ou entre no repositório principal local:**
   ```bash
   cd caminho/do/repositorio-principal
   ```

3. **Limpe qualquer rastro anterior do submódulo (se necessário):**
   ```bash
   rm -rf .git/modules/nome-da-pasta-submodulo
   rm -rf nome-da-pasta-submodulo
   ```

4. **Adicione o submódulo no caminho desejado:**
   ```bash
   git submodule add https://github.com/usuario/repositorio-submodulo.git caminho/para/submodulo
   ```
   Exemplo:
   ```bash
   git submodule add https://github.com/matheusmoyaoliveira/ai-sprint-privado.git "Artificial Intelligence & Chatbot/ai-sprint-privado"
   ```

5. **Faça o commit da adição:**
   ```bash
   git add .gitmodules caminho/para/submodulo
   git commit -m "Adiciona submódulo corretamente"
   git push origin main
   ```

6. **Para clonar o projeto com submódulos:**
   ```bash
   git clone https://github.com/usuario/repositorio-principal.git
   cd repositorio-principal
   git submodule update --init --recursive
   ```

## ⚠️ Erros Comuns e Soluções

- **Pasta já existe como repositório local:**
  ```bash
  git submodule add --force ...
  ```

- **Submódulo aparece como pasta comum (não protegido):**
  ```bash
  git rm -r --cached caminho
  git commit -m "Remove submódulo incorreto"
  git push origin main
  ```

- **Não consegue apagar da árvore do Git:**
  ```bash
  git rm -r --cached caminho
  git commit
  git push
  ```
