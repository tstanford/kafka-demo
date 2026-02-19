#!/bin/bash

for i in {1..4}
do
    konsole -e mvn spring-boot:run &
done
