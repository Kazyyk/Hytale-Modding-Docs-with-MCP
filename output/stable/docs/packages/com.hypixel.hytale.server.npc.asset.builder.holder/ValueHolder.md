---
title: "ValueHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.ValueHolder"
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
**Package:** `com.hypixel.hytale.server.npc.asset.builder.holder`

```java
public abstract class ValueHolder
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `protected static final` | `boolean` | `LOG_VALUES` | `false` |
| `protected static final` | `HytaleLogger` | `LOGGER` | `HytaleLogger.get("BuilderManager")` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `boolean` | `LOG_VALUES` |
| `protected` | `ValueType` | `valueType` |
| `protected` | `String` | `name` |
| `protected` | `BuilderExpression` | `expression` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `ValueHolder(ValueType valueType)` |
| `public abstract` | `void` | `validate(ExecutionContext var1)` |
| `protected` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, String name, @Nonnull BuilderParameters builderParameters)` |
| `protected` | `void` | `readJSON( @Nullable JsonElement optionalJsonElement, @Nonnull Supplier<BuilderExpression> defaultValue, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `String` | `getName()` |
| `public` | `void` | `setName(String name)` |
| `public` | `boolean` | `isStatic()` |
| `public` | `String` | `getExpressionString()` |
