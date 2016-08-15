#  创建Exam4
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam4 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

#执行项目
cd Exam4

mvn exec:java -Dexec.mainClass="com.hand.RamNumber"

