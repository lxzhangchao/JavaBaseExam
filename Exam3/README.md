#  ����Exam3
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

#ִ����Ŀ
cd Exam3

mvn exec:java -Dexec.mainClass="com.hand.RamNumber"

