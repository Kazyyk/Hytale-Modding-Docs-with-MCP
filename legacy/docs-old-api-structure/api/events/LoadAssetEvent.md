---
title: "LoadAssetEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.LoadAssetEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - lifecycle
  - asset
---

> Package: `com.hypixel.hytale.server.core.asset`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched during the server boot lifecycle, specifically during the asset loading phase. Listeners registered at different priority levels load assets in a defined order using the static priority constants. If a listener encounters a failure, it can call `failed(boolean, String)` to signal the failure and optionally request server shutdown.

### Static Constants

| Constant | Type | Value | Description |
|----------|------|-------|-------------|
| `PRIORITY_LOAD_COMMON` | `short` | `-32` | Priority for loading common assets |
| `PRIORITY_LOAD_REGISTRY` | `short` | `-16` | Priority for loading registry assets |
| `PRIORITY_LOAD_LATE` | `short` | `64` | Priority for late-stage asset loading |

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `bootStart` | `long` | `getBootStart()` | No | No |
| `reasons` | `List<String>` | `getReasons()` | No | No |
| `shouldShutdown` | `boolean` | `isShouldShutdown()` | Yes | No |

- **bootStart** -- Timestamp of when the server boot started.
- **reasons** -- List of failure reason strings accumulated during the asset loading phase. Initially empty.
- **shouldShutdown** -- Whether the server should shut down due to asset loading failures. Mutable indirectly via `failed(boolean, String)`.

## Methods

### `failed(boolean shouldShutdown, String reason)`

Signals that an asset loading failure occurred. The `shouldShutdown` flag is OR-ed with the existing value (once true, stays true). The `reason` string is added to the reasons list.

## Fired By

- `HytaleServer.boot()` (lines 333-334) via `dispatchFor(LoadAssetEvent.class).dispatch(new LoadAssetEvent(...))` -- Server boot lifecycle, during asset loading phase.

## Listening

```java
// Load common assets early
getEventRegistry().register(LoadAssetEvent.PRIORITY_LOAD_COMMON, LoadAssetEvent.class, event -> {
    try {
        loadCommonAssets();
    } catch (Exception e) {
        event.failed(true, "Failed to load common assets: " + e.getMessage());
    }
});

// Load registry assets at standard priority
getEventRegistry().register(LoadAssetEvent.PRIORITY_LOAD_REGISTRY, LoadAssetEvent.class, event -> {
    loadRegistryAssets();
});
```

## Related Events

- [`BootEvent`](./BootEvent.md) -- Fired later in the boot sequence after asset loading completes.
- [`AssetPackRegisterEvent`](./AssetPackRegisterEvent.md) -- Fired when individual asset packs are registered.
