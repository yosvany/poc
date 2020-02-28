#!/bin/bash



for p in admin-server app1 config-server eureka-server webflux-app; do gradle -p  ./$p clean assemble;  done

docker-compose up -d --build

