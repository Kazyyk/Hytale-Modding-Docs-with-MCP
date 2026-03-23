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
