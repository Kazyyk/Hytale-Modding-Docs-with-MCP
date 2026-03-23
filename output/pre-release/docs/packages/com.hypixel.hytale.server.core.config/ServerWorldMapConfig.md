---
title: "ServerWorldMapConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.ServerWorldMapConfig"
api_surface: false
extends: "WorldMapConfig"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "config"
  - "worldmap"
---

**Package:** `com.hypixel.hytale.server.core.config`

```java
public final class ServerWorldMapConfig extends WorldMapConfig
```

Server-level world map configuration. Extends [WorldMapConfig](WorldMapConfig.md) with server defaults: minimum view radius of 1, maximum view radius of 512. Changes propagate to `HytaleServerConfig` via the `markChanged()` mechanism.

## Methods

```java
public void setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
```

Associates this config with a server config for change tracking.

```java
@Override
public int getDefaultViewRadiusMin()
```

Returns `1`.

```java
@Override
public int getDefaultViewRadiusMax()
```

Returns `512`.

## Related Types

- [WorldMapConfig](WorldMapConfig.md) -- abstract base class
- [WorldWorldMapConfig](WorldWorldMapConfig.md) -- per-world variant
- `HytaleServerConfig` -- owns this config
