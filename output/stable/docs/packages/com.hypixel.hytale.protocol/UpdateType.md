---
title: "UpdateType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.UpdateType"
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
public enum UpdateType
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Init` | 0 | Initial full state. |
| `AddOrUpdate` | 1 | Add new or update existing. |
| `Remove` | 2 | Remove the entry. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `UpdateType` constant.

```java
public static UpdateType fromValue(int value)
```

Returns the `UpdateType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
