---
title: "UpdateServerAccess"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.serveraccess"
fqcn: "com.hypixel.hytale.protocol.packets.serveraccess.UpdateServerAccess"
api_surface: false
extends: ~
implements: ["Packet", "ToServerPacket"]
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
public class UpdateServerAccess implements Packet, ToServerPacket
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
| `@Nullable public` | `HostAddress[]` | `hosts` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UpdateServerAccess()` |
| `public` | `UpdateServerAccess(@Nonnull Access access, @Nullable HostAddress[] hosts)` |
| `public` | `UpdateServerAccess(@Nonnull UpdateServerAccess other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getId()` |
| `@Override public` | `NetworkChannel` | `getChannel()` |
| `@Nonnull public static` | `UpdateServerAccess` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
| `public` | `UpdateServerAccess` | `clone()` |
| `@Override public` | `boolean` | `equals(Object obj)` |
| `@Override public` | `int` | `hashCode()` |
