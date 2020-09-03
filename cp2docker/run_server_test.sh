#!/bin/bash

sh run.sh -e canal.auto.scan=false \
		  -e canal.destinations=test \
		  -e canal.instance.master.address=172.16.78.251:3308 \
          -e canal.instance.dbUsername=root \
          -e canal.instance.dbPassword=DhhdQfMrDHPvIdSnTXOSwA \
          -e canal.instance.connectionCharset=UTF-8 \
          -e canal.instance.tsdb.enable=true \
          -e canal.instance.gtidon=false \
          -e canal.instance.filter.regex=.*\\..*