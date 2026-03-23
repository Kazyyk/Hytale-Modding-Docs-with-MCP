---
title: "BuilderExpression"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpression"
api_surface: false
extends: null
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
public abstract class BuilderExpression
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `STATIC` | `"<STATIC>"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `STATIC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `ValueType` | `getType()` |
| `public abstract` | `boolean` | `isStatic()` |
| `public` | `double` | `getNumber(ExecutionContext executionContext)` |
| `public` | `String` | `getString(ExecutionContext executionContext)` |
| `public` | `boolean` | `getBoolean(ExecutionContext executionContext)` |
| `public` | `double[]` | `getNumberArray(ExecutionContext executionContext)` |
| `public` | `int[]` | `getIntegerArray(ExecutionContext executionContext)` |
| `public` | `String[]` | `getStringArray(ExecutionContext executionContext)` |
| `public` | `boolean[]` | `getBooleanArray(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, StdScope scope)` |
| `public` | `void` | `updateScope(StdScope scope, String name, ExecutionContext executionContext)` |
| `public` | `String` | `getExpression()` |
| `public static` | `BuilderExpression` | `fromOperand(@Nonnull ExecutionContext.Operand operand)` |
| `public static` | `BuilderExpression` | `fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters, boolean constantsOnly)` |
| `public static` | `BuilderExpression` | `fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters, ValueType expectedType)` |
| `public static` | `BuilderExpression` | `fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters)` |
| `private static` | `BuilderExpression` | `readJSONPrimitive(@Nonnull JsonElement jsonElement)` |
| `private static` | `BuilderExpression` | `readStaticArray(@Nonnull JsonElement jsonElement)` |
| `public` | `void` | `compile(BuilderParameters builderParameters)` |
| `public static` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `public` | `String` | `getSchemaName()` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
