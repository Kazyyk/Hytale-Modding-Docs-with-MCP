---
title: "InteractionState"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionState"
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
public enum InteractionState
```

Tracks the execution state of an interaction.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Finished` | 0 |  |
| `Skip` | 1 |  |
| `ItemChanged` | 2 |  |
| `Failed` | 3 |  |
| `NotFinished` | 4 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `InteractionState` constant.

```java
public static InteractionState fromValue(int value)
```

Returns the `InteractionState` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [InteractionSyncData](InteractionSyncData.md)
