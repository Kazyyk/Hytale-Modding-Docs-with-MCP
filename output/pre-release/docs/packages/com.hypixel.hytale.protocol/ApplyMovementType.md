---
title: "ApplyMovementType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ApplyMovementType"
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
public enum ApplyMovementType
```

Determines how movement is applied to an entity: through the character controller physics or direct position assignment.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `CharacterController` | 0 |  |
| `Position` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ApplyMovementType` constant.

```java
public static ApplyMovementType fromValue(int value)
```

Returns the `ApplyMovementType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
