---
title: "ASTOperatorTuple"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression.compile.ast"
fqcn: "com.hypixel.hytale.server.npc.util.expression.compile.ast.ASTOperatorTuple"
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
public class ASTOperatorTuple extends ASTOperator
```

Extends `ASTOperator`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(arrayType, token, tokenPosition)` |
| `@Override public` | `boolean` | `isConstant()` |
| `` | `public static void` | `fromParsedTuple(@Nonnull Parser.ParsedToken openingToken, int argumentCount, @Nonnull CompileContext compileContext)` |
| `` | `> throw new` | `IllegalStateException("Invalid type in array: " + argumentType)` |
| `` | `> new` | `ASTOperandNumberArray(token, tokenPosition, operandStack, firstArgument, argumentCount)` |
| `` | `> new` | `ASTOperandStringArray(token, tokenPosition, operandStack, firstArgument, argumentCount)` |
| `` | `> new` | `ASTOperandBooleanArray(token, tokenPosition, operandStack, firstArgument, argumentCount)` |
| `` | `> throw new` | `IllegalStateException("Unexpected array type when creating constant array: " + arrayType)` |
