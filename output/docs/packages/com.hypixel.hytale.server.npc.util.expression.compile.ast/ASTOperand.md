---
title: "ASTOperand"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperand"
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
public abstract class ASTOperand extends AST
```

Abstract base class in the `ast` package.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(valueType, token, tokenPosition)` |
| `` | `return new` | `ASTOperandString(token, tokenPosition, tokenString)` |
| `` | `return new` | `ASTOperandNumber(token, tokenPosition, operand.tokenNumber)` |
| `` | `throw new` | `IllegalStateException("Unknown parser operand type in AST" + operand.token)` |
