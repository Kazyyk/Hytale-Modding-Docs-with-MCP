---
title: "EnumSetHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.EnumSetHolder"
api_surface: false
extends: "Enum"
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
public class EnumSetHolder<E extends Enum<E>> extends ArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Class<E>` | `clazz` |
| `private` | `E[]` | `enumConstants` |
| `private` | `EnumSet<E>` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EnumSetHolder()` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, Class<E> clazz, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, @Nonnull EnumSet<E> defaultValue, Class<E> clazz, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `EnumSet<E>` | `get(ExecutionContext executionContext)` |
| `public` | `EnumSet<E>` | `rawGet(ExecutionContext executionContext)` |
