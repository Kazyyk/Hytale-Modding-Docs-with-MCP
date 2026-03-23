---
title: "FarmingData"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming.FarmingData"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "blocktype"
  - "config"
  - "farming"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.farming`

```java
public class FarmingData
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `Map<String, FarmingStageData[]>` | `stages` |
| `protected` | `String` | `startingStageSet` |
| `protected` | `String` | `stageSetAfterHarvest` |
| `protected` | `String[]` | `growthModifiers` |
| `@Nullable protected` | `FarmingData.SoilConfig` | `soilConfig` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `Map<String, FarmingStageData[]>` | `getStages()` |
| `@Nullable public` | `String` | `getStartingStageSet()` |
| `public` | `String` | `getStageSetAfterHarvest()` |
| `public` | `String[]` | `getGrowthModifiers()` |
| `@Nullable public` | `FarmingData.SoilConfig` | `getSoilConfig()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `FarmingData.SoilConfig`
