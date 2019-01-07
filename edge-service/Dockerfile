FROM nginx:1.14
MAINTAINER Alex Simons "alexsimons9999@gmail.com"

copy errors/ /usr/share/nginx/html/errors

COPY certs/fullchain.pem /etc/nginx/ssl/fullchain.pem
COPY certs/privkey.pem /etc/nginx/ssl/privkey.pem