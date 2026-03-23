---
title: "ZonePatternGeneratorCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zone"
fqcn: "com.hypixel.hytale.server.worldgen.zone.ZonePatternGeneratorCache"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "zone"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.zone`

```java
public class ZonePatternGeneratorCache
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `Function<Integer, ZonePatternGenerator>` | `compute` |
| `protected final` | `Map<Integer, ZonePatternGenerator>` | `cache` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZonePatternGeneratorCache(ZonePatternProvider provider)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ZonePatternGenerator` | `get(int seed)` |
