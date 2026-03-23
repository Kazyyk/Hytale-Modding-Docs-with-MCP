---
title: "MountController"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MountController"
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
public enum MountController
```

Enum with 2 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Minecart` | 0 | Rail-based minecart controller. |
| `BlockMount` | 1 | Static block-based mount controller. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MountController` constant.

```java
public static MountController fromValue(int value)
```

Returns the `MountController` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
