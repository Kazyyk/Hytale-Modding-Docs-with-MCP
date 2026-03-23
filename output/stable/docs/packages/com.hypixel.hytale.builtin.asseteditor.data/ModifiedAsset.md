---
title: "ModifiedAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.data"
fqcn: "com.hypixel.hytale.builtin.asseteditor.data.ModifiedAsset"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "data"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.data`

```java
public class ModifiedAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ModifiedAsset>` | `CODEC` |
| `public` | `Path` | `dataFile` |
| `public` | `Path` | `path` |
| `public` | `Path` | `oldPath` |
| `public` | `AssetState` | `state` |
| `public` | `Instant` | `lastModificationTimestamp` |
| `public` | `UUID` | `lastModificationPlayerUuid` |
| `public` | `String` | `lastModificationUsername` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `markEditedBy(EditorClient editorClient)` |
| `@Nonnull public` | `AssetInfo` | `toAssetInfoPacket(String assetPack)` |
