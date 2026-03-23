---
title: "BlockParticleEvent"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockParticleEvent"
api_surface: true
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
public enum BlockParticleEvent
```

Identifies the type of interaction that triggers block particles.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Walk` | 0 |  |
| `Run` | 1 |  |
| `Sprint` | 2 |  |
| `SoftLand` | 3 |  |
| `HardLand` | 4 |  |
| `MoveOut` | 5 |  |
| `Hit` | 6 |  |
| `Break` | 7 |  |
| `Build` | 8 |  |
| `Physics` | 9 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BlockParticleEvent` constant.

```java
public static BlockParticleEvent fromValue(int value)
```

Returns the `BlockParticleEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`9`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockParticleSet](BlockParticleSet.md)
