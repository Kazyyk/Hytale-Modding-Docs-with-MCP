---
title: "RequestServerAccess"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.serveraccess"
fqcn: "com.hypixel.hytale.protocol.packets.serveraccess.RequestServerAccess"
api_surface: false
extends: ~
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "protocol"
  - "packets"
  - "serveraccess"
  - "class"
---

**Package:** `com.hypixel.hytale.protocol.packets.serveraccess`

```java
public class RequestServerAccess implements Packet, ToClientPacket
```

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
| `@Nonnull public` | `Access` | `access` |
| `public` | `short` | `externalPort` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `RequestServerAccess()` |
| `public` | `RequestServerAccess(@Nonnull Access access, short externalPort)` |
| `public` | `RequestServerAccess(@Nonnull RequestServerAccess other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getId()` |
| `@Override public` | `NetworkChannel` | `getChannel()` |
| `@Nonnull public static` | `RequestServerAccess` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `public` | `RequestServerAccess` | `clone()` |
| `@Override public` | `boolean` | `equals(Object obj)` |
| `@Override public` | `int` | `hashCode()` |
