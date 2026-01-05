# Guia (quase) completo de comandos Git — do zero ao avançado (com exemplos)

> **Real talk:** “todos os comandos do Git sem exceção” é tipo pedir “todas as ferramentas de uma oficina”.  
> O Git tem **muitos** subcomandos (inclui *plumbing* interno, comandos raros, e alguns variam por versão/instalação).  
> Então fiz o combo certo:
> 1) um guia **completo na prática** (do básico ao avançado) com o que você usa de verdade + o que resolve pepino;  
> 2) e o caminho pra ver **100% da lista** do seu Git: `git help -a` (isso sim é “sem exceção” no seu PC).

---

## Sumário
- [1) O que é Git vs GitHub (e o lance do “login”)](#1-o-que-é-git-vs-github-e-o-lance-do-login)
- [2) Instalação e checagem](#2-instalação-e-checagem)
- [3) Configuração inicial (nome/email/editor)](#3-configuração-inicial-nomeemaileditor)
- [4) “Login” no GitHub: HTTPS (token) e SSH](#4-login-no-github-https-token-e-ssh)
- [5) Começo do zero: criar repo, commit, push](#5-começo-do-zero-criar-repo-commit-push)
- [6) Fluxo do dia a dia](#6-fluxo-do-dia-a-dia)
- [7) Branches](#7-branches)
- [8) Merge, Rebase e Cherry-pick](#8-merge-rebase-e-cherry-pick)
- [9) Desfazer cagadas (restore/reset/revert/reflog)](#9-desfazer-cagadas-restoreresetrevertreflog)
- [10) Logs, diffs e inspeção](#10-logs-diffs-e-inspeção)
- [11) Stash](#11-stash)
- [12) Tags](#12-tags)
- [13) Remotes e sincronização](#13-remotes-e-sincronização)
- [14) Submodules e Worktrees](#14-submodules-e-worktrees)
- [15) Hooks](#15-hooks)
- [16) Conflitos](#16-conflitos)
- [17) Bisect/Blame](#17-bisectblame)
- [18) Manutenção (gc/fsck/clean)](#18-manutenção-gcfsckclean)
- [19) Plumbing (nível motor do Git)](#19-plumbing-nível-motor-do-git)
- [20) Como listar TODOS os comandos do seu Git](#20-como-listar-todos-os-comandos-do-seu-git)
- [21) Glossário rápido](#21-glossário-rápido)

---

## 1) O que é Git vs GitHub (e o lance do “login”)
- **Git** = versionamento **local**. Sem internet, sem conta, sem drama.
- **GitHub/GitLab/Bitbucket** = hospedagem + colaboração + interface bonitinha + PR + issues.
- O “login” de verdade rola quando você acessa um **remote** via:
  - **HTTPS**: você autentica com **token** (ou via Git Credential Manager no Windows).
  - **SSH**: você autentica com **chave** (jeito clássico, raiz, “como sempre foi” em muitos times).

**Exemplo real:**
- Você pode fazer `git init`, `git add`, `git commit` o dia todo sem “logar”.
- O Git só vai pedir credencial quando você fizer `git push`/`git pull`/`git fetch` num remote.

---

## 2) Instalação e checagem

### Versão
```bash
git --version
```
**O que faz:** mostra a versão instalada (isso importa porque alguns comandos/flags mudam).

**Exemplo:**
- Se seu Git for muito antigo, pode não ter `git switch` e `git restore`.

### Ajuda e manual
```bash
git help
git help <comando>
git <comando> --help
man git
```
**O que faz:**
- `git help`: mostra ajuda geral.
- `git help status`: abre manual do `status`.
- `--help` é a mesma vibe, só mais curto.
- `man git`: manual principal.

**Exemplo prático:**
- Travou num comando tipo `git rebase`? Faz:
  ```bash
  git help rebase
  ```
  e procura por “--continue”, “--abort”, “interactive”.

---

## 3) Configuração inicial (nome/email/editor)

### Identidade (aparece nos commits)
```bash
git config --global user.name "Seu Nome"
git config --global user.email "seuemail@dominio.com"
```
**O que faz:** define o nome/email do autor do commit.

**Exemplo:**
- Se você fizer commit sem configurar, o Git pode inventar com base no usuário da máquina, e aí fica feio no GitHub.

### Ver configs
```bash
git config --list
git config --global --list
git config --local --list
```
**O que faz:**
- `--global`: vale pra todos os repos do seu usuário.
- `--local`: vale só pro repo atual (fica em `.git/config`).

**Exemplo:**
- Você tem um repo do trampo e um pessoal, e quer email diferente:
  ```bash
  # no repo do trampo
  git config user.email "seu.email@empresa.com"
  ```

### Editor padrão
```bash
git config --global core.editor "code --wait"
```
**O que faz:** quando o Git abrir editor (rebase interativo, commit sem `-m`), ele usa esse.

**Exemplo:**
- Você roda `git commit` e esquece a mensagem. Ele abre o VS Code pra você digitar e salvar.

### Branch padrão
```bash
git config --global init.defaultBranch main
```
**O que faz:** define o nome padrão ao fazer `git init`.

**Tradição vs hoje:**
- Antigamente era `master` por padrão. Hoje muita gente usa `main`. Ambos funcionam.

### Aliases (atalhos)
```bash
git config --global alias.st status
git config --global alias.lg "log --oneline --decorate --graph --all"
```
**O que faz:** cria comandos curtos: `git st` vira `git status`, `git lg` vira log bonitão.

**Exemplo:**
```bash
git lg
# te dá o grafo do histórico, show pra entender merges
```

---

## 4) “Login” no GitHub: HTTPS (token) e SSH

### 4.1 HTTPS (token)
**Como funciona:** você usa a URL HTTPS do repo e autentica com token (ou com o gerenciador de credenciais).

Cache/gerenciador (Windows):
```bash
git config --global credential.helper manager
```

Ver / trocar remote:
```bash
git remote -v
git remote set-url origin https://github.com/USER/REPO.git
```

**Exemplo do dia a dia:**
- Você roda:
  ```bash
  git push
  ```
  Ele pede usuário/senha. A “senha” é o **token**. Depois o manager salva e não enche mais.

**Dica de velho sábio:** token com permissão mínima. Nada de dar “admin” à toa.

### 4.2 SSH (clássico, “modo raiz”)
Gerar chave:
```bash
ssh-keygen -t ed25519 -C "seuemail@dominio.com"
```
**O que faz:** cria um par de chaves (privada + pública). A pública você cadastra no GitHub.

Adicionar no agente:
```bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_ed25519
```
**O que faz:** deixa a chave “carregada” na sessão, pra não ficar digitando senha toda hora.

Testar:
```bash
ssh -T git@github.com
```

Trocar remote:
```bash
git remote set-url origin git@github.com:USER/REPO.git
```

**Exemplo prático:**
- Depois que o SSH tá certo, `git push` vira só “vai”, sem pedir credencial.

---

## 5) Começo do zero: criar repo, commit, push

### Criar repo e fazer o primeiro commit
```bash
git init
git status
git add .
git commit -m "feat: primeiro commit"
```
**O que faz:**
- `init`: cria `.git` (o “cérebro” do repo).
- `status`: mostra o que tá modificado, o que tá staged, etc.
- `add .`: coloca tudo em **staging**.
- `commit`: salva o snapshot no histórico.

**Exemplo real:**
- Você criou `README.md` e `src/app.py`.
- `git status` mostra ambos como “untracked”.
- `git add .` coloca ambos pra commit.
- `git commit -m "...":` fecha o primeiro ponto do histórico.

### Conectar no GitHub e enviar
```bash
git remote add origin <URL_DO_REPO>
git branch -M main
git push -u origin main
```
**O que faz:**
- `remote add`: cria o “apelido” `origin` pro seu repo remoto.
- `branch -M main`: renomeia a branch atual pra `main` (forçando se precisar).
- `push -u`: envia e cria tracking (depois vira só `git push`).

**Exemplo clássico de erro:**
- Se o remote já tem commits (README criado no GitHub), pode dar “rejected (fetch first)”.
- Aí o caminho é `git pull --rebase` antes.

---

## 6) Fluxo do dia a dia

### Ver o que mudou
```bash
git status
git diff
git diff --staged
```
**O que faz:**
- `diff`: mostra mudanças **ainda não staged**.
- `diff --staged`: mostra o que já está preparado pro commit.

**Exemplo:**
- Você editou `app.py` e já deu `git add app.py`.
- `git diff` talvez fique vazio (porque já foi staged).
- `git diff --staged` mostra exatamente o que vai no commit.

### Atualizar seu código
```bash
git fetch
git pull
git pull --rebase
```
**O que faz:**
- `fetch`: baixa novidades do remote, sem mexer na sua branch.
- `pull`: `fetch + merge` (por padrão).
- `pull --rebase`: `fetch + rebase` (histórico mais “reto”).

**Exemplo:**
- Você quer só “ver” o que chegou:
  ```bash
  git fetch
  git log --oneline --decorate --graph --all
  ```
- Você quer atualizar sua branch agora:
  ```bash
  git pull --rebase
  ```

### Subir commits
```bash
git push
```
**O que faz:** envia commits da sua branch local pro remote.

**Exemplo:**
- Você fez 3 commits locais e quer subir. `git push` manda os 3.

---

## 7) Branches

Listar:
```bash
git branch
git branch -a
git branch -vv
```
**O que faz:**
- `branch`: lista branches locais.
- `-a`: inclui remotas.
- `-vv`: mostra tracking (qual remote branch você segue) e último commit.

Criar/trocar:
```bash
git switch -c feature/login
git switch main
```

Jeito antigo (ainda funciona):
```bash
git checkout -b feature/login
git checkout main
```

Renomear:
```bash
git branch -m novo-nome
```

Apagar:
```bash
git branch -d feature/login
git branch -D feature/login
git push origin --delete feature/login
```

---

## 8) Merge, Rebase e Cherry-pick

Merge:
```bash
git switch main
git merge feature/login
git merge --no-ff feature/login
```

Rebase:
```bash
git switch feature/login
git rebase main
git rebase -i HEAD~5
```

Forçar push com segurança:
```bash
git push --force-with-lease
```

Cherry-pick:
```bash
git cherry-pick <hash>
```

---

## 9) Desfazer cagadas (restore/reset/revert/reflog)

Restore:
```bash
git restore --staged arquivo.txt
git restore arquivo.txt
```

Reset:
```bash
git reset --soft HEAD~1
git reset --mixed HEAD~1
git reset --hard HEAD~1
```

Revert:
```bash
git revert <hash>
git revert -m 1 <hash_do_merge>
```

Reflog:
```bash
git reflog
git reset --hard HEAD@{3}
```

---

## 10) Logs, diffs e inspeção
```bash
git log
git log --oneline --decorate --graph --all
git log --stat
git log -p
git show <hash>
git blame arquivo.txt
git grep "texto"
```

---

## 11) Stash
```bash
git stash
git stash push -m "wip: mexendo no login"
git stash list
git stash apply stash@{0}
git stash pop
git stash drop stash@{0}
git stash clear
git stash -p
```

---

## 12) Tags
```bash
git tag v1.0.0
git tag -a v1.0.0 -m "Release v1.0.0"
git tag
git push origin v1.0.0
git push origin --tags
git tag -d v1.0.0
git push origin --delete tag v1.0.0
```

---

## 13) Remotes e sincronização
```bash
git remote -v
git remote show origin
git remote add upstream <URL>
git remote remove upstream
git fetch --all --prune
git pull --rebase
git push -u origin minha-branch
```

---

## 14) Submodules e Worktrees
Submodule:
```bash
git submodule add <URL> caminho/pasta
git clone --recurse-submodules <URL>
git submodule update --init --recursive
git submodule update --remote
```

Worktree:
```bash
git worktree add ../pasta-feature feature/login
git worktree list
git worktree remove ../pasta-feature
```

---

## 15) Hooks
Ver:
```bash
ls .git/hooks
```

---

## 16) Conflitos
```bash
git status
git add arquivo_conflitado
git commit
git rebase --continue
git rebase --abort
git merge --abort
git mergetool
git difftool
```

---

## 17) Bisect/Blame
Bisect:
```bash
git bisect start
git bisect bad
git bisect good <hash_que_funcionava>
git bisect good
git bisect bad
git bisect reset
```

Blame:
```bash
git blame arquivo.txt
git blame -L 10,40 arquivo.txt
```

---

## 18) Manutenção (gc/fsck/clean)
```bash
git gc
git gc --aggressive
git fsck
git remote prune origin
git fetch --prune
git clean -n
git clean -fd
git clean -xfd
```

---

## 19) Plumbing (nível motor do Git)
```bash
git hash-object -w arquivo.txt
git cat-file -t <hash>
git cat-file -p <hash>
git ls-tree <hash_do_commit>
git ls-tree -r <hash_do_commit>
git show-ref
git for-each-ref
git rev-parse HEAD
git rev-list --all --count
git ls-files -s
git write-tree
git read-tree <tree_hash>
git commit-tree <tree_hash> -p <parent_hash> -m "msg"
git repack
git prune
git pack-objects
git unpack-objects
```

---

## 20) Como listar TODOS os comandos do seu Git
```bash
git help -a
git help -g
man git
man gitglossary
git config --get-regexp alias
```

---

## 21) Glossário rápido
- **Working tree**: seus arquivos na pasta.
- **Staging/Index**: o “preparo” do commit.
- **Commit**: snapshot + ponteiro pro parent.
- **HEAD**: referência atual.
- **Fast-forward**: merge sem commit extra.
- **Detached HEAD**: checkout em commit direto.

---

## Cola de sobrevivência
```bash
git status
git add .
git commit -m "msg"
git pull --rebase
git push

git switch -c feature/x
git merge feature/x
git rebase -i HEAD~5

git restore --staged .
git restore .
git reset --soft HEAD~1
git revert <hash>
git reflog
```
