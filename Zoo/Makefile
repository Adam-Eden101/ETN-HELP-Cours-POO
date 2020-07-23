JC = javac

.SUFFIXES	:	.java .class
.java.class	:
				$(JC) $(JFLAGS) $*.java

CLASSES 	=	entities/Animal.java \
				entities/Carnivore.java \
				entities/Lion.java \
				App.java

default		:	classes

classes		:	$(CLASSES:.java=.class)

fclean		:
				$(RM) $(CLASSES:.java=.class)
