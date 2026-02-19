---
title: "AssetPackUnregisterEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.AssetPackUnregisterEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - asset
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.asset`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when an asset pack is unregistered from the server. Provides access to the `AssetPack` that was unregistered.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `assetPack` | `AssetPack` | `getAssetPack()` | No | No |

- **assetPack** -- The asset pack that was unregistered.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(AssetPackUnregisterEvent.class, event -> {
    AssetPack pack = event.getAssetPack();
    // Handle asset pack unregistration
});
```

## Related Events

- [`AssetPackRegisterEvent`](./AssetPackRegisterEvent.md) -- The counterpart event fired when an asset pack is registered.
