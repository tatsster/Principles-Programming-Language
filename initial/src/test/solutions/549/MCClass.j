.source MCClass.java
.class public MCClass
.super java.lang.Object

.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String; from Label0 to Label1
Label0:
	ldc "553"
	invokestatic MCClass/foo(Ljava/lang/String;)Ljava/lang/String;
	invokestatic io/putString(Ljava/lang/String;)V
Label1:
	return
.limit stack 1
.limit locals 1
.end method

.method public static foo(Ljava/lang/String;)Ljava/lang/String;
.var 0 is a Ljava/lang/String; from Label0 to Label1
Label0:
	aload_0
	areturn
Label1:
.limit stack 1
.limit locals 1
.end method

.method public <init>()V
.var 0 is this LMCClass; from Label0 to Label1
Label0:
	aload_0
	invokespecial java/lang/Object/<init>()V
Label1:
	return
.limit stack 1
.limit locals 1
.end method