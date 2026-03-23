---
title: "BuilderExpressionDynamicNumber"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionDynamicNumber"
api_surface: false
extends: "BuilderExpressionDynamic"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.asset.builder.expression`

```java
public class BuilderExpressionDynamicNumber extends BuilderExpressionDynamic
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionDynamicNumber(String expression, ExecutionContext.Instruction[] instructionSequence)` |
| `public` | `ValueType` | `getType()` |
| `public` | `double` | `getNumber(@Nonnull ExecutionContext executionContext)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, @Nonnull ExecutionContext executionContext)` |
