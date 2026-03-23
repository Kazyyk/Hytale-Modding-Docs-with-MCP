# BlockType

Type: class | Package: com.hypixel.hytale.protocol

public class BlockType

Comprehensive block type definition containing all rendering, physics, gameplay, and metadata properties for a block in the game world.

## Fields

- String item
- String name
- boolean unknown
- DrawType drawType
- BlockMaterial material
- Opacity opacity
- ShaderType`[] shaderEffect
- int hitbox
- int interactionHitbox
- String model
- ModelTexture`[] modelTexture
- float modelScale
- String modelAnimation
- boolean looping
- int maxSupportDistance
- BlockSupportsRequiredForType blockSupportsRequiredFor
- Map``<``BlockNeighbor, RequiredBlockFaceSupport[]``> support
- Map``<``BlockNeighbor, BlockFaceSupport[]``> supporting
- boolean requiresAlphaBlending
- BlockTextures`[] cubeTextures
- String cubeSideMaskTexture
- ShadingMode cubeShadingMode
- RandomRotation randomRotation
- VariantRotation variantRotation
- Rotation rotationYawPlacementOffset
- int blockSoundSetIndex
- int ambientSoundEventIndex
- ModelParticle`[] particles
- String blockParticleSetId
- String blockBreakingDecalId
- Color particleColor
- ColorLight light
- Tint tint
- Tint biomeTint
- int group
- String transitionTexture
- int``[] transitionToGroups
- BlockMovementSettings movementSettings
- BlockFlags flags
- String interactionHint
- BlockGathering gathering
- BlockPlacementSettings placementSettings
- ModelDisplay display
- RailConfig rail
- boolean ignoreSupportWhenPlaced
- Map<`InteractionType`, ``Integer``> interactions
- Map<``String``, ``Integer``> states
- int transitionToTag
- int``[] tagIndexes
- Bench bench
- ConnectedBlockRuleSet connectedBlockRuleSet

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 4
- FIXED_BLOCK_SIZE | 164
- VARIABLE_FIELD_COUNT | 24
- VARIABLE_BLOCK_START | 260
- MAX_SIZE | 1,677,721,600

Binary layout: 4 null-bit bytes + 164 bytes of fixed fields + 24 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockType deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockType` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockType` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockType` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockTextures
- BlockFlags
- BlockMaterial
- DrawType
- BlockMovementSettings
- BlockGathering
- BlockPlacementSettings
- BlockMount
- BlockParticleSet
- ColorLight
- Hitbox
- BlockRotation
- BlockBreakingDecal
