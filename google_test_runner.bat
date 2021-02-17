echo "Welcome to batch Execution"
cd D:\Synechron_BDD_15_02\Eclipse_WS\actitime
d:
set path=%path%;D:\maven\apache-maven-3.6.1\bin
set classpath=D:\Synechron_BDD_15_02\Eclipse_WS\actitime\target\*;.
mvn test -Dcucumber.execution.dry-run=false -Dcucumber.filter.tags="@google"