#!/bin/sh
mvn clean package && docker build -t com.loubarisZiyad/tp4LoubarisZiyad .
docker rm -f tp4LoubarisZiyad || true && docker run -d -p 9080:9080 -p 9443:9443 --name tp4LoubarisZiyad com.loubarisZiyad/tp4LoubarisZiyad