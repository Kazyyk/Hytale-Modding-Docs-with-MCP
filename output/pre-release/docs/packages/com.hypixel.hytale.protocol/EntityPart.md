---
title: "EntityPart"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityPart"
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
public enum EntityPart
```

Identifies a component part of an entity for targeting purposes.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Self` | 0 |  |
| `Entity` | 1 |  |
| `PrimaryItem` | 2 |  |
| `SecondaryItem` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EntityPart` constant.

```java
public static EntityPart fromValue(int value)
```

Returns the `EntityPart` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
