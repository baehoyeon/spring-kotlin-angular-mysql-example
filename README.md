# Spring Kotlin Angular Practice Project
This project based on kotlin, spring-boot, mysql, angular


## install
### mysql
[mysql website](https://dev.mysql.com/downloads/mysql/)

### SCHEMA
```
$ mysql -uroot -p
CREATE SCHEMA `springkotlinangular` DEFAULT CHARACTER SET utf8 ;

```

## Usage
## 1. Server
### run
```
./gradlew bootRun
```

### open
```
http://localhost:19050/
```

## 2. Client
Generated by angular-cli
[angular-cli](https://cli.angular.io/)
### install
```
$ npm install -g @angular/cli
$ cd src/main/frontend
$ npm install
```
### run
```
$ cd src/main/frontend
## run dev server
$ ng serve
``` 

### open
```
http://localhost:4200/
```