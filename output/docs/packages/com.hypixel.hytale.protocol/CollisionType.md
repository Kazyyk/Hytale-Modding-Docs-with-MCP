---
title: "CollisionType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CollisionType"
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
public enum CollisionType
```

Distinguishes between hard (blocking) and soft (overlapping) collision types.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Hard` | 0 |  |
| `Soft` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `CollisionType` constant.

```java
public static CollisionType fromValue(int value)
```

Returns the `CollisionType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
