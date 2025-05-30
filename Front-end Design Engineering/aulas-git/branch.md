### 1️⃣ **Mudar para outra branch**

```bash

git switch nome-da-branch       # recomendado, claro e seguro
git checkout nome-da-branch     # funciona, mas é mais geral/confuso

2️⃣ Criar e mudar para nova branch

git switch -c nova-branch       # recomendado
git checkout -b nova-branch     # funciona, mas é mais antigo

3️⃣ Voltar para branch anterior

git switch -                  # funciona igual nos dois
git checkout -

4️⃣ Restaurar arquivos (descartar alterações locais em arquivo)

git checkout -- arquivo.txt    # só funciona com checkout!
Nota: git switch não restaura arquivos, serve só para branches.

5️⃣ Navegar para commit específico (detached HEAD)

git checkout abc1234           # usar checkout para isso
Nota: git switch não suporta isso.

Dica: para tarefas relacionadas a branches, prefira sempre git switch — é mais intuitivo e menos propenso a erros!

---