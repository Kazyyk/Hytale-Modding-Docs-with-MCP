---
title: "BuilderExpressionStaticStringArray"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionStaticStringArray"
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
public class BuilderExpressionStaticStringArray extends BuilderExpression
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BuilderExpressionStaticStringArray` | `INSTANCE_EMPTY` | `new BuilderExpressionStaticStringArray(ArrayUtil.EMPTY_ST...` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String[]` | `stringArray` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionStaticStringArray(String[] array)` |
| `public` | `ValueType` | `getType()` |
| `public` | `boolean` | `isStatic()` |
| `public` | `String[]` | `getStringArray(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, @Nonnull StdScope scope)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)` |
| `public static` | `BuilderExpressionStaticStringArray` | `fromJSON(@Nonnull JsonArray jsonArray)` |
