---
title: "BuilderExpressionStaticNumberArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionStaticNumberArray"
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
public class BuilderExpressionStaticNumberArray extends BuilderExpression
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BuilderExpressionStaticNumberArray` | `INSTANCE_EMPTY` | `new BuilderExpressionStaticNumberArray(ArrayUtil.EMPTY_DO...` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double[]` | `numberArray` |
| `private` | `int[]` | `cachedIntArray` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionStaticNumberArray(double[] array)` |
| `public` | `ValueType` | `getType()` |
| `public` | `boolean` | `isStatic()` |
| `public` | `double[]` | `getNumberArray(ExecutionContext executionContext)` |
| `public` | `int[]` | `getIntegerArray(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, @Nonnull StdScope scope)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)` |
| `private` | `void` | `createCacheIfAbsent()` |
| `public static` | `BuilderExpressionStaticNumberArray` | `fromJSON(@Nonnull JsonArray jsonArray)` |
| `public static` | `int[]` | `convertDoubleToIntArray(@Nullable double[] source)` |
| `public static` | `double[]` | `convertIntToDoubleArray(@Nullable int[] source)` |
