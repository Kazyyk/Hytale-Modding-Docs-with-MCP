---
title: "DoubleHolderBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.DoubleHolderBase"
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
public abstract class DoubleHolderBase extends ValueHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `List<ObjDoubleConsumer<ExecutionContext>>` | `relationValidators` |
| `protected` | `DoubleValidator` | `doubleValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `DoubleHolderBase()` |
| `public` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, DoubleValidator validator, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, double defaultValue, DoubleValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `addRelationValidator(ObjDoubleConsumer<ExecutionContext> validator)` |
| `protected` | `void` | `validateRelations(ExecutionContext executionContext, double value)` |
| `public` | `double` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `validate(double value)` |
