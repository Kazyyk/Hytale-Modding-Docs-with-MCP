---
title: "NumberArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.NumberArrayHolder"
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
public class NumberArrayHolder extends ArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `IntArrayValidator` | `intArrayValidator` |
| `protected` | `DoubleArrayValidator` | `doubleArrayValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `NumberArrayHolder()` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, IntArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, DoubleArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, int[] defaultValue, IntArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, double[] defaultValue, DoubleArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `double[]` | `get(ExecutionContext executionContext)` |
| `public` | `double[]` | `rawGet(ExecutionContext executionContext)` |
| `public` | `int[]` | `getIntArray(ExecutionContext executionContext)` |
| `public` | `int[]` | `rawGetIntArray(ExecutionContext executionContext)` |
| `public` | `void` | `validate(@Nullable int[] value)` |
| `public` | `void` | `validate(@Nullable double[] value)` |
