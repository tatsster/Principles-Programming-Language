.source MCClass.java
.class public MCClass
.super java.lang.Object

.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String; from Label0 to Label1
Label0:
	iconst_1
	iconst_2
	if_icmple Label2
	iconst_1
	goto Label3
Label2:
	iconst_0
Label3:
	iconst_1
	iconst_2
	ineg
	if_icmpge Label4
	iconst_1
	goto Label5
Label4:
	iconst_0
Label5:
	bipush 6
	if_icmpgt Label6
	iconst_1
	goto Label7
Label6:
	iconst_0
Label7:
	if_icmpge Label8
	iconst_1
	goto Label9
Label8:
	iconst_0
Label9:
	invokestatic io/putBool(Z)V
Label1:
	return
.limit stack 9
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
