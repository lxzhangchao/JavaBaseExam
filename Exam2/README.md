#  创建Exam2
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

#执行项目
cd Exam2

mvn exec:java -Dexec.mainClass="com.hand.ShuiFei"

