---
title: "AssetEditorSelectAssetEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorSelectAssetEvent"
api_surface: false
extends: "EditorClientEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public class AssetEditorSelectAssetEvent extends EditorClientEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `assetType` |
| `private final` | `AssetPath` | `assetFilePath` |
| `private final` | `String` | `previousAssetType` |
| `private final` | `AssetPath` | `previousAssetFilePath` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getAssetType()` |
| `public` | `AssetPath` | `getAssetFilePath()` |
| `public` | `String` | `getPreviousAssetType()` |
| `public` | `AssetPath` | `getPreviousAssetFilePath()` |
