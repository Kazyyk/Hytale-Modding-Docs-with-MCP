---
title: "AST"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.AST"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "expression"
  - "compile"
  - "ast"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.util.expression.compile.ast`

```java
public abstract class AST
```

Abstract base class in the `ast` package.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `AST` | `parent` |
| `@Nullable protected` | `Function<Scope, ExecutionContext.Instruction>` | `codeGen` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public AST` | `getParent()` |
| `` | `public void` | `setParent(AST parent)` |
| `@Nonnull public` | `ValueType` | `getValueType()` |
| `@Nonnull public` | `Token` | `getToken()` |
| `` | `public int` | `getTokenPosition()` |
| `@Nullable public` | `Function<Scope, ExecutionContext.Instruction>` | `getCodeGen()` |
| `` | `public abstract boolean` | `isConstant()` |
| `` | `public ExecutionContext.Operand` | `asOperand()` |
| `` | `throw new` | `IllegalStateException("AST: Cannot be returned as operand")` |
| `` | `public String` | `getString()` |
| `` | `throw new` | `IllegalStateException("AST: Cannot return string")` |
| `` | `public boolean` | `getBoolean()` |
| `` | `throw new` | `IllegalStateException("AST: Cannot return boolean")` |
| `` | `public double` | `getNumber()` |
| `` | `throw new` | `IllegalStateException("AST: Cannot return number")` |
| `@Nonnull public` | `ValueType` | `returnType()` |
| `` | `public ValueType` | `genCode(@Nonnull List<ExecutionContext.Instruction> list, Scope scope)` |
