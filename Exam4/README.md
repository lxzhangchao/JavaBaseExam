#  ����Exam4
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam4 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

#ִ����Ŀ
cd Exam4

mvn exec:java -Dexec.mainClass="com.hand.RamNumber"

