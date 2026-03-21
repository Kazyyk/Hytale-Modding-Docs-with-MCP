---
title: "LoopOption"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.LoopOption"
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
public enum LoopOption
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `PlayOnce` | 0 | Play the animation/effect once and stop. |
| `Loop` | 1 | Repeat the animation/effect continuously. |
| `LoopMirror` | 2 | Repeat the animation/effect with alternating direction. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `LoopOption` constant.

```java
public static LoopOption fromValue(int value)
```

Returns the `LoopOption` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
