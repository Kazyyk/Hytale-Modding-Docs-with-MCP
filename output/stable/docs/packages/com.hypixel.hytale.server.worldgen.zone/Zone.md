---
title: "Zone"
kind: "record"
package: "com.hypixel.hytale.server.worldgen.zone"
fqcn: "com.hypixel.hytale.server.worldgen.zone.Zone"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "zone"
  - "record"
---

**Package:** `com.hypixel.hytale.server.worldgen.zone`

```java
public record Zone( int id, @Nonnull String name, @Nonnull ZoneDiscoveryConfig discoveryConfig, @Nullable CaveGenerator caveGenerator, @Nonnull BiomePatternGenerator biomePatternGenerator, @Nonnull UniquePrefabContainer uniquePrefabContainer )
```

## Record Components

| Type | Name |
|---|---|
| `int` | `id` |
| `String` | `name` |
| `ZoneDiscoveryConfig` | `discoveryConfig` |
| `CaveGenerator` | `caveGenerator` |
| `BiomePatternGenerator` | `biomePatternGenerator` |
| `UniquePrefabContainer` | `uniquePrefabContainer` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `Zone.Unique`
- `Zone.UniqueCandidate`
- `Zone.UniqueEntry`
