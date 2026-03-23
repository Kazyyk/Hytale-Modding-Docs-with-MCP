---
title: "BuilderExpressionStaticEmptyArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionStaticEmptyArray"
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
public class BuilderExpressionStaticEmptyArray extends BuilderExpression
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BuilderExpressionStaticEmptyArray` | `INSTANCE` | `new BuilderExpressionStaticEmptyArray()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ValueType` | `getType()` |
| `public` | `boolean` | `isStatic()` |
| `public` | `double[]` | `getNumberArray(ExecutionContext executionContext)` |
| `public` | `int[]` | `getIntegerArray(ExecutionContext executionContext)` |
| `public` | `String[]` | `getStringArray(ExecutionContext executionContext)` |
| `public` | `boolean[]` | `getBooleanArray(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, @Nonnull StdScope scope)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)` |
