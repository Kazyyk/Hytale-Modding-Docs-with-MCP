---
title: "BooleanArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.BooleanArrayHolder"
api_surface: false
extends: "ArrayHolder"
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
public class BooleanArrayHolder extends ArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `BooleanArrayValidator` | `booleanArrayValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BooleanArrayHolder()` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, BooleanArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, boolean[] defaultValue, BooleanArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `boolean[]` | `get(ExecutionContext executionContext)` |
| `public` | `boolean[]` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `validate(@Nullable boolean[] value)` |
