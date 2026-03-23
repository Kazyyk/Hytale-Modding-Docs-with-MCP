---
title: "ChangeVelocityType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChangeVelocityType"
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
public enum ChangeVelocityType
```

Determines whether velocity modification adds to or replaces current velocity.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Add` | 0 |  |
| `Set` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ChangeVelocityType` constant.

```java
public static ChangeVelocityType fromValue(int value)
```

Returns the `ChangeVelocityType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
