---
title: "BuilderToolsPlugin.BuilderToolsConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.BuilderToolsConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "configuration"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class BuilderToolsConfig
```

Configuration class for the builder tools plugin, loaded from the `"BuilderToolsModule"` config file. Serialized via `BuilderCodec`.

## Codec

```java
public static final BuilderCodec<BuilderToolsPlugin.BuilderToolsConfig> CODEC
```

Defines two configuration fields:

| Key | Type | Default | Validation | Description |
|---|---|---|---|---|
| `HistoryCount` | `int` | `50` | None | The number of builder tool edit operations to keep in the undo/redo history. |
| `ToolExpireTime` | `long` | `3600` | >= 0 | The minimum time (in seconds) that a user's builder tool data will be persisted for after they disconnect from the server. If set to zero the player's data is removed immediately on disconnect. |

## Fields

```java
private int historyCount = 50
```

```java
private long toolExpireTime = 3600L
```

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- loads and applies this configuration during `start()`
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- uses `historyCount` to limit undo/redo queue size
