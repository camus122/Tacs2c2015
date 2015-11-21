CALL mvn clean install -f multi-module-pom.xml -o -Dmaven.test.skip
CALL mvn appengine:devserver