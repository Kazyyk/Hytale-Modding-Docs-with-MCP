---
title: "ScaledResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.ScaledResponseCurve"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "responsecurve"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.responsecurve`

```java
public abstract class ScaledResponseCurve implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String,ScaledResponseCurve>` | `CODEC` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `double` | `computeY(double var1)` |
| `public` | `String` | `getId()` |
| `@Nonnull @Override public` | `String` | `toString()` |
