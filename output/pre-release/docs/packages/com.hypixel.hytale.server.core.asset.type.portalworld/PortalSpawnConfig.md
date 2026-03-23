---
title: "PortalSpawnConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.portalworld"
fqcn: "com.hypixel.hytale.server.core.asset.type.portalworld.PortalSpawnConfig"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "portal"
  - "spawn"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.portalworld`

```java
public class PortalSpawnConfig
```

Configures spawn behavior for portal world fragment instances. Controls whether a return portal block is placed at the spawn location, provides an optional spawn provider override, and allows overriding the return portal block type.

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `spawnReturnPortal` | `boolean` | `true` | Whether to spawn a return portal block at the fragment spawn |
| `spawnProviderOverride` | `ISpawnProvider` | `null` | Overrides the world's spawn provider for this portal type |
| `returnBlockId` | `String` | `null` | Overrides the block type used for the return portal |

## Methods

```java
public boolean isSpawningReturnPortal()
```

Returns whether a return portal block should be spawned.

```java
public ISpawnProvider getSpawnProviderOverride()
```

Returns the spawn provider override, or `null` if the world default should be used.

```java
public String getReturnBlockOverrideId()
```

Returns the return block type asset key override, or `null`.

```java
@Nullable
public BlockType getReturnBlockOverride()
```

Resolves and returns the override `BlockType` for the return portal, or `null` if not set.

## Related Types

- `PortalType` -- references this for spawn configuration
