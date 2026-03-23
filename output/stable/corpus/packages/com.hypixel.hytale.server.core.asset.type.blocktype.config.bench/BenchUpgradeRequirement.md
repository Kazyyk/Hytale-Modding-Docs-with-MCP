# BenchUpgradeRequirement

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BenchUpgradeRequirement>

public class BenchUpgradeRequirement implements NetworkSerializable<com.hypixel.hytale.protocol.BenchUpgradeRequirement>

Specifies an item requirement for upgrading a bench to the next tier.

## Constants

- BuilderCodec<BenchUpgradeRequirement> CODEC

## Key Methods

- public MaterialQuantity[] getInput()
- public float getTimeSeconds()
- public String toString()
- public com.hypixel.hytale.protocol.BenchUpgradeRequirement toPacket()
