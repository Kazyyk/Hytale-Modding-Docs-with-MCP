# PacketRegistry

Type: final class | Package: com.hypixel.hytale.protocol

public final class PacketRegistry

Static registry of all 268 packet types. Maps packet ID to PacketInfo (id, name, channel, type, fixedBlockSize, maxSize, compressed, validate, deserialize). Provides lookup by ID or class. Inner record PacketInfo and enum PacketDirection (ToServer, ToClient, Both).

## Overview

Static registry of all 268 packet types across 14 sub-packages. Maps packet ID to `PacketInfo` records containing id, name, channel, type, fixed block size, max size, compression flag, validation function, and deserializer.

## Inner Types

### PacketInfo

Record holding metadata for a registered packet: `id`, `name`, `channel`, `type` (class), `fixedBlockSize`, `maxSize`, `compressed`, `validate` (function), `deserialize` (function).

### PacketDirection

Enum with values `ToServer`, `ToClient`, `Both`.
