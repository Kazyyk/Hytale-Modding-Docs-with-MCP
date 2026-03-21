---
title: "CodecMapRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.registry"
fqcn: "com.hypixel.hytale.server.core.plugin.registry.CodecMapRegistry"
api_surface: true
extends: ~
implements:
  - "IRegistry"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "registry"
  - "plugin"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.core.plugin.registry`

```java
public class CodecMapRegistry<T, C extends Codec<? extends T>> implements IRegistry
```

Plugin registry for registering codec entries into a `StringCodecMapCodec`. Each registration maps a string ID and class to a codec, with an unregister callback that acquires the global asset write lock during cleanup. Supports optional `Priority` for ordering. Contains the inner `Assets` subclass for `JsonAsset`-specific registration using `BuilderCodec`.

## Constructors

| Constructor | Description |
|---|---|
| `CodecMapRegistry(List<BooleanConsumer> unregister, StringCodecMapCodec<T, C> mapCodec)` | Creates a registry backed by the given codec map and unregister list. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `register(String id, Class<? extends T> aClass, C codec)` | `CodecMapRegistry<T, C>` | Registers a codec entry by ID and class. |
| `register(@Nonnull Priority priority, @Nonnull String id, Class<? extends T> aClass, C codec)` | `CodecMapRegistry<T, C>` | Registers with explicit priority ordering. |
| `shutdown()` | `void` | No-op shutdown hook. |

## Inner Classes

| Class | Description |
|---|---|
| `Assets<T, C>` | Subclass for `JsonAsset`-typed registrations using `AssetCodecMapCodec` and `BuilderCodec`. |
