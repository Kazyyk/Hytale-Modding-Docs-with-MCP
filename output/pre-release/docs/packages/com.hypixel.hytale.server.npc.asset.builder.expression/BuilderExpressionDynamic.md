---
title: "BuilderExpressionDynamic"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionDynamic"
api_surface: false
extends: "BuilderExpression"
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
public abstract class BuilderExpressionDynamic extends BuilderExpression
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `KEY_COMPUTE` | `"Compute"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `KEY_COMPUTE` |
| `private final` | `String` | `expression` |
| `private final` | `ExecutionContext.Instruction[]` | `instructionSequence` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionDynamic(String expression, ExecutionContext.Instruction[] instructionSequence)` |
| `public` | `boolean` | `isStatic()` |
| `public` | `String` | `getExpression()` |
| `protected` | `void` | `execute(@Nonnull ExecutionContext executionContext)` |
| `public static` | `BuilderExpression` | `fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters)` |
| `public static` | `Schema` | `toSchema()` |
| `public static` | `Schema` | `computableSchema(Schema toWrap)` |
