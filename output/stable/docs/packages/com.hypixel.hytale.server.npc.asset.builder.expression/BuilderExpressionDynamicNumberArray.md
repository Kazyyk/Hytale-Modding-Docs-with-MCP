---
title: "BuilderExpressionDynamicNumberArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionDynamicNumberArray"
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
public class BuilderExpressionDynamicNumberArray extends BuilderExpressionDynamic
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionDynamicNumberArray(String expression, ExecutionContext.Instruction[] instructionSequence)` |
| `public` | `ValueType` | `getType()` |
| `public` | `double[]` | `getNumberArray(@Nonnull ExecutionContext executionContext)` |
| `public` | `int[]` | `getIntegerArray(@Nonnull ExecutionContext executionContext)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, @Nonnull ExecutionContext executionContext)` |
