---
title: "ZonePatternProvider"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zone"
fqcn: "com.hypixel.hytale.server.worldgen.zone.ZonePatternProvider"
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
public class ZonePatternProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IPointGenerator` | `pointGenerator` |
| `protected final` | `Zone[]` | `zones` |
| `protected final` | `Zone.UniqueCandidate[]` | `uniqueZones` |
| `protected final` | `MaskProvider` | `maskProvider` |
| `protected final` | `ZoneColorMapping` | `zoneColorMapping` |
| `protected final` | `int` | `maxExtent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZonePatternProvider(IPointGenerator pointGenerator, Zone[] zones, Zone.UniqueCandidate[] uniqueZones, MaskProvider maskProvider, ZoneColorMapping zoneColorMapping)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getMaxExtent()` |
| `public` | `Zone[]` | `getZones()` |
| `public` | `MaskProvider` | `getMaskProvider()` |
| `public` | `ZonePatternGenerator` | `createGenerator(int seed)` |
| `@Override public` | `String` | `toString()` |
| `private static` | `int` | `getMaxExtent(@Nonnull Zone[] zones)` |
