############################################
# This is a project standard makefile..
############################################
JAVAC = javac
JAVA = java

###########################################
# FLAGs
###########################################
OUTDIR = out
JFLAGS = -g
JDPATH = -d $(OUTDIR)

JCPATH = -classpath $(OUTDIR):./lib/*

###########################################
# Compile
###########################################
.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $(JCPATH) $(JDPATH) $*.java

###########################################
# SOURCE TREE macro
###########################################
JAVA_SOURCE = \
	./LedControl.java \

###########################################
# BUILD
###########################################
default: classes
classes: $(JAVA_SOURCE:.java=.class)

###########################################
# Util
# RM is a predefined macro in make (RM = rm -f)
###########################################
clean:
	$(RM) *.class
    
run:
	$(JAVA) $(JCPATH) LedControl
