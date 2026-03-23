# BenchTierLevel

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BenchTierLevel>

public class BenchTierLevel implements NetworkSerializable<com.hypixel.hytale.protocol.BenchTierLevel>

Defines a single tier level of a crafting bench with an unlock interaction.

## Constants

- BuilderCodec<BenchTierLevel> CODEC

## Key Methods

- public float getCraftingTimeReductionModifier()
- public BenchUpgradeRequirement getUpgradeRequirement()
- public int getExtraInputSlot()
- public int getExtraOutputSlot()
- public com.hypixel.hytale.protocol.BenchTierLevel toPacket()
