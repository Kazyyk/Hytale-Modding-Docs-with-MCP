---
title: "MouseButtonType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MouseButtonType"
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
public enum MouseButtonType
```

Enum with 5 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Left` | 0 | Left mouse button. |
| `Middle` | 1 | Middle mouse button (scroll wheel click). |
| `Right` | 2 | Right mouse button. |
| `X1` | 3 | Extra mouse button 1 (back/side). |
| `X2` | 4 | Extra mouse button 2 (forward/side). |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MouseButtonType` constant.

```java
public static MouseButtonType fromValue(int value)
```

Returns the `MouseButtonType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
