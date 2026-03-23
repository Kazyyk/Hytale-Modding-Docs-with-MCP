---
title: "FloodFillEntryPoolSimple"
kind: "class"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util.FloodFillEntryPoolSimple"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

```java
public class FloodFillEntryPoolSimple
```

Object pool for `int[5]` arrays used during flood-fill position calculation. Reduces GC pressure by reusing allocated arrays.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int[]` | `allocate()` |
| `public` | `void` | `deallocate(int[] entry)` |
