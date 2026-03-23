---
title: "ResolvedVariantsBlockArrayLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.util"
fqcn: "com.hypixel.hytale.server.worldgen.loader.util.ResolvedVariantsBlockArrayLoader"
api_surface: false
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "loader"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.util`

```java
public class ResolvedVariantsBlockArrayLoader extends JsonLoader<SeedStringResource, ResolvedBlockArray>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `ResolvedBlockArray` | `load()` |
| `` | `throw new` | `IllegalArgumentException("Unknown key! " + blockName)` |
| `` | `throw new` | `IllegalArgumentException("BlockLayer does not exist in BlockTypes", var12)` |
| `` | `return new` | `ResolvedBlockArray(blocks)` |
| `@Nonnull public static` | `ResolvedBlockArray` | `loadSingleBlock(@Nonnull String blockName)` |
| `` | `throw new` | `IllegalArgumentException("Unknown block! " + blockName)` |
| `` | `throw new` | `IllegalArgumentException("BlockLayer does not exist in BlockTypes", var8)` |
| `@Nonnull public static` | `ResolvedBlockArray` | `loadSingleBlock(@Nonnull JsonObject object)` |
| `` | `throw new` | `IllegalArgumentException("Unknown fluid! " + fluidName)` |
| `` | `throw new` | `IllegalArgumentException("Required either Block or Fluid key")` |
| `` | `throw new` | `IllegalArgumentException("BlockLayer does not exist in BlockTypes", var10)` |
| `@Nonnull public static` | `BlockFluidEntry[]` | `resolveBlockArrayWithVariants(String baseKey, @Nonnull BlockTypeAssetMap<String, BlockType> assetMap, int fluidId)` |
| `` | `throw new` | `IllegalArgumentException("Unknown key! " + key)` |
