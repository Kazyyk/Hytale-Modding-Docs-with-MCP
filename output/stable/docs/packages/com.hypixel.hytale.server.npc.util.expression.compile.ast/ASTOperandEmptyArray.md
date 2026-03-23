---
title: "ASTOperandEmptyArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperandEmptyArray"
api_surface: false
extends: "ASTOperand"
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
public class ASTOperandEmptyArray extends ASTOperand
```

Extends `ASTOperand`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(ValueType.EMPTY_ARRAY, token, tokenPosition)` |
| `@Override public` | `boolean` | `isConstant()` |
| `@Override public` | `ExecutionContext.Operand` | `asOperand()` |
