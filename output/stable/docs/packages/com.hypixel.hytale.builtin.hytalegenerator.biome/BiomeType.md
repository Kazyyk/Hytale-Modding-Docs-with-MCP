---
title: "BiomeType"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.biome"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.biome.BiomeType"
api_surface: false
extends: null
implements: ["MaterialSource", "PropsSource", "EnvironmentSource", "TintSource"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "biome"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.biome`

```java
public interface BiomeType extends MaterialSource, PropsSource, EnvironmentSource, TintSource
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `String` | `getBiomeName()` |
| `@Nonnull` | `Density` | `getTerrainDensity()` |
