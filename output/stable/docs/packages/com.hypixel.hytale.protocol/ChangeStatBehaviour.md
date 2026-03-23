---
title: "ChangeStatBehaviour"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChangeStatBehaviour"
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
public enum ChangeStatBehaviour
```

Determines whether a stat change adds to or sets the current value.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Add` | 0 |  |
| `Set` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ChangeStatBehaviour` constant.

```java
public static ChangeStatBehaviour fromValue(int value)
```

Returns the `ChangeStatBehaviour` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ChangeStatInteraction](ChangeStatInteraction.md)
