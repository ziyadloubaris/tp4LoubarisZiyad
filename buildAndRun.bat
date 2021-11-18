@echo off
call mvn clean package
call docker build -t com.loubarisZiyad/tp4LoubarisZiyad .
call docker rm -f tp4LoubarisZiyad
call docker run -d -p 9080:9080 -p 9443:9443 --name tp4LoubarisZiyad com.loubarisZiyad/tp4LoubarisZiyad