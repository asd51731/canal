#!/bin/bash

sh run.sh -e canal.auto.scan=false \
    -e canal.destinations=test \
    -e canal.instance.master.address=rm-bp1r3f0nqt0v6w4o7.mysql.rds.aliyuncs.com:3306 \
    -e canal.instance.dbUsername=soul \
    -e canal.instance.dbPassword=Soul2016GGHA \
    -e canal.instance.connectionCharset=UTF-8 \
    -e canal.instance.tsdb.enable=true \
    -e canal.instance.gtidon=false \
    -e canal.instance.filter.regex=.*\\..* \
    -e canal.serverMode=kafka \
    -e kafka.bootstrap.servers=172.16.32.22:9092,172.16.32.23:9092 \
    -e canal.mq.topic=rm-bp1r3f0nqt0v6w4o7
