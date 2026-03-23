---
title: "BuilderExpressionStaticString"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.expression"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.expression.BuilderExpressionStaticString"
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
public class BuilderExpressionStaticString extends BuilderExpression
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `string` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BuilderExpressionStaticString(String string)` |
| `public` | `ValueType` | `getType()` |
| `public` | `boolean` | `isStatic()` |
| `public` | `String` | `getString(ExecutionContext executionContext)` |
| `public` | `void` | `addToScope(String name, @Nonnull StdScope scope)` |
| `public` | `void` | `updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)` |
