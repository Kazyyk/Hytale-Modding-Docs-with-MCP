---
title: "Cosmetic"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Cosmetic"
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
public enum Cosmetic
```

Identifies cosmetic equipment slots for character customization.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Haircut` | 0 | Hair style. |
| `FacialHair` | 1 | Beard, mustache, or other facial hair. |
| `Undertop` | 2 | Inner torso layer (shirt, undershirt). |
| `Overtop` | 3 | Outer torso layer (jacket, vest). |
| `Pants` | 4 | Lower body inner layer. |
| `Overpants` | 5 | Lower body outer layer (skirt, chaps). |
| `Shoes` | 6 | Footwear. |
| `Gloves` | 7 | Hand coverings. |
| `Cape` | 8 | Back-attached cape or cloak. |
| `HeadAccessory` | 9 | Head decoration (hat, crown, horns). |
| `FaceAccessory` | 10 | Face decoration (glasses, mask). |
| `EarAccessory` | 11 | Ear decoration (earrings). |
| `Ear` | 12 | Ear shape/style. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `Cosmetic` constant.

```java
public static Cosmetic fromValue(int value)
```

Returns the `Cosmetic` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`12`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ItemArmor](ItemArmor.md)
