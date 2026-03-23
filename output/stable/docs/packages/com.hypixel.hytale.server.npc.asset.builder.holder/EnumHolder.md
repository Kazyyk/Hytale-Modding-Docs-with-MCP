---
title: "EnumHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.EnumHolder"
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
public class EnumHolder<E extends Enum<E>> extends StringHolderBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `List<BiConsumer<ExecutionContext, E>>` | `enumRelationValidators` |
| `private` | `E[]` | `enumConstants` |
| `private` | `E` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, Class<E> clazz, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `void` | `readJSON(JsonElement optionalJsonElement, Class<E> clazz, @Nonnull E defaultValue, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `E` | `get(ExecutionContext executionContext)` |
| `public` | `void` | `addEnumRelationValidator(BiConsumer<ExecutionContext, E> validator)` |
| `public` | `E` | `rawGet(ExecutionContext executionContext)` |
| `private` | `void` | `validateEnumRelations(ExecutionContext context, E value)` |
