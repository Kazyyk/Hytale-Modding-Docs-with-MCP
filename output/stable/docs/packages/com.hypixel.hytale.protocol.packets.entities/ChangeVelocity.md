---
title: "ChangeVelocity"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.entities"
fqcn: "com.hypixel.hytale.protocol.packets.entities.ChangeVelocity"
api_surface: false
extends: null
implements:
  - "Packet"
  - "ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "protocol"
  - "packets"
---
**Package:** `com.hypixel.hytale.protocol.packets.entities`

```java
public class ChangeVelocity implements Packet, ToClientPacket
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `PACKET_ID` | `163` |
| `public static final` | `boolean` | `IS_COMPRESSED` | `false` |
| `public static final` | `int` | `NULLABLE_BIT_FIELD_SIZE` | `1` |
| `public static final` | `int` | `FIXED_BLOCK_SIZE` | `35` |
| `public static final` | `int` | `VARIABLE_FIELD_COUNT` | `0` |
| `public static final` | `int` | `VARIABLE_BLOCK_START` | `35` |
| `public static final` | `int` | `MAX_SIZE` | `35` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `PACKET_ID` |
| `public static final` | `boolean` | `IS_COMPRESSED` |
| `public static final` | `int` | `NULLABLE_BIT_FIELD_SIZE` |
| `public static final` | `int` | `FIXED_BLOCK_SIZE` |
| `public static final` | `int` | `VARIABLE_FIELD_COUNT` |
| `public static final` | `int` | `VARIABLE_BLOCK_START` |
| `public static final` | `int` | `MAX_SIZE` |
| `public` | `float` | `x` |
| `public` | `float` | `y` |
| `public` | `float` | `z` |
| `public` | `ChangeVelocityType` | `changeType` |
| `public` | `VelocityConfig` | `config` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getId()` |
| `public` | `NetworkChannel` | `getChannel()` |
| `public` | `` | `ChangeVelocity()` |
| `public` | `` | `ChangeVelocity(float x, float y, float z, @Nonnull ChangeVelocityType changeType, @Nullable VelocityConfig config)` |
| `public` | `` | `ChangeVelocity(@Nonnull ChangeVelocity other)` |
| `public static` | `ChangeVelocity` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `public` | `ChangeVelocity` | `clone()` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
