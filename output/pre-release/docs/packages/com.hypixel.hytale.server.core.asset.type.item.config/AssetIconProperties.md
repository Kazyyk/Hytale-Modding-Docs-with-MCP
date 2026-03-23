---
title: "AssetIconProperties"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.AssetIconProperties"
api_surface: true
extends: ~
implements: 
  - "NetworkSerializable<com.hypixel.hytale.protocol.AssetIconProperties>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config`

```java
public class AssetIconProperties implements NetworkSerializable<com.hypixel.hytale.protocol.AssetIconProperties>
```

Icon display configuration for assets. Defines scale, 2D translation offset, and 3D rotation for rendering item/block icons in the UI. Serialized via `BuilderCodec` with Scale (double), Translation (Vector2d), and Rotation (Vector3d) fields.
