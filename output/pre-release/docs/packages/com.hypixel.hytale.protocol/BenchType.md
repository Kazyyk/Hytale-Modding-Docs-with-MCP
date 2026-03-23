---
title: "BenchType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BenchType"
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
public enum BenchType
```

Identifies the category of crafting bench.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Crafting` | 0 | Standard item crafting (grid-based). |
| `Processing` | 1 | Material processing (smelting, refining). |
| `DiagramCrafting` | 2 | Diagram/blueprint-based crafting. |
| `StructuralCrafting` | 3 | Building/structural piece crafting. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BenchType` constant.

```java
public static BenchType fromValue(int value)
```

Returns the `BenchType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BenchRequirement](BenchRequirement.md)
- [Bench](Bench.md)
