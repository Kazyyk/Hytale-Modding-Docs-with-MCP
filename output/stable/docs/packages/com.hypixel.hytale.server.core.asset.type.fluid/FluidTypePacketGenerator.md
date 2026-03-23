---
title: "FluidTypePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.FluidTypePacketGenerator"
api_surface: false
extends: "com.hypixel.hytale.server.core.asset.packet.AssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "asset"
  - "fluid"
  - "network"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

```java
public class FluidTypePacketGenerator extends AssetPacketGenerator<String, Fluid, IndexedLookupTableAssetMap<String, Fluid>>
```

Generates `UpdateFluids` network packets for synchronizing fluid asset definitions to clients. Produces three packet types: `Init` (full asset map), `AddOrUpdate` (changed assets), and `Remove` (deleted assets). Each packet maps integer fluid indices to their protocol `Fluid` representation via [Fluid](Fluid.md)`.toPacket()`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, Fluid> assetMap, @Nonnull Map<String, Fluid> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, Fluid> assetMap, @Nonnull Map<String, Fluid> loadedAssets, @Nonnull AssetUpdateQuery query)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, Fluid> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)` |

## Related Types

- [Fluid](Fluid.md) -- the asset type serialized into packets
