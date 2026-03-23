---
title: "AssetRegistryLoader"
kind: "class"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.AssetRegistryLoader"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.asset`

```java
public class AssetRegistryLoader
```

Handles ordered loading of all registered asset stores from asset packs. Resolves inter-store dependencies via `AssetStoreIterator`, loads assets from the `Server/` directory of each pack, generates JSON schemas, and provides a method to send all asset data to a connecting client.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `init()` |
| `public static` | `void` | `preLoadAssets(@Nonnull LoadAssetEvent event)` |
| `public static` | `void` | `loadAssets(@Nullable LoadAssetEvent event, @Nonnull AssetPack assetPack)` |
| `public static` | `void` | `sendAssets(@Nonnull PacketHandler packetHandler)` |
| `@Nonnull public static` | `Map<String, Schema>` | `generateSchemas(@Nonnull SchemaContext context, @Nonnull BsonDocument vsCodeConfig)` |
