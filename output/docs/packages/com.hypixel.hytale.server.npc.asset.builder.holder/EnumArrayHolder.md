---
title: "EnumArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.EnumArrayHolder"
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
public class EnumArrayHolder<E extends Enum<E>> extends ArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Class<E>` | `clazz` |
| `private` | `E[]` | `enumConstants` |
| `private` | `EnumArrayValidator` | `validator` |
| `private` | `E[]` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EnumArrayHolder()` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, Class<E> clazz, EnumArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `E[]` | `get(ExecutionContext executionContext)` |
| `public` | `E[]` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `resolve(String[] value)` |
