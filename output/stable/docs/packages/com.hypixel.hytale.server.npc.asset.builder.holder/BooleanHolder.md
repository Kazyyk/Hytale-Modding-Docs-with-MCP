---
title: "BooleanHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.BooleanHolder"
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
public class BooleanHolder extends ValueHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `List<BiConsumer<ExecutionContext, Boolean>>` | `relationValidators` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BooleanHolder()` |
| `public` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON(JsonElement optionalJsonElement, boolean defaultValue, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `boolean` | `get(ExecutionContext executionContext)` |
| `public` | `boolean` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `addRelationValidator(BiConsumer<ExecutionContext, Boolean> validator)` |
| `protected` | `void` | `validateRelations(ExecutionContext executionContext, boolean value)` |
