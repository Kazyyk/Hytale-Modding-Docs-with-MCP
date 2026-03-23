# Bench

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.Bench>

Abstract base for all bench types (crafting stations). Contains bench ID, descriptive label, tier levels, and sound event IDs for open/close/complete/fail/upgrade actions. Uses `ObjectCodecMapCodec` with `BenchType` discriminator for polymorphic deserialization. Inner class `BenchSlot` defines an icon for a bench slot.
