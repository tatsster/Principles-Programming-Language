.source MCClass.java
.class public MCClass
.super java.lang.Object

.method public static cal()I
Label0:
.var 0 is a I from Label0 to Label1
	iconst_1
	istore_0
Label2:
	iconst_2
	iload_0
	imul
	istore_0
	goto Label5
Label4:
	iconst_1
	ifle Label3
	goto Label2
Label3:
Label5:
	iload_0
	ireturn
Label1:
.limit stack 5
.limit locals 1
.end method

.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String; from Label0 to Label1
Label0:
	invokestatic MCClass/cal()I
	invokestatic io/putInt(I)V
Label1:
	return
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
