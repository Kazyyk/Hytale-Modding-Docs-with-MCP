---
title: "BuilderExpressionStaticBooleanArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionStaticBooleanArray"
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
public class BuilderExpressionStaticBooleanArray extends BuilderExpression
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BuilderExpressionStaticBooleanArray` | `INSTANCE_EMPTY` | `new BuilderExpressionStaticBooleanArray(ArrayUtil.EMPTY_B...` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean[]` | `booleanArray` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionStaticBooleanArray(boolean[] array)` |
| `public` | `ValueType` | `getType()` |
| `public` | `boolean` | `isStatic()` |
| `public` | `boolean[]` | `getBooleanArray(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, @Nonnull StdScope scope)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)` |
| `public static` | `BuilderExpressionStaticBooleanArray` | `fromJSON(@Nonnull JsonArray jsonArray)` |
