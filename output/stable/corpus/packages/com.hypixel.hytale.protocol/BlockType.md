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

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static BlockType deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BlockType clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String item
public String name
public boolean unknown
public DrawType drawType
public BlockMaterial material
public Opacity opacity
public ShaderType[] shaderEffect
public int hitbox
public int interactionHitbox
public String model
public ModelTexture[] modelTexture
public float modelScale
public String modelAnimation
public boolean looping
public int maxSupportDistance
public BlockSupportsRequiredForType blockSupportsRequiredFor
public Map<BlockNeighbor,RequiredBlockFaceSupport[]> support
public Map<BlockNeighbor,BlockFaceSupport[]> supporting
public boolean requiresAlphaBlending
public BlockTextures[] cubeTextures
public String cubeSideMaskTexture
public ShadingMode cubeShadingMode
public RandomRotation randomRotation
public VariantRotation variantRotation
public Rotation rotationYawPlacementOffset
public int blockSoundSetIndex
public int ambientSoundEventIndex
public ModelParticle[] particles
public String blockParticleSetId
public String blockBreakingDecalId
public Color particleColor
public ColorLight light
public Tint tint
public Tint biomeTint
public int group
public String transitionTexture
public int[] transitionToGroups
public BlockMovementSettings movementSettings
public BlockFlags flags
public String interactionHint
public BlockGathering gathering
public BlockPlacementSettings placementSettings
public ModelDisplay display
public RailConfig rail
public boolean ignoreSupportWhenPlaced
public Map<InteractionType,Integer> interactions
public Map<String,Integer> states
public int transitionToTag
public int[] tagIndexes
public Bench bench
public ConnectedBlockRuleSet connectedBlockRuleSet
