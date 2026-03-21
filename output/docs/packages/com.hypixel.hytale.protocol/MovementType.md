---
title: "MovementType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MovementType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
  - "movement"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum MovementType
```

Enum with 13 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No movement state. |
| `Idle` | 1 | Standing still. |
| `Crouching` | 2 | Crouching/sneaking. |
| `Walking` | 3 | Walking at normal speed. |
| `Running` | 4 | Running. |
| `Sprinting` | 5 | Sprinting at maximum speed. |
| `Climbing` | 6 | Climbing a surface. |
| `Swimming` | 7 | Swimming in fluid. |
| `Flying` | 8 | Flying through the air. |
| `Sliding` | 9 | Sliding on a surface. |
| `Rolling` | 10 | Rolling. |
| `Mounting` | 11 | Riding a mount at normal speed. |
| `SprintMounting` | 12 | Riding a mount at sprint speed. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MovementType` constant.

```java
public static MovementType fromValue(int value)
```

Returns the `MovementType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`12`). The static `VALUES` array is used for O(1) lookup by ordinal.
