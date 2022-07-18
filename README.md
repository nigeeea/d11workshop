# Workshop 11 Instruction

### Maven commands
1. mvnw
2. mvnw compile
3. mvnw package
4. mvnw clean package
5. mvnw clean
6. mvnw clean package spring-boot:run
7. mvnw spring-boot:run
8. mvnw spring-boot:run -Dspring-boot

## Git commands
git init

git remote add origin https://github.com/<username>/<projectname>.git

git add *

git status

git commit -m "insert message here"

git push -u origin master

git pull

git branch 

git branch -a

git branch -delete <branch name>

git checkout -b develop master

git add * (add to develop branch)

git commit -m "add readme file" (add to develop branch)

git push -u origin develop (push to remote git develop branch)

git checkout master

git merge develop (merge changes done in develop branc into the master branch)

git push -u origin master

// make changes in master, and need to synchronise this change to develop branch 
// assume hchanges has already been made into the master branch

git checkout develop

git merge master (merge changes in master branch into the develop branch)

git push -u origin master