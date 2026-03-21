---
title: "ASTOperatorFunctionCall"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperatorFunctionCall"
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
public class ASTOperatorFunctionCall extends ASTOperator
```

Extends `ASTOperator`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(returnType, Token.FUNCTION_CALL, tokenPosition)` |
| `@Override public` | `boolean` | `isConstant()` |
| `` | `public static void` | `fromParsedFunction(int argumentCount, @Nonnull CompileContext compileContext)` |
| `` | `throw new` | `IllegalStateException("Failed to evaluate constant function AST")` |
