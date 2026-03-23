---
title: "PhysicsType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PhysicsType"
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
public enum PhysicsType
```

Enum with 1 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Standard` | 0 | Standard physics simulation. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `PhysicsType` constant.

```java
public static PhysicsType fromValue(int value)
```

Returns the `PhysicsType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`0`). The static `VALUES` array is used for O(1) lookup by ordinal.
