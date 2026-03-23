---
title: "HashSetBlockFluidCondition"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.HashSetBlockFluidCondition"
api_surface: false
extends: null
implements: ["IBlockFluidCondition"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition`

```java
public class HashSetBlockFluidCondition implements IBlockFluidCondition
```

Condition evaluating HashSetBlockFluid criteria.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `LongSet` | `set` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `HashSetBlockFluidCondition(LongSet set)` |
| `public` | `LongSet` | `getSet()` |
| `@Override public` | `boolean` | `eval(int block, int fluid)` |
| `@Nonnull @Override public` | `String` | `toString()` |
