---
title: "IntHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.IntHolder"
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
public class IntHolder extends ValueHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `List<ObjIntConsumer<ExecutionContext>>` | `relationValidators` |
| `protected` | `IntValidator` | `intValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `IntHolder()` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, IntValidator validator, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `void` | `readJSON(JsonElement optionalJsonElement, int defaultValue, IntValidator validator, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `int` | `get(ExecutionContext executionContext)` |
| `public` | `int` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `validate(int value)` |
| `public` | `void` | `addRelationValidator(ObjIntConsumer<ExecutionContext> validator)` |
| `protected` | `void` | `validateRelations(ExecutionContext executionContext, int value)` |
