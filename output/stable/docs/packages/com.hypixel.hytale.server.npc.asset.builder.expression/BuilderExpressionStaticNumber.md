---
title: "BuilderExpressionStaticNumber"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionStaticNumber"
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
public class BuilderExpressionStaticNumber extends BuilderExpression
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double` | `number` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionStaticNumber(double number)` |
| `public` | `ValueType` | `getType()` |
| `public` | `boolean` | `isStatic()` |
| `public` | `double` | `getNumber(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, @Nonnull StdScope scope)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)` |
