# Getting Started

### Build Database

run `docker pull mysql:latest`

then `docker run --name mysql-db-1 -v D:/Docker/mysql/db1:/etc/mysql/conf.d -v D:/Docker/mysql/mysql-latest/data:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest`


docker pull mysql:latest
docker run --name mysql-db-1 -v D:/Docker/mysql/db-1/data:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest

docker run --name mysql-db-1 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest


