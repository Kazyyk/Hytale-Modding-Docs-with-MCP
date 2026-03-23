# BlockType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: JsonAssetWithMap<String, BlockTypeAssetMap<String, BlockType>>, NetworkSerializable<com.hypixel.hytale.protocol.BlockType>

The central block type definition asset. Contains all configurable properties for a block in the game: material, textures, collision boxes, movement settings, gathering behavior, placement rules, support requirements, farming data, bench configuration, rotation variants, states, and more. Defined within Item assets, not standalone. This is the largest and most referenced type in the block system.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public static BlockType fromString(String input)
  public static AssetStore<String,BlockType,BlockTypeAssetMap<String,BlockType>> getAssetStore()
  public static BlockTypeAssetMap<String,BlockType> getAssetMap()
  public com.hypixel.hytale.protocol.BlockType toPacket()
  public String getId()
  public AssetExtraInfo.Data getData()
  public Item getItem()
  public boolean isState()
  public BlockType getBlockForState(String state)
  public String getBlockKeyForState(String state)
  public String getDefaultStateKey()
  public String getStateForBlock(BlockType blockType)
  public String getStateForBlock(String blockTypeKey)
  public boolean isUnknown()
  public String getGroup()
  public String getBlockSoundSetId()
  public int getBlockSoundSetIndex()
  public ModelParticle[] getParticles()
  public String getBlockParticleSetId()
  public String getBlockBreakingDecalId()
  public Color getParticleColor()
  public TickProcedure getTickProcedure()
  public RandomTickProcedure getRandomTickProcedure()
  public ShaderType[] getEffect()
  public BlockTypeTextures[] getTextures()
  public String getTextureSideMask()
  public CustomModelTexture[] getCustomModelTexture()
  public DrawType getDrawType()
  public BlockMaterial getMaterial()
  public Opacity getOpacity()
  public String getCustomModel()
  public float getCustomModelScale()
  public String getCustomModelAnimation()
  public Color[] getTintUp()
  public Color[] getTintDown()
  public Color[] getTintNorth()
  public Color[] getTintSouth()
  public Color[] getTintWest()
  public Color[] getTintEast()
  public int getBiomeTintUp()
  public int getBiomeTintDown()
  public int getBiomeTintNorth()
  public int getBiomeTintSouth()
  public int getBiomeTintWest()
  public int getBiomeTintEast()
  public ConnectedBlockRuleSet getConnectedBlockRuleSet()
  public BlockSupportsRequiredForType getBlockSupportsRequiredFor()
  public RandomRotation getRandomRotation()
  public VariantRotation getVariantRotation()
  public BlockFlipType getFlipType()
  public Rotation getRotationYawPlacementOffset()
  public RotatedMountPointsArray getSeats()
  public RotatedMountPointsArray getBeds()
  public String getTransitionTexture()
  public String[] getTransitionToGroups()
  public String getBlockListAssetId()
  public String getPrefabListAssetId()
  public String getHitboxType()
  public int getHitboxTypeIndex()
  public String getInteractionHitboxType()
  public int getInteractionHitboxTypeIndex()
  public ColorLight getLight()
  public BlockMovementSettings getMovementSettings()
  public BlockFlags getFlags()
  public String getInteractionHint()
  public boolean isTrigger()
  public int getDamageToEntities()
  public Bench getBench()
  public BlockGathering getGathering()
  public BlockPlacementSettings getPlacementSettings()
  public StateData getState()
  public Holder<ChunkStore> getBlockEntity()
  public String getAmbientSoundEventId()
  public int getAmbientSoundEventIndex()
  public String getInteractionSoundEventId()
  public int getInteractionSoundEventIndex()
  public boolean isLooping()
  public FarmingData getFarming()
  public SupportDropType getSupportDropType()
  public int getMaxSupportDistance()
  public boolean isFullySupportive()
  public Map<BlockFace,RequiredBlockFaceSupport[]> getSupport(int rotationIndex)
  public Map<BlockFace,BlockFaceSupport[]> getSupporting(int rotationIndex)
  public boolean hasSupport()
  public boolean isAllowsMultipleUsers()
  public Map<InteractionType,String> getInteractions()
  public RailConfig getRailConfig(int rotationIndex)
  public boolean isDoor()
  public boolean shouldIgnoreSupportWhenPlaced()
  public boolean canBePlacedAsDeco()
  protected void processConfig()
  public static BlockType getUnknownFor(String blockTypeKey)
  public void getBlockCenter(int rotationIndex, Vector3d outCenter)
  public String toString()
  public BlockType clone(String newKey)
  public static int getBlockIdOrUnknown(String blockTypeKey, String message, Object params)
  public static int getBlockIdOrUnknown(BlockTypeAssetMap<String,BlockType> assetMap, String blockTypeKey, String message, Object params)

Fields:
public static final AssetBuilderCodec<String,BlockType> CODEC
public static final String[] EMPTY_ALIAS_LIST
public static final ValidatorCache<String> VALIDATOR_CACHE
public static final String UNKNOWN_TEXTURE
public static final ModelTexture[] UNKNOWN_CUSTOM_MODEL_TEXTURE
public static final BlockTextures[] UNKNOWN_BLOCK_TEXTURES
public static final Map<BlockFace,RequiredBlockFaceSupport[]> REQUIRED_BOTTOM_FACE_SUPPORT
public static final BlockFaceSupport[] BLOCK_FACE_SUPPORT_ALL_ARRAY
public static final Map<BlockFace,BlockFaceSupport[]> ALL_SUPPORTING_FACES
public static final ShaderType[] DEFAULT_SHADER_EFFECTS
public static final BlockType DEFAULT_BLOCK_TYPE
public static final ISectionPalette.KeySerializer KEY_SERIALIZER
public static final ToIntFunction<ByteBuf> KEY_DESERIALIZER
public static final String EMPTY_KEY
public static final String UNKNOWN_KEY
public static final String DEBUG_CUBE_KEY
public static final String DEBUG_MODEL_KEY
public static final int EMPTY_ID
public static final BlockType EMPTY
public static final int UNKNOWN_ID
public static final BlockType UNKNOWN
public static final int DEBUG_CUBE_ID
public static final BlockType DEBUG_CUBE
public static final int DEBUG_MODEL_ID
public static final BlockType DEBUG_MODEL
public static final String TECHNICAL_BLOCK_GROUP
private static AssetStore<String,BlockType,BlockTypeAssetMap<String,BlockType>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected boolean unknown
protected String group
protected String blockListAssetId
protected String prefabListAssetId
protected String blockSoundSetId
protected transient int blockSoundSetIndex
protected ModelParticle[] particles
protected String blockParticleSetId
protected String blockBreakingDecalId
protected Color particleColor
protected TickProcedure tickProcedure
private RandomTickProcedure randomTickProcedure
protected ShaderType[] effect
protected BlockTypeTextures[] textures
protected String textureSideMask
protected ShadingMode cubeShadingMode
protected String customModel
protected CustomModelTexture[] customModelTexture
protected float customModelScale
protected String customModelAnimation
protected DrawType drawType
protected BlockMaterial material
protected Opacity opacity
protected boolean requiresAlphaBlending
protected Color[] tintUp
protected Color[] tintDown
protected Color[] tintNorth
protected Color[] tintSouth
protected Color[] tintWest
protected Color[] tintEast
protected int biomeTintUp
protected int biomeTintDown
protected int biomeTintNorth
protected int biomeTintSouth
protected int biomeTintWest
protected int biomeTintEast
protected BlockSupportsRequiredForType blockSupportsRequiredFor
protected RandomRotation randomRotation
protected VariantRotation variantRotation
protected BlockFlipType flipType
protected Rotation rotationYawPlacementOffset
protected RotatedMountPointsArray seats
protected RotatedMountPointsArray beds
protected String transitionTexture
protected String[] transitionToGroups
protected String transitionToTag
protected String hitboxType
protected transient int hitboxTypeIndex
protected String interactionHitboxType
protected transient int interactionHitboxTypeIndex
protected ColorLight light
protected BlockMovementSettings movementSettings
protected BlockFlags flags
protected String interactionHint
protected boolean isTrigger
protected boolean isDoor
protected int damageToEntities
protected boolean allowsMultipleUsers
protected ConnectedBlockRuleSet connectedBlockRuleSet
protected Bench bench
protected BlockGathering gathering
protected BlockPlacementSettings placementSettings
protected StateData state
protected String ambientSoundEventId
protected transient int ambientSoundEventIndex
protected String interactionSoundEventId
protected transient int interactionSoundEventIndex
protected boolean isLooping
protected Holder<ChunkStore> blockEntity
protected FarmingData farming
protected SupportDropType supportDropType
protected int maxSupportDistance
protected Map<BlockFace,RequiredBlockFaceSupport[]> support
protected transient Map<BlockFace,RequiredBlockFaceSupport[]>[] rotatedSupport
protected Map<BlockFace,BlockFaceSupport[]> supporting
protected transient Map<BlockFace,BlockFaceSupport[]>[] rotatedSupporting
protected boolean ignoreSupportWhenPlaced
protected Map<InteractionType,String> interactions
protected RailConfig railConfig
protected RailConfig[] rotatedRailConfig
protected String[] aliases
private transient String defaultStateKey
private transient SoftReference<com.hypixel.hytale.protocol.BlockType> cachedPacket
