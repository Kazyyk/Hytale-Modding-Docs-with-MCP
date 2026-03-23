---
title: "ClickType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ClickType"
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
public enum ClickType
```

Identifies mouse button click types.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 |  |
| `Left` | 1 |  |
| `Right` | 2 |  |
| `Middle` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ClickType` constant.

```java
public static ClickType fromValue(int value)
```

Returns the `ClickType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [InteractionSyncData](InteractionSyncData.md)
