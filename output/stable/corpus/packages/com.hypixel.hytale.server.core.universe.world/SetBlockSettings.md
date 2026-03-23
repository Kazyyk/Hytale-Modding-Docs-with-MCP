# SetBlockSettings

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class SetBlockSettings

Bitfield constants controlling block-set behavior. Flags can be combined with bitwise OR.

## Constants

- NONE | int | 0 | No flags.
- NO_NOTIFY | int | 1 | Suppress block change notifications.
- NO_UPDATE_STATE | int | 2 | Skip block state updates.
- NO_SEND_PARTICLES | int | 4 | Suppress break/place particles.
- NO_SET_FILLER | int | 8 | Do not set filler blocks.
- NO_BREAK_FILLER | int | 16 | Do not break existing filler blocks.
- PHYSICS | int | 32 | Enable physics on the placed block.
- FORCE_CHANGED | int | 64 | Force the block to be treated as changed.
- NO_UPDATE_NEIGHBOR_CONNECTIONS | int | 128 | Skip neighbor connection updates.
- PERFORM_BLOCK_UPDATE | int | 256 | Perform a block update after setting.
- NO_UPDATE_HEIGHTMAP | int | 512 | Skip heightmap recalculation.
- NO_SEND_AUDIO | int | 1024 | Suppress block audio.
- NO_DROP_ITEMS | int | 2048 | Do not drop items when breaking.

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Fields:
public static final int NONE
public static final int NO_NOTIFY
public static final int NO_UPDATE_STATE
public static final int NO_SEND_PARTICLES
public static final int NO_SET_FILLER
public static final int NO_BREAK_FILLER
public static final int PHYSICS
public static final int FORCE_CHANGED
public static final int NO_UPDATE_NEIGHBOR_CONNECTIONS
public static final int PERFORM_BLOCK_UPDATE
public static final int NO_UPDATE_HEIGHTMAP
public static final int NO_SEND_AUDIO
public static final int NO_DROP_ITEMS
