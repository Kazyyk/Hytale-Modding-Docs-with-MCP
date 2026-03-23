---
title: "InventoryActionType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InventoryActionType"
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
public enum InventoryActionType
```

Identifies batch inventory operations.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `TakeAll` | 0 |  |
| `PutAll` | 1 |  |
| `QuickStack` | 2 |  |
| `Sort` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `InventoryActionType` constant.

```java
public static InventoryActionType fromValue(int value)
```

Returns the `InventoryActionType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
