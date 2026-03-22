---
title: "NoiseBlockArray"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.NoiseBlockArray"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public class NoiseBlockArray
```

Provides NoiseBlockArray functionality within the util subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `NoiseBlockArray` | `EMPTY` | `new NoiseBlockArray(new NoiseBlockArray.Entry[0])` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `NoiseBlockArray.Entry[]` | `entries` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `NoiseBlockArray(NoiseBlockArray.Entry[] entries)` |
| `public` | `NoiseBlockArray.Entry[]` | `getEntries()` |
| `public` | `BlockFluidEntry` | `getTopBlockAt(int seed, double x, double z)` |
| `public` | `BlockFluidEntry` | `getBottomBlockAt(int seed, double x, double z)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
