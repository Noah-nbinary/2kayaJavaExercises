# Java Exercises - Git Workflow

## 1. Clone the repository

Clone the project to your computer:

```bash
git clone https://github.com/Noah-nbinary/2kayaJavaExercises.git
```

This downloads the repository to your machine.

Then enter the project folder:

```bash
cd REPO_NAME
```

---

# 2. Create your branch

Each developer should work on their own branch.

Create a branch and switch to it:

```bash
git checkout -b feature/your-name
```

Example:

```bash
git checkout -b feature/alex
```

This command:
- Creates a new branch
- Switches to that branch

---

# 3. Make your changes

Work on the exercises and save your files.

---

# 4. Stage your changes

Tell Git which files you want to include in the commit:

```bash
git add .
```

`.` means **all modified files**.

---

# 5. Commit your changes

Create a commit (a saved version of your work):

```bash
git commit -m "Solve exercise 1"
```

---

# 6. Push your branch to GitHub

Upload your branch to GitHub:

```bash
git push origin feature/your-name
```

Example:

```bash
git push origin feature/alex
```

This will create the branch on GitHub.

---

# Basic Commands Summary

| Command | What it does |
|------|------|
| `git clone` | Downloads the repository |
| `git checkout -b branch` | Creates and switches to a new branch |
| `git add .` | Adds changes to the next commit |
| `git commit -m "message"` | Saves your changes |
| `git push origin branch` | Uploads your branch to GitHub |