---
title: "PickupLocation"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PickupLocation"
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
public enum PickupLocation
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Hotbar` | 0 | Pick up into the hotbar. |
| `Storage` | 1 | Pick up into storage/inventory. |
| `Backpack` | 2 | Pick up into the backpack. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `PickupLocation` constant.

```java
public static PickupLocation fromValue(int value)
```

Returns the `PickupLocation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
