---
title: "BiCoordinateCache"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache.BiCoordinateCache"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "datastructures"
  - "bicoordinatecache"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache`

```java
public interface BiCoordinateCache<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `T` | `get(int var1, int var2)` |
| `` | `boolean` | `isCached(int var1, int var2)` |
| `` | `T` | `save(int var1, int var2, T var3)` |
| `` | `void` | `flush(int var1, int var2)` |
| `` | `void` | `flush()` |
| `` | `int` | `size()` |
