---
title: "CameraAxis"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config.camera"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.camera.CameraAxis"
api_surface: true
extends: null
implements: ["NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "model"
  - "config"
  - "camera"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config.camera`

```java
public class CameraAxis implements NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CameraAxis>` | `CODEC` |
| `public static final` | `CameraAxis` | `STATIC_HEAD` |
| `protected` | `Rangef` | `angleRange` |
| `protected` | `CameraNode[]` | `targetNodes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.CameraAxis` | `toPacket()` |
| `public` | `Rangef` | `getAngleRange()` |
| `public` | `CameraNode[]` | `getTargetNodes()` |
| `@Nonnull @Override public` | `String` | `toString()` |
