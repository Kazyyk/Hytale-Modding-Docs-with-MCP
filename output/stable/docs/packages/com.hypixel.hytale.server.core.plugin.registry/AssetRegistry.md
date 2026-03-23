---
title: "AssetRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.registry"
fqcn: "com.hypixel.hytale.server.core.plugin.registry.AssetRegistry"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "registry"
  - "plugin"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.plugin.registry`

```java
public class AssetRegistry
```

Registry for registering `AssetStore` instances with the global `AssetRegistry`. Tracks unregister callbacks for cleanup during plugin shutdown. Used by plugins to register custom asset types.

## Constructors

| Constructor | Description |
|---|---|
| `AssetRegistry(List<BooleanConsumer> unregister)` | Creates a registry backed by the given unregister callback list. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `register(@Nonnull S assetStore)` | `AssetRegistry` | Registers an asset store and records an unregister callback. Returns this for chaining. |
| `shutdown()` | `void` | No-op shutdown hook. |
