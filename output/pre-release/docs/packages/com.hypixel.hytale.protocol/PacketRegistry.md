---
title: "PacketRegistry"
kind: "final class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PacketRegistry"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public final class PacketRegistry
```

Static registry of all 268 packet types. Maps packet ID to PacketInfo (id, name, channel, type, fixedBlockSize, maxSize, compressed, validate, deserialize). Provides lookup by ID or class. Inner record PacketInfo and enum PacketDirection (ToServer, ToClient, Both).

## Overview

Static registry of all 268 packet types across 14 sub-packages. Maps packet ID to `PacketInfo` records containing id, name, channel, type, fixed block size, max size, compression flag, validation function, and deserializer.

## Inner Types

### PacketInfo

Record holding metadata for a registered packet: `id`, `name`, `channel`, `type` (class), `fixedBlockSize`, `maxSize`, `compressed`, `validate` (function), `deserialize` (function).

### PacketDirection

Enum with values `ToServer`, `ToClient`, `Both`.
