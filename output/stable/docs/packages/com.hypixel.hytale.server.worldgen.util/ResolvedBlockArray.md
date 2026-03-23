---
title: "ResolvedBlockArray"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ResolvedBlockArray"
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
public final class ResolvedBlockArray
```

Provides ResolvedBlockArray functionality within the util subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `ResolvedBlockArray` | `EMPTY` | `new ResolvedBlockArray(BlockFluidEntry.EMPTY_ARRAY)` |
| `public static final` | `Long2ObjectMap<ResolvedBlockArray>` | `RESOLVED_BLOCKS` | `Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap())` |
| `public static final` | `Long2ObjectMap<ResolvedBlockArray>` | `RESOLVED_BLOCKS_WITH_VARIANTS` | `Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap())` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `LongSet` | `entrySet` |
| `@Nonnull private final` | `BlockFluidEntry[]` | `entries` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ResolvedBlockArray(@Nonnull BlockFluidEntry[] entries)` |
| `@Nonnull public` | `BlockFluidEntry[]` | `getEntries()` |
| `@Nonnull public` | `LongSet` | `getEntrySet()` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `contains(int block, int fluidId)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
