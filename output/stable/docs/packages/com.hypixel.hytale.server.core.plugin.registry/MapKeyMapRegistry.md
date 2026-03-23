---
title: "MapKeyMapRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.registry"
fqcn: "com.hypixel.hytale.server.core.plugin.registry.MapKeyMapRegistry"
api_surface: true
extends: ~
implements:
  - "IRegistry"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "registry"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.plugin.registry`

```java
public class MapKeyMapRegistry<V> implements IRegistry
```

Plugin registry for registering entries into a `MapKeyMapCodec`. Maps a class, string ID, and codec together. The unregister callback acquires the global asset write lock and only runs during non-shutdown unloads.

## Constructors

| Constructor | Description |
|---|---|
| `MapKeyMapRegistry(List<BooleanConsumer> unregister, MapKeyMapCodec<V> mapCodec)` | Creates a registry backed by the given codec map and unregister list. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `register(@Nonnull Class<T> tClass, @Nonnull String id, @Nonnull Codec<T> codec)` | `MapKeyMapRegistry<V>` | Registers a class-ID-codec triple with an unregister callback. |
| `shutdown()` | `void` | No-op shutdown hook. |
