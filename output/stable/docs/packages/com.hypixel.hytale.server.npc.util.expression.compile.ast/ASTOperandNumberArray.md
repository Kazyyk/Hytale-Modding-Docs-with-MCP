---
title: "ASTOperandNumberArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperandNumberArray"
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
public class ASTOperandNumberArray extends ASTOperand
```

Extends `ASTOperand`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(ValueType.NUMBER_ARRAY, token, tokenPosition)` |
| `` | `throw new` | `IllegalArgumentException("Value must be constant: " + identifier)` |
| `` | `` | `this(token, tokenPosition, new double[argumentCount])` |
| `@Override public` | `boolean` | `isConstant()` |
| `@Override public` | `ExecutionContext.Operand` | `asOperand()` |
