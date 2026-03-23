---
title: "ASTOperandString"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperandString"
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
public class ASTOperandString extends ASTOperand
```

Extends `ASTOperand`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(ValueType.STRING, token, tokenPosition)` |
| `` | `throw new` | `IllegalArgumentException("Value must be constant: " + identifier)` |
| `@Override public` | `String` | `getString()` |
| `@Override public` | `boolean` | `isConstant()` |
| `@Override public` | `ExecutionContext.Operand` | `asOperand()` |
