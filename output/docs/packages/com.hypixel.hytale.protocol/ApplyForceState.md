---
title: "ApplyForceState"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ApplyForceState"
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
public enum ApplyForceState
```

Tracks the resolution state of an ApplyForceInteraction, indicating what terminated the force application.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Waiting` | 0 |  |
| `Ground` | 1 |  |
| `Collision` | 2 |  |
| `Timer` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ApplyForceState` constant.

```java
public static ApplyForceState fromValue(int value)
```

Returns the `ApplyForceState` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ApplyForceInteraction](ApplyForceInteraction.md)
- [InteractionSyncData](InteractionSyncData.md)
