test:	MarkdownParseTest.class	MarkdownParse.class
	software/CSE/oracle-java-se-14/jdk-14.0.2/bin/java MarkdownParseTest

MarkdownParse.class:	MarkdownParse.java
	/software/CSE/oracle-java-se-14/jdk-14.0.2/bin/javac MarkdownParse.java

MarkdownParseTest.class:	MarkdownParseTest.java	MarkdownParse.class
	/software/CSE/oracle-java-se-14/jdk-14.0.2/bin/javac MarkdownParseTest.java

clean:
	rm -rf *class