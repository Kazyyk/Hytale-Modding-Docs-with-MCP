---
title: "ChunkFlag"
kind: "enum"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.ChunkFlag"
api_surface: true
extends: ~
implements:
  - "Flag"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "flag"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public enum ChunkFlag implements Flag
```

Lifecycle and state flags for [WorldChunk](WorldChunk.md). Each flag occupies a single bit in a `Flags` bitfield.

## Enum Constants

| Constant | Description |
|---|---|
| `START_INIT` | Set when chunk initialization has begun. |
| `INIT` | Set when chunk initialization is complete. All flag-triggered behaviors are active. |
| `NEWLY_GENERATED` | Set when the chunk was freshly generated (not loaded from disk). |
| `ON_DISK` | Set when the chunk has been persisted to disk. |
| `TICKING` | Set when the chunk is actively ticking. Toggling this flag starts or stops the chunk's ECS ticking lifecycle. |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `ChunkFlag[]` | Cached array of all enum values. |

## Instance Methods

```java
@Override
public int mask()
```

Returns the bitmask for this flag (1 shifted left by ordinal).
