---
title: "ConditionalBlockSound"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.ConditionalBlockSound"
api_surface: true
extends: "java.lang.Object"
implements:
  - "NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "blocktype"
  - "sound"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config`

```java
public class ConditionalBlockSound implements NetworkSerializable<com.hypixel.hytale.protocol.ConditionalBlockSound>
```

Associates a sound event with an ambience FX condition for block types. When the condition is met, the referenced sound event plays. Configured via JSON with validated asset references for both the sound event and ambience FX.

## Fields

| Field | Type | Description |
|---|---|---|
| `soundEventId` | `String` | Asset key of the sound event to play |
| `ambienceFXId` | `String` | Asset key of the ambience FX condition |

## Methods

```java
@Nonnull
public com.hypixel.hytale.protocol.ConditionalBlockSound toPacket()
```

Converts this asset to its protocol representation using resolved asset indices.

```java
public String getSoundEventId()
```

Returns the sound event asset key.

```java
public String getAmbienceFXId()
```

Returns the ambience FX asset key.

## Related Types

- [BlockType](BlockType.md) -- uses this for conditional block sounds
- `SoundEvent` -- the referenced sound event asset
