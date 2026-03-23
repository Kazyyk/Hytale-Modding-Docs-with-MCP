---
title: "ZonePatternGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zone"
fqcn: "com.hypixel.hytale.server.worldgen.zone.ZonePatternGenerator"
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
public class ZonePatternGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IPointGenerator` | `pointGenerator` |
| `protected final` | `Zone[]` | `zones` |
| `protected final` | `Zone.Unique[]` | `uniqueZones` |
| `protected final` | `MaskProvider` | `maskProvider` |
| `protected final` | `ZoneColorMapping` | `zoneColorMapping` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZonePatternGenerator(IPointGenerator pointGenerator, Zone[] zones, Zone.Unique[] uniqueZones, MaskProvider maskProvider, ZoneColorMapping zoneColorMapping)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Zone[]` | `getZones()` |
| `public` | `Zone.Unique[]` | `getUniqueZones()` |
| `@Nonnull public` | `ZoneGeneratorResult` | `generate(int seed, double x, double z)` |
| `@Nonnull public` | `ZoneGeneratorResult` | `generate(int seed, double x, double z, @Nonnull ZoneGeneratorResult result)` |
| `protected` | `void` | `getZone(int seed, double x, double z, @Nonnull ZoneGeneratorResult result, @Nonnull Zone[] zoneArr)` |
| `@Nonnull @Override public` | `String` | `toString()` |
