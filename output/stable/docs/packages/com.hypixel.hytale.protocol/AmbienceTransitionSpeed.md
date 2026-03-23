---
title: "AmbienceTransitionSpeed"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceTransitionSpeed"
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
public enum AmbienceTransitionSpeed
```

Controls the transition speed when switching between ambience effects.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Default` | 0 |  |
| `Fast` | 1 |  |
| `Instant` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `AmbienceTransitionSpeed` constant.

```java
public static AmbienceTransitionSpeed fromValue(int value)
```

Returns the `AmbienceTransitionSpeed` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [AmbienceFXAmbientBed](AmbienceFXAmbientBed.md)
