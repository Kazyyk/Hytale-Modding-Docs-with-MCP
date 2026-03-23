# ArgTypes

Type: class | Package: com.hypixel.hytale.server.core.command.system.arguments.types | Extends: java.lang.Object

public final class ArgTypes

Central registry of built-in command argument types. Provides static `SingleArgumentType` and `ArgumentType` instances for parsing common data types from command input, including: `BOOLEAN`, `INTEGER`, `LONG`, `FLOAT`, `DOUBLE`, `STRING`, `GREEDY_STRING`, `GAME_MODE`, `PLAYER`, `OFFLINE_PLAYER`, `WORLD`, `BLOCK_TYPE`, `ITEM`, `SOUND_EVENT`, `SOUND_CATEGORY`, `PARTICLE`, `ENVIRONMENT`, `WEATHER`, `AMBIENCE_FX`, `ENTITY_EFFECT`, `MODEL`, `INTERACTION`, `VECTOR3I`, `VECTOR3F`, `VECTOR2I`, `BLOCK_FILTER`, `BLOCK_MASK`, `BLOCK_PATTERN`, and more.

Each argument type provides parsing, tab-completion suggestions, and usage information.

## Related Types

- ArgumentType -- abstract base class for all argument types
- `AbstractCommand` -- commands use these types for parameter definitions

Also in this package: AbstractAssetArgumentType, ArgumentType, AssetArgumentType, BooleanFlagArgumentType, Coord, EntityWrappedArg, EnumArgumentType, GameModeArgumentType, IntCoord, IntegerComparisonOperator, IntegerOperation, ListArgumentType, MultiArgumentContext, MultiArgumentType, ProcessedArgumentType, RelativeChunkPosition, RelativeDirection, RelativeDoublePosition, RelativeFloat, RelativeIntPosition (and 5 more)

Complete API:
  public static SingleArgumentType<E> forEnum(String name, Class<E> enumType)

Fields:
public static final SingleArgumentType<Boolean> BOOLEAN
public static final SingleArgumentType<Integer> INTEGER
public static final SingleArgumentType<String> STRING
public static final SingleArgumentType<String> GREEDY_STRING
public static final SingleArgumentType<Float> FLOAT
public static final SingleArgumentType<Double> DOUBLE
public static final SingleArgumentType<UUID> UUID
public static final SingleArgumentType<UUID> PLAYER_UUID
public static final SingleArgumentType<CompletableFuture<ProfileServiceClient.PublicGameProfile>> GAME_PROFILE_LOOKUP_ASYNC
public static final SingleArgumentType<ProfileServiceClient.PublicGameProfile> GAME_PROFILE_LOOKUP
public static final SingleArgumentType<Coord> RELATIVE_DOUBLE_COORD
public static final SingleArgumentType<IntCoord> RELATIVE_INT_COORD
public static final SingleArgumentType<RelativeInteger> RELATIVE_INTEGER
public static final SingleArgumentType<RelativeFloat> RELATIVE_FLOAT
public static final SingleArgumentType<PlayerRef> PLAYER_REF
public static final SingleArgumentType<World> WORLD
public static final SingleArgumentType<ModelAsset> MODEL_ASSET
public static final SingleArgumentType<Weather> WEATHER_ASSET
public static final SingleArgumentType<Interaction> INTERACTION_ASSET
public static final SingleArgumentType<RootInteraction> ROOT_INTERACTION_ASSET
public static final SingleArgumentType<EntityEffect> EFFECT_ASSET
public static final SingleArgumentType<Environment> ENVIRONMENT_ASSET
public static final SingleArgumentType<Item> ITEM_ASSET
public static final SingleArgumentType<BlockType> BLOCK_TYPE_ASSET
public static final SingleArgumentType<ParticleSystem> PARTICLE_SYSTEM
public static final SingleArgumentType<HitboxCollisionConfig> HITBOX_COLLISION_CONFIG
public static final SingleArgumentType<RepulsionConfig> REPULSION_CONFIG
public static final SingleArgumentType<SoundEvent> SOUND_EVENT_ASSET
public static final SingleArgumentType<AmbienceFX> AMBIENCE_FX_ASSET
public static final SingleArgumentType<SoundCategory> SOUND_CATEGORY
public static final ArgWrapper<EntityWrappedArg,UUID> ENTITY_ID
public static final SingleArgumentType<ArgTypes.IntegerComparisonOperator> INTEGER_COMPARISON_OPERATOR
public static final SingleArgumentType<ArgTypes.IntegerOperation> INTEGER_OPERATION
public static final ArgumentType<Pair<Integer,Integer>> INT_RANGE
public static final ArgumentType<RelativeIntegerRange> RELATIVE_INT_RANGE
public static final ArgumentType<Vector2i> VECTOR2I
public static final ArgumentType<Vector3i> VECTOR3I
public static final ArgumentType<RelativeVector3i> RELATIVE_VECTOR3I
public static final ArgumentType<RelativeIntPosition> RELATIVE_BLOCK_POSITION
public static final ArgumentType<RelativeDoublePosition> RELATIVE_POSITION
public static final ArgumentType<RelativeChunkPosition> RELATIVE_CHUNK_POSITION
public static final ArgumentType<Vector3f> ROTATION
public static final SingleArgumentType<String> BLOCK_TYPE_KEY
public static final ArgumentType<Integer> BLOCK_ID
public static final SingleArgumentType<Integer> COLOR
public static final ArgumentType<Pair<Integer,String>> LAYER_ENTRY_TYPE
public static final ArgumentType<Pair<Integer,String>> WEIGHTED_BLOCK_TYPE
private static final ArgumentType<String> WEIGHTED_BLOCK_ENTRY
public static final ArgumentType<BlockPattern> BLOCK_PATTERN
private static final ArgumentType<BlockMask> INDIVIDUAL_BLOCK_MASK
public static final ArgumentType<BlockMask> BLOCK_MASK
public static final SingleArgumentType<Integer> TICK_RATE
public static final SingleArgumentType<GameMode> GAME_MODE
