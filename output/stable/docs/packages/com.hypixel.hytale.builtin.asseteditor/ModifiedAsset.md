---
title: "ModifiedAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.data"
fqcn: "com.hypixel.hytale.builtin.asseteditor.data.ModifiedAsset"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "data"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.data`

```java
public class ModifiedAsset
```

Tracks a modified asset's state, location, and edit metadata. Serialized to disk via a `BuilderCodec<ModifiedAsset>` for persistent recent-modifications tracking across server restarts.

## Fields

| Field | Type | Description |
|---|---|---|
| `dataFile` | `Path` | Path to the data file (nullable) |
| `path` | `Path` | Current asset path |
| `oldPath` | `Path` | Previous path if renamed (nullable) |
| `state` | [AssetState](AssetState.md) | Modification state (default: `CHANGED`) |
| `lastModificationTimestamp` | `Instant` | When the modification occurred |
| `lastModificationPlayerUuid` | `UUID` | UUID of the editing player |
| `lastModificationUsername` | `String` | Username of the editing player |

## Key Methods

| Method | Description |
|---|---|
| `void markEditedBy(EditorClient)` | Sets timestamp, UUID, and username from the editor client |
| `AssetInfo toAssetInfoPacket(String assetPack)` | Converts to an `AssetInfo` protocol packet |

## Codec

```java
public static final BuilderCodec<ModifiedAsset> CODEC
```

Serializes/deserializes the asset modification record with fields: `File`, `Path`, `OldPath`, `State`, `LastModificationTimestamp`, `LastModificationPlayerUuid`, `LastModificationUsername`. Legacy `IsNew`/`IsDeleted` boolean fields are supported for deserialization.
