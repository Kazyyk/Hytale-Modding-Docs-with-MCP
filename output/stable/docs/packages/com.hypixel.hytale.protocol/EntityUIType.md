---
title: "EntityUIType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityUIType"
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
public enum EntityUIType
```

Identifies the type of entity UI overlay.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `EntityStat` | 0 |  |
| `CombatText` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EntityUIType` constant.

```java
public static EntityUIType fromValue(int value)
```

Returns the `EntityUIType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [EntityUIComponent](EntityUIComponent.md)
