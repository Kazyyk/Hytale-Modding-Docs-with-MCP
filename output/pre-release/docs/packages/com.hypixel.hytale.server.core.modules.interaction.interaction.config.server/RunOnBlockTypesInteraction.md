---
title: "RunOnBlockTypesInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.RunOnBlockTypesInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class RunOnBlockTypesInteraction extends SimpleInteraction
```

Searches for matching block types within a spherical radius around the entity and runs a configured interaction chain on each found block, up to a maximum count. Uses reservoir sampling to select blocks when more matches are found than the maximum allows. Waits for all forked interaction chains to complete, succeeding if any chain succeeded.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Range` | `int` | Yes (inherited) | -- | The spherical radius to search for matching block types. Must be > 0. |
| `BlockSets` | `String[]` | Yes (inherited) | `[]` | Array of BlockSet IDs to match within the search radius. |
| `MaxCount` | `int` | Yes (inherited) | -- | Maximum number of block positions to select. Must be > 0. Uses reservoir sampling when more matches exist. |
| `Interactions` | `String` (root interaction ref) | Yes (inherited) | `null` | The interaction chain to run on each found block. Can be defined inline or as a reference. |

## Constants

| Name | Type | Value |
|---|---|---|
| `EMPTY_BLOCKSETS` | `String[]` | `{}` |

## Methods

```java
@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()
```

Returns `WaitForDataFrom.Server`.

```java
@Override
protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

On first run: searches for blocks, forks interaction chains for each selected position. On subsequent ticks: polls forked chains for completion, succeeds if any finished, fails if all failed.

```java
@Override
public void compile(@Nonnull OperationsBuilder builder)
```

Compiles with optional next/failed labels.

```java
@Override
public boolean needsRemoteSync()
```

Returns `true`.

```java
@Nonnull
@Override
protected com.hypixel.hytale.protocol.Interaction generatePacket()
```

Returns a new `com.hypixel.hytale.protocol.SimpleInteraction` packet.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- `BlockSetModule` -- resolves block set IDs to block ID sets
- `InteractionChain` -- represents a forked interaction chain
