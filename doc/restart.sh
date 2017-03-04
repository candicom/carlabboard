kill -9 `ps -ef | grep java | grep -v 'grep' | awk '{print $2}'`
nohup java -jar carlabboard-0.0.1-SNAPSHOT.war > /dev/null 2>&1 &