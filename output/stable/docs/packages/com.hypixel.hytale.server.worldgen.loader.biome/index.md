---
title: "com.hypixel.hytale.server.worldgen.loader.biome"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.loader.biome"
fqcn: "com.hypixel.hytale.server.worldgen.loader.biome"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "biome"
  - "loader"
  - "json"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.biome`

JSON loaders for the world generation biome system. Each loader reads a specific biome-related JSON structure and produces the corresponding runtime object (biome, biome pattern generator, interpolation settings, masks, etc.).

## Types

| Type | Kind | Description |
|---|---|---|
| [BiomeJsonLoader](BiomeJsonLoader.md) | class | Abstract base for biome JSON loaders with container loading methods. |
| [TileBiomeJsonLoader](TileBiomeJsonLoader.md) | class | Loads tile biome definitions. |
| [CustomBiomeJsonLoader](CustomBiomeJsonLoader.md) | class | Loads custom biome overlays. |
| [CustomBiomeGeneratorJsonLoader](CustomBiomeGeneratorJsonLoader.md) | class | Loads custom biome generator configurations. |
| [BiomePatternGeneratorJsonLoader](BiomePatternGeneratorJsonLoader.md) | class | Loads biome pattern generators (distribution within zones). |
| [BiomeInterpolationJsonLoader](BiomeInterpolationJsonLoader.md) | class | Loads biome interpolation/blending settings. |
| [BiomeMaskJsonLoader](BiomeMaskJsonLoader.md) | class | Loads biome mask conditions for include/exclude filtering. |
