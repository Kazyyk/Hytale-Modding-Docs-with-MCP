# ItemBase

Type: class | Package: com.hypixel.hytale.protocol

public class ItemBase

Comprehensive item type definition containing all identity, visual, category, tool/weapon/armor/glider/utility specializations, interaction configuration, and durability properties.

## Fields

- String id
- String model
- float scale
- String texture
- String animation
- String playerAnimationsId
- boolean usePlayerAnimations
- int maxStack
- int reticleIndex
- String icon
- AssetIconProperties iconProperties
- ItemTranslationProperties translationProperties
- int itemLevel
- int qualityIndex
- ItemResourceType`[] resourceTypes
- boolean consumable
- boolean variant
- int blockId
- ItemTool tool
- ItemWeapon weapon
- ItemArmor armor
- ItemGlider gliderConfig
- ItemUtility utility
- BlockSelectorToolData blockSelectorTool
- ItemBuilderToolData builderToolData
- ItemEntityConfig itemEntity
- String set
- String``[] categories
- ModelParticle`[] particles
- ModelParticle`[] firstPersonParticles
- ModelTrail`[] trails
- ColorLight light
- double durability
- int soundEventIndex
- int itemSoundSetIndex
- Map<`InteractionType`, ``Integer``> interactions
- Map<``String``, ``Integer``> interactionVars
- InteractionConfiguration interactionConfig
- String droppedItemAnimation
- int``[] tagIndexes
- Map``<``Integer, ItemAppearanceCondition[]``> itemAppearanceConditions
- int``[] displayEntityStatsHUD
- ItemPullbackConfiguration pullbackConfig
- boolean clipsGeometry
- boolean renderDeployablePreview

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 4
- FIXED_BLOCK_SIZE | 147
- VARIABLE_FIELD_COUNT | 26
- VARIABLE_BLOCK_START | 251
- MAX_SIZE | 1,677,721,600

Binary layout: 4 null-bit bytes + 147 bytes of fixed fields + 26 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemBase deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemBase` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemBase` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemBase` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemTool
- ItemWeapon
- ItemArmor
- ItemGlider
- ItemUtility
- ItemBuilderToolData
- BlockSelectorToolData
- AssetIconProperties
- ItemTranslationProperties
- ItemEntityConfig
- ItemCategory
- ItemResourceType
- ItemAppearanceCondition
- InteractionConfiguration
