---
title: "BlockSoundEvent"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockSoundEvent"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum BlockSoundEvent
```

Identifies the type of block interaction that triggers a sound.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Walk` | 0 |  |
| `Land` | 1 |  |
| `MoveIn` | 2 |  |
| `MoveOut` | 3 |  |
| `Hit` | 4 |  |
| `Break` | 5 |  |
| `Build` | 6 |  |
| `Clone` | 7 |  |
| `Harvest` | 8 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BlockSoundEvent` constant.

```java
public static BlockSoundEvent fromValue(int value)
```

Returns the `BlockSoundEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`8`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockSoundSet](BlockSoundSet.md)
