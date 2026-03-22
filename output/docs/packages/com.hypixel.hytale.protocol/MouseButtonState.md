---
title: "MouseButtonState"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MouseButtonState"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
  - "input"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum MouseButtonState
```

Enum with 2 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Pressed` | 0 | The button is pressed down. |
| `Released` | 1 | The button has been released. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MouseButtonState` constant.

```java
public static MouseButtonState fromValue(int value)
```

Returns the `MouseButtonState` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
