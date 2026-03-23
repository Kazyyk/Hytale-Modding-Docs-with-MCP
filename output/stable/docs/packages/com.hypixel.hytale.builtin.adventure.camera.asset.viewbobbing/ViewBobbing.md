---
title: "ViewBobbing"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing.ViewBobbing"
api_surface: false
extends: null
implements: ["NetworkSerializable", "JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "asset"
  - "viewbobbing"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing`

```java
public class ViewBobbing implements NetworkSerializable, JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Codec<MovementType>` | `MOVEMENT_TYPE_CODEC` |
| `public static final` | `AssetBuilderCodec<MovementType,ViewBobbing>` | `CODEC` |
| `protected` | `MovementType` | `id` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `CameraShakeConfig` | `firstPerson` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `MovementType` | `getId()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.ViewBobbing` | `toPacket()` |
| `@Nonnull @Override public` | `String` | `toString()` |
