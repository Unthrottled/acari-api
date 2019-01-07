#!/usr/bin/env bash
sudo openssl genrsa -des3 -out privkey.pem 1024

sudo openssl req -new -key privkey.pem -out server.csr

sudo cp privkey.pem privkey.pem.org

sudo openssl rsa -in privkey.pem.org -out privkey.pem

sudo openssl x509 -req -days 365 -in server.csr -signkey privkey.pem -out fullchain.pem
