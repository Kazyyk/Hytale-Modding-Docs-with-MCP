---
title: "ArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.ArrayHolder"
api_surface: false
extends: "ValueHolder"
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
public abstract class ArrayHolder extends ValueHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `int` | `minLength` |
| `protected` | `int` | `maxLength` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ArrayHolder(ValueType valueType)` |
| `protected` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, String name, @Nonnull BuilderParameters builderParameters)` |
| `protected` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, double[] defaultValue, String name, @Nonnull BuilderParameters builderParameters )` |
| `protected` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, String name, @Nonnull BuilderParameters builderParameters )` |
| `protected` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, boolean[] defaultValue, String name, @Nonnull BuilderParameters builderParameters )` |
| `protected` | `void` | `validateLength(int length)` |
| `protected` | `void` | `setLength(int minLength, int maxLength)` |
| `protected` | `void` | `setLength(int length)` |
