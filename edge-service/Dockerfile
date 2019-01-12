FROM nginx:1.14
MAINTAINER Alex Simons "alexsimons9999@gmail.com"

COPY errors/ /usr/share/nginx/html/errors
COPY nginx.conf /etc/nginx/nginx.conf
COPY certs/fullchain.pem /etc/nginx/ssl/fullchain.pem
COPY certs/privkey.pem /etc/nginx/ssl/privkey.pem