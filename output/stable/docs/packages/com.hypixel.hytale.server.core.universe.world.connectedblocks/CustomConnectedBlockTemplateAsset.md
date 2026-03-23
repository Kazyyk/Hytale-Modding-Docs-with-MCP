---
title: "CustomConnectedBlockTemplateAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.CustomConnectedBlockTemplateAsset"
api_surface: false
extends: ~
implements: ["JsonAssetWithMap<String", "DefaultAssetMap<String, CustomConnectedBlockTemplateAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "universe"
  - "world"
  - "connectedblocks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.connectedblocks`

```java
public class CustomConnectedBlockTemplateAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, CustomConnectedBlockTemplateAsset>>
```

Asset defining a reusable connected block template with configurable pattern rules.

## Constants

| Type | Name |
|---|---|
| `AssetBuilderCodec<String, CustomConnectedBlockTemplateAsset>` | `CODEC` |
| `ValidatorCache<String>` | `VALIDATOR_CACHE` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `DefaultAssetMap<String, CustomConnectedBlockTemplateAsset>` | `getAssetMap()` |
| `public` | `Optional<ConnectedBlocksUtil.ConnectedBlockResult>` | `getConnectedBlockType(World world, Vector3i coordinate, CustomTemplateConnectedBlockRuleSet ruleSet, BlockType blockType, int rotation, Vector3i placementNormal, boolean useDefaultShapeIfNoMatch, boolean isPlacement)` |
| `public` | `boolean` | `isDontUpdateAfterInitialPlacement()` |
| `public` | `String` | `getId()` |
