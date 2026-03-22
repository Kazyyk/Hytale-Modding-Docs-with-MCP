---
title: "AttachedToType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AttachedToType"
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
public enum AttachedToType
```

Specifies what an effect or visual element is attached to in the scene.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `LocalPlayer` | 0 |  |
| `EntityId` | 1 |  |
| `None` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `AttachedToType` constant.

```java
public static AttachedToType fromValue(int value)
```

Returns the `AttachedToType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
