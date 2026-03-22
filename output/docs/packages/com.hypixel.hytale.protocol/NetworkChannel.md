---
title: "NetworkChannel"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.NetworkChannel"
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
public enum NetworkChannel
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Default` | 0 | Primary channel for most packets. |
| `Chunks` | 1 | Dedicated channel for chunk data transfer. |
| `WorldMap` | 2 | Channel for world map updates. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `NetworkChannel` constant.

```java
public static NetworkChannel fromValue(int value)
```

Returns the `NetworkChannel` constant for the given wire value. Throws `IllegalArgumentException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
