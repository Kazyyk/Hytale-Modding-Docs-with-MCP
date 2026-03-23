---
title: "ASTOperatorBinary"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperatorBinary"
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
public class ASTOperatorBinary extends ASTOperator
```

Extends `ASTOperator`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `isConstant()` |
| `` | `public static void` | `fromBinaryOperator(@Nonnull Parser.ParsedToken operator, @Nonnull CompileContext compileContext)` |
| `` | `throw new` | `ParseException("Type mismatch for operator " + operator.token, operator.tokenPosition)` |
| `` | `throw new` | `IllegalStateException("Failed to evaluate constant binary AST")` |
| `` | `throw new` | `ParseException("Not enough operands for operator '" + operator.tokenString, operator.tokenPosition)` |
