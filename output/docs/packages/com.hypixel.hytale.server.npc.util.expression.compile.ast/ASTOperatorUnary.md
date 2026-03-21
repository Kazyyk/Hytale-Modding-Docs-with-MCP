---
title: "ASTOperatorUnary"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperatorUnary"
api_surface: false
extends: "ASTOperator"
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
public class ASTOperatorUnary extends ASTOperator
```

Extends `ASTOperator`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `isConstant()` |
| `` | `public static void` | `fromUnaryOperator(@Nonnull Parser.ParsedToken operand, @Nonnull CompileContext compileContext)` |
| `` | `throw new` | `ParseException("Type mismatch for operator " + token, tokenPosition)` |
| `` | `throw new` | `IllegalStateException("Failed to evaluate constant unary AST")` |
| `` | `throw new` | `ParseException("Not enough operands for operator '" + operand.tokenString, tokenPosition)` |
