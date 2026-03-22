---
title: "SendCommonAssetsEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.asset.common.events"
fqcn: "com.hypixel.hytale.server.core.asset.common.events.SendCommonAssetsEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - asset
  - async
---

> Package: `com.hypixel.hytale.server.core.asset.common.events`
> Implements: `IAsyncEvent<Void>`
> Cancellable: No
> Async: Yes

Asynchronous event dispatched when common assets are being sent to a connecting client. This is one of the few async events in the Hytale event system, allowing listeners to perform I/O operations during asset transfer.

Note: The accessor for the assets array is named `getRequestedAssets()` in the decompiled source, not `getAssets()`.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `packetHandler` | `PacketHandler` | `getPacketHandler()` | No | No |
| `assets` | `Asset[]` | `getRequestedAssets()` | No | No |

- **packetHandler** -- The packet handler for the connecting client.
- **assets** -- The array of assets being sent to the client.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

Because `SendCommonAssetsEvent` implements `IAsyncEvent`, use `registerAsync` for async handling.

```java
getEventRegistry().registerAsync(SendCommonAssetsEvent.class, future -> {
    return future.thenApply(event -> {
        PacketHandler handler = event.getPacketHandler();
        Asset[] assets = event.getRequestedAssets();

        // Perform async operations during asset transfer
        return event;
    });
});
```

## Related Events

- [`AssetPackRegisterEvent`](./AssetPackRegisterEvent.md) -- Fired when asset packs are registered.
- [`LoadAssetEvent`](./LoadAssetEvent.md) -- Fired during the boot asset loading phase.
