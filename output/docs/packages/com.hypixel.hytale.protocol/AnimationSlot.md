---
title: "AnimationSlot"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AnimationSlot"
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
public enum AnimationSlot
```

Identifies the animation layer/slot for concurrent animation playback. Each slot can play one animation independently.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Movement` | 0 | Locomotion animations (walk, run, idle). |
| `Status` | 1 | Status condition animations (stunned, burning). |
| `Action` | 2 | Combat and tool use animations (swing, cast). |
| `Face` | 3 | Facial expression animations. |
| `Emote` | 4 | Player emote animations. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `AnimationSlot` constant.

```java
public static AnimationSlot fromValue(int value)
```

Returns the `AnimationSlot` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [Animation](Animation.md)
- [ActiveAnimationsUpdate](ActiveAnimationsUpdate.md)
