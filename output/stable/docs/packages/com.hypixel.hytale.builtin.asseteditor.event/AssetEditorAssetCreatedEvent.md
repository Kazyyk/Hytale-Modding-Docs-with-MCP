---
title: "AssetEditorAssetCreatedEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorAssetCreatedEvent"
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
public class AssetEditorAssetCreatedEvent extends EditorClientEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `assetType` |
| `private final` | `Path` | `assetPath` |
| `private final` | `byte[]` | `data` |
| `private final` | `String` | `buttonId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getAssetType()` |
| `public` | `Path` | `getAssetPath()` |
| `public` | `byte[]` | `getData()` |
| `public` | `String` | `getButtonId()` |
