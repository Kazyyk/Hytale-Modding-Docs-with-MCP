---
title: "AssetPackRegisterEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.AssetPackRegisterEvent"
api_surface: false
extends: null
implements: ["IEvent<Void>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.asset`

```java
public class AssetPackRegisterEvent implements IEvent<Void>
```

Event fired when an asset pack is registered with the server, either at boot or at runtime.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `AssetPack` | `getAssetPack()` |
