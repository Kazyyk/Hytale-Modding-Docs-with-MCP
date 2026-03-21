---
title: "WrappedBiCoordinateCache"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache.WrappedBiCoordinateCache"
api_surface: false
extends: null
implements: ["BiCoordinateCache"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "datastructures"
  - "bicoordinatecache"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache`

```java
public class WrappedBiCoordinateCache<T> implements BiCoordinateCache
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `sizeX` |
| `private final` | `int` | `sizeZ` |
| `private final` | `T[][]` | `values` |
| `private final` | `boolean[][]` | `populated` |
| `private` | `int` | `size` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `localXFrom(int x)` |
| `public` | `int` | `localZFrom(int z)` |
| `@Override public` | `T` | `get(int x, int z)` |
| `@Override public` | `boolean` | `isCached(int x, int z)` |
| `@Override public` | `T` | `save(int x, int z, T value)` |
| `@Override public` | `void` | `flush(int x, int z)` |
| `@Override public` | `void` | `flush()` |
| `@Override public` | `int` | `size()` |
| `@Nonnull @Override public` | `String` | `toString()` |
