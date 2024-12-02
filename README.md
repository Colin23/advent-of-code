# Advent of Code
## Reminder for myself
### Cloning and initializing
You can set up the repository in one of two ways
1. Clone the solution repository with the private inputs submodule
    ```shell
    git clone --recursive git@github.com:Colin23/advent-of-code.git
    ```
2. Clone the solution repository first, then initialize the private inputs submodule
    ```shell
    git clone git@github.com:Colin23/advent-of-code.git
    cd advent-of-code
    git submodule init
    git submodule update
    ```
### Working with the repos
#### Adding new inputs
1. Navigate to the inputs directory (the private submodule)
   ```shell
   cd inputs
   ```
2. Add the new input files (e.g., 2024/day1/input.txt), then commit and push to the private inputs repository
   ```shell
   git add .
   git commit -m "Add inputs for 2024 Day 1"
   git push
   ```
3. Navigate back to the main solutions repository
   ```shell
   cd ..
   ```
4. Commit and push the updated submodule reference to the solutions repository
   ```shell
   git add inputs
   git commit -m "Update submodule to include new inputs"
   git push
   ```

Note: Step 4 is necessary to ensure the solutions repository references the latest commit of the private inputs repository.
