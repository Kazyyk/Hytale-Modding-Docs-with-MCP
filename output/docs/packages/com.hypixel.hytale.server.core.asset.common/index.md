---
title: "com.hypixel.hytale.server.core.asset.common"
kind: "package"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

Common asset management subsystem. Handles loading, caching, validation, and network distribution of shared binary assets (textures, models, animations, sounds) to connected clients.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockyAnimationCache](BlockyAnimationCache.md) | class | Cache for parsed blocky animation data. |
| [CommonAsset](CommonAsset.md) | class | Abstract base for network-distributable assets. |
| [CommonAssetModule](CommonAssetModule.md) | class | Plugin managing the common asset pipeline. |
| [CommonAssetRegistry](CommonAssetRegistry.md) | class | Global registry of common assets by name and hash. |
| [CommonAssetValidator](CommonAssetValidator.md) | class | Validates common asset references during loading. |
| [HytaleFileTypes](HytaleFileTypes.md) | class | File extension constants for Hytale assets. |
| [OggVorbisInfoCache](OggVorbisInfoCache.md) | class | Cache for OGG Vorbis audio metadata. |
| [PlayerCommonAssets](PlayerCommonAssets.md) | class | Per-player asset delivery tracker. |
| [ResourceCommonAsset](ResourceCommonAsset.md) | class | Common asset backed by classpath resource. |
| [SoundFileValidators](SoundFileValidators.md) | class | Channel count validators for sound files. |
