.source MCClass.java
.class public MCClass
.super java.lang.Object

.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String; from Label0 to Label1
Label0:
.var 1 is f I from Label0 to Label1
	invokestatic MCClass/foo1()I
	istore_1
	iconst_5
	invokestatic MCClass/foo2(I)F
	iconst_3
	i2f
	fmul
	iload_1
	i2f
	fadd
	invokestatic io/putFloat(F)V
Label1:
	return
.limit stack 3
.limit locals 2
.end method

.method public static foo1()I
Label0:
.var 0 is a I from Label0 to Label1
	iconst_5
	istore_0
	iload_0
	ireturn
Label1:
.limit stack 2
.limit locals 1
.end method

.method public static foo2(I)F
.var 0 is a I from Label0 to Label1
Label0:
	invokestatic MCClass/foo1()I
	iload_0
	iadd
	i2f
	freturn
Label1:
.limit stack 2
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
