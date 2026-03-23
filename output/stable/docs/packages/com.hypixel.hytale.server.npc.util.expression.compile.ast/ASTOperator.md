---
title: "ASTOperator"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperator"
api_surface: false
extends: "AST"
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
public abstract class ASTOperator extends AST
```

Abstract base class in the `ast` package.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(returnType, token, tokenPosition)` |
| `` | `public void` | `addArgument(@Nonnull AST argument)` |
| `@Nonnull public` | `List<AST>` | `getArguments()` |
| `@Override public` | `ValueType` | `genCode(@Nonnull List<ExecutionContext.Instruction> list, Scope scope)` |
| `` | `public static void` | `fromParsedOperator(@Nonnull Parser.ParsedToken operand, @Nonnull CompileContext compileContext)` |
| `` | `throw new` | `ParseException("Not enough operands for operator '" + operand.tokenString, operand.tokenPosition)` |
