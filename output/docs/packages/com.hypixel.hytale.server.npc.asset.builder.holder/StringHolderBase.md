---
title: "StringHolderBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.StringHolderBase"
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
public abstract class StringHolderBase extends ValueHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `List<BiConsumer<ExecutionContext, String>>` | `relationValidators` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `StringHolderBase()` |
| `public` | `void` | `addRelationValidator(BiConsumer<ExecutionContext, String> validator)` |
| `protected` | `void` | `validateRelations(ExecutionContext executionContext, String value)` |
